package pom;

import org.openqa.selenium.By;

public class JsonPlaceHolder extends BaseAction{
	
	public By runscript=By.xpath("//button[@id='run-button']");
	public By tokenstring=By.xpath("//code[@id='result']/span[@class='token string']");
	public By posts=By.linkText("/posts");
	public By comments=By.linkText("/comments");
	public By albums=By.linkText("/albums");
	public By photos=By.linkText("/photos");
	public By todos=By.linkText("/todos");
	public By users=By.linkText("/users");
	public By getpost=By.linkText("/posts");
	public By getpost1=By.linkText("/posts/1");
	public By getpostcomments=By.linkText("/posts/1/comments");
	public By getcomments=By.linkText("/comments?postId=1");
	public By validationres=By.xpath("//pre[@style='word-wrap: break-word; white-space: pre-wrap;']");

}
