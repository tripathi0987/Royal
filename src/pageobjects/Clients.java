package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Clients"                                
, summary=""
, relativeUrl=""
, connection="SystemAdmin"
		)             
public class Clients {
	WebDriver driver;
	public Clients(WebDriver driver)
	{
		this.driver= driver;
	}	

	@FindBy(xpath="//span[text()='Managed External Referral ID']")
	public WebElement manageExtRefId;

	@TextType()
	@FindBy(xpath="//button[@name='Account.rbcpcb_NewPersonReferral'] | //a[@name='Account.rbcpcb_NewPersonReferral']/span")	
	public WebElement ClientNewReferral;

	@TextType()
	@FindBy(xpath = "//input[@name='Name']")
	public WebElement clientName;

	@FindBy(xpath = "//input[contains(@placeholder,'Search Clients')]")
	public WebElement clientParentAccount;
	
	@FindBy(xpath = "//a[normalize-space(.)='Clients']")
	public WebElement clients;

	public void setParentAccount(String name)
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", clientParentAccount);
		clientParentAccount.sendKeys(name);
		clientParentAccount.sendKeys(Keys.DOWN);
	}
	
	public void clickNewReferral()
	{
	driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon-border-filled']")).click();
	((JavascriptExecutor)driver).executeScript("arguments[0].click();", ClientNewReferral);
	}

	@LinkType()
	@FindBy(xpath = "//slot[@name='tabs']//span[@id='window']")
	public WebElement BCAccountManager;
	
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Profile Information']")
	public WebElement profileInformation;
	
	@FindBy(xpath="//input[@name ='lastName']")
	public WebElement clientLastName;

	@TextType()
	@FindBy(xpath = "//p[@class='p1']")
	public WebElement editPageTitle;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Save']")
	public WebElement save;

	@TextType()
	@FindBy(xpath = "//input[@name='PersonFirstNameLocal']")
	public WebElement preferredFirstName;

	@TextType()
	@FindBy(xpath = "//input[@name='PersonLastNameLocal']")
	public WebElement preferredLastName;

	@TextType()
	@FindBy(xpath = "//input[@name='PersonBirthdate']")
	public WebElement dateOfBirth;
	
	@FindBy(xpath="//button[@name='FinServ__Gender__pc']/span")
	public WebElement clientGender;
	
	@FindBy(xpath="//span[@title='Female']")
	public WebElement femalegen;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Overview']")
	public WebElement overview;
	
	@FindBy(xpath="//button[@name='FinServ__CustomerType__c']/span")
	public WebElement clientBusinessSegmentation;
	
	@FindBy(xpath="//span[@title='Small Business']")
	public WebElement smallBusiness;
	
	@FindBy(xpath="//button[@name='rbcpcb_BusinessSegmentationCode__c']/span")
	public WebElement businessSegmentationCode;
	
	@FindBy(xpath="//span[@title='Small Business - Professionals –510']")
	public WebElement businessSegCode;
	
	@FindBy(xpath="//input[@name='suffix']")
	public WebElement clientSuffix;
}


