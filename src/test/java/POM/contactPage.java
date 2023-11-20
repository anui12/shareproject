package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class contactPage {

	@FindBy(name="user_name")
	private WebElement nametf;
	
	@FindBy(name="user_password")
	private WebElement passtf;
	
	@FindBy(id="submitButton")
	private WebElement logintf;
	
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement contactlink;
	
	@FindBy(xpath="//img[@title='Create Contact...']")
	private WebElement plusbtn;
	
	@FindBy(name="salutationtype")
	private WebElement mrdrop;
	
	@FindBy(name="firstname")
	private WebElement firstNametf ;

	@FindBy(name="lastname")
	private WebElement lastNametf;
	
	@FindBy(name="phone")
	private WebElement phonetf;
	
	
	@FindBy(xpath="(//img[@alt=\"Select\"])[1]")
	private WebElement plusorgbtn;
	
	@FindBy(name="search_text")
	private WebElement searchtext;
	
	@FindBy(xpath="//input[@name='search']")
	private WebElement searchbtn;
	
	@FindBy(xpath="//a[@href='javascript:window.close();']")
	private WebElement link;
	
	@FindBy(id="mobile")
	private WebElement mobiletf;
	
	@FindBy(name="leadsource")
	private WebElement leaddrop;
	
	@FindBy(id="title")
	private WebElement titletf;
	
	@FindBy(id="department")
	private WebElement departmenttf;
	
	@FindBy(id="email")
	private WebElement emailtf;
	
	@FindBy(xpath="(//input[@name='assigntype'])[2]")
	private WebElement groupbtn;
	
	@FindBy(name="assigned_group_id")
	private WebElement groupdrop;
	
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
	private WebElement savebtn;
	
	@FindBy(xpath="(//td[@class='small'])[2]")
	private WebElement signoutbtn;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement logoutbtn;
	
	
	
	public WebElement getNametf() {
		return nametf;
	}

	public WebElement getPasstf() {
		return passtf;
	}

	public WebElement getLogintf() {
		return logintf;
	}
	
	public WebElement getContactlink() {
		return contactlink;
	}
	
	public WebElement getPlusbtn() {
		return plusbtn;
	}

	public WebElement getMrdrop() {
		return mrdrop;
	}
	
	public WebElement getFirstNametf() {
		return firstNametf;
	}

	public WebElement getLastNametf() {
		return lastNametf;
	}

	public WebElement getPhonetf() {
		return phonetf;
	}

	
	
	public WebElement getPlusorgbtn() {
		return plusorgbtn;
	}
	
	public WebElement getSearchtext() {
		return searchtext;
	}
	
	public WebElement getSearchbtn() {
		return searchbtn;
	}
	
	public WebElement getLink() {
		return link;
	}
	
	public WebElement getMobiletf() {
		return mobiletf;
	}
	
	public WebElement getLeaddrop() {
		return leaddrop;
	}

	public WebElement getTitletf() {
		return titletf;
	}

	public WebElement getDepartmenttf() {
		return departmenttf;
	}

	public WebElement getEmailtf() {
		return emailtf;
	}

	public WebElement getGroupbtn() {
		return groupbtn;
	}
	
	public WebElement getGroupdrop() {
		return groupdrop;
	}
	
	public WebElement getSavebtn() {
		return savebtn;
	}
	
	public WebElement getSignoutbtn() {
		return signoutbtn;
	}
	
	public WebElement getLogoutbtn() {
		return logoutbtn;
	}
}
