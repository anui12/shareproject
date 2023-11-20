package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpportunitiesPage {

	@FindBy(name="user_name")
	private WebElement Username;
	
	@FindBy(name="user_password")
	private WebElement Password;
	
	@FindBy(id="submitButton")
	private WebElement login;
	
	@FindBy(xpath="(//a[text()='Opportunities'])[1]")
	private WebElement opplink;
	
	@FindBy(xpath="//img[@alt=\"Create Opportunity...\"]")
	private WebElement plusbtn;
	
	@FindBy(name="potentialname")
	private WebElement orgName;
	
	@FindBy(id="related_to_type")
	private WebElement relatedto;
	
	@FindBy(xpath="(//img[@alt=\"Select\"])[1]")
	private WebElement plus;
	
	@FindBy(name="search_text")
	private WebElement searchtext;
	
	@FindBy(name="search")
	private WebElement searchbtn;
	
	@FindBy(xpath="(//a[@href=\"javascript:window.close();\"])[1]")
	private WebElement find;
	
	@FindBy(name="opportunity_type")
	private WebElement type;
	
	@FindBy(name="leadsource")
	private WebElement lead;
	
	@FindBy(id="nextstep")
	private WebElement nextstep;
	
	@FindBy(name="sales_stage")
	private WebElement sales;
	
	@FindBy(xpath="//textarea[@class=\"detailedViewTextBox\"]")
	private WebElement description;
	
	@FindBy(xpath="(//td[@class=\"small\"])[2]")
	private WebElement saveimg;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signout;
	
	public WebElement getUsername() {
		return Username;
	}
	public WebElement getPassword() {
		return Password;
	}
	public WebElement getLogin() {
		return login;
	}
	public WebElement getOpplink() {
		return opplink;
	}
	public WebElement getPlusbtn() {
		return plusbtn;
	}
	public WebElement getOrgName() {
		return orgName;
	}
	public WebElement getRelatedto() {
		return relatedto;
	}
	public WebElement getPlus() {
		return plus;
	}
	public WebElement getSearchtext() {
		return searchtext;
	}
	public WebElement getSearchbtn() {
		return searchbtn;
	}
	public WebElement getFind() {
		return find;
	}
	public WebElement getType() {
		return type;
	}
	public WebElement getLead() {
		return lead;
	}
	public WebElement getNextstep() {
		return nextstep;
	}
	public WebElement getSales() {
		return sales;
	}
	public WebElement getDescription() {
		return description;
	}
	public WebElement getSaveimg() {
		return saveimg;
	}
	public WebElement getSignout() {
		return signout;
	}
}