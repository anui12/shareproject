package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrganizationPage {

	@FindBy(name="user_name")
	private WebElement username;
	
	@FindBy(name="user_password")
	private WebElement password;
	
	@FindBy(xpath="(//a[text()='Organizations'])[1]")
	private WebElement orglink;
	
	@FindBy(xpath="//img[@alt='Create Organization...']")
	private WebElement plusbtn;
	
	@FindBy(name="accountname")
	private WebElement orgname;
	
	@FindBy(id="submitButton")
	private WebElement loginbtn;
	
	@FindBy(id="phone")
	private WebElement phone;
	
	@FindBy(id="email1")
	private WebElement email;
	
	@FindBy(name="industry")
	private WebElement industry;
	
	@FindBy(name="rating")
	private WebElement rating;
	
	@FindBy(name="accounttype")
	private WebElement type;
	
	@FindBy(xpath="(//input[@name='assigntype'])[2]")
	private WebElement group;
	
	@FindBy(name="assigned_group_id")
	private WebElement assignto;
	
	@FindBy(xpath="(//input[@value=\"  Save  \"])[2]")
	private WebElement save;
	
	@FindBy(xpath="(//td[@class='small'])[2]")
	private WebElement logout;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signoutbtn;
	
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getOrglink() {
		return orglink;
	}
	public WebElement getPlusbtn() {
		return plusbtn;
	}
	public WebElement getOrgname() {
		return orgname;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	public WebElement getPhone() {
		return phone;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getIndustry() {
		return industry;
	}
	public WebElement getRating() {
		return rating;
	}
	public WebElement getType() {
		return type;
	}
	public WebElement getGroup() {
		return group;
	}
	public WebElement getAssignto() {
		return assignto;
	}
	public WebElement getSave() {
		return save;
	}
	public WebElement getLogout() {
		return logout;
	}
	public WebElement getSignoutbtn() {
		return signoutbtn;
	}
}
