package dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.http.params.CoreConnectionPNames;
import org.mariadb.jdbc.Statement;

import io.restassured.RestAssured;
import io.restassured.config.HttpClientConfig;
import io.restassured.config.RestAssuredConfig;

public class configReader {
	private Properties properties;
	private static configReader configReader;
	private RestAssuredConfig config;

    private configReader() {
		BufferedReader reader;
	    	String propertyFilePath = "configs//Configuration.properties";
	        try {
	            reader = new BufferedReader(new FileReader(propertyFilePath));
	            properties = new Properties();
	            try {
	                properties.load(reader);
	                reader.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
	        }		
	}

    public static configReader getInstance( ) {
    	if(configReader == null) {
    		configReader = new configReader();
    	}
        return configReader;
    }

    public String getBaseUrl() {
        String baseUrl = properties.getProperty("base_Url");
        if(baseUrl != null) return baseUrl;
        else throw new RuntimeException("base_Url not specified in the Configuration.properties file.");
    }

    public String dbconnection() {
    	Connection con = null;
        String driver = "org.mariadb.jdbc.Driver";
        String url1="jdbc:mariadb://127.0.0.1:5300/";
        String db = "demo";
        String dbUser = "root";
        String dbPasswd = "P@ssw0rd";
        String baseurl="";

    		try
    		{
            Class.forName(driver).newInstance();
            try {
				con = DriverManager.getConnection(url1+db, dbUser, dbPasswd);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
            System.out.println("Database Connection Established");
            String query = "SELECT * FROM testcase WHERE id='1'";
            try (Statement stmt = (Statement) con.createStatement()) {
              ResultSet rs = stmt.executeQuery(query);
              while (rs.next()) {
                baseurl = rs.getString("Baseurl");
                
                
              }
            }
              catch (Exception e)
              {
            	  System.out.println("unable to connect db");
              }
    		} catch (InstantiationException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
    		return baseurl;
			//Connection connection = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:5300/demo?user=root&password=P@ssw0rd");
		
    }
    public RestAssuredConfig apiWait()
    {
    	if(config==null)
    	{
    	config = RestAssured.config()
    			   .httpClient(HttpClientConfig.httpClientConfig()
    			       .setParam(CoreConnectionPNames.CONNECTION_TIMEOUT, 1000)
    			       .setParam(CoreConnectionPNames.SO_TIMEOUT, 1000));
    	}
    	return config;
    }

}