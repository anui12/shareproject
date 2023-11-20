package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class productPage {

	@FindBy(name="user_name")
	private WebElement username;
	
	@FindBy(name="user_password")
	private WebElement pass;
	
	@FindBy(id="submitButton")
	private WebElement click;
	
	@FindBy(xpath="//a[text()='Products']")
	private WebElement productlink;
	
	@FindBy(xpath="//img[@alt='Create Product...']")
	private WebElement plusbtn;
	
	@FindBy(name="productname")
	private WebElement productname;
	
	@FindBy(name="productcode")
	private WebElement procode;
	
	@FindBy(name="glacct")
	private WebElement drop;
	
	@FindBy(name="usageunit")
	private WebElement usageunit;
	
	@FindBy(xpath="(//input[@name='assigntype'])[2]")
	private WebElement handler;
	
	@FindBy(name="assigned_group_id")
	private WebElement group;
	
	@FindBy(id="my_file_element")
	private WebElement files;
	
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[2]")
	private WebElement save;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement logo;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signout;
	
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getClick() {
		return click;
	}
	public WebElement getProductlink() {
		return productlink;
	}
	public WebElement getPlusbtn() {
		return plusbtn;
	}
	public WebElement getProductname() {
		return productname;
	}
	public WebElement getProcode() {
		return procode;
	}
	public WebElement getDrop() {
		return drop;
	}
	public WebElement getUsageunit() {
		return usageunit;
	}
	public WebElement getHandler() {
		return handler;
	}
	public WebElement getGroup() {
		return group;
	}
	public WebElement getFiles() {
		return files;
	}
	public WebElement getSave() {
		return save;
	}
	public WebElement getLogo() {
		return logo;
	}
	public WebElement getSignout() {
		return signout;
	}
}
