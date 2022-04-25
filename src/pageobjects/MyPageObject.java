package pageobjects;


import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.google.common.base.Verify;
import com.provar.core.testapi.annotations.*;


@Page( title="MyPageObject"                                
, summary=""
, relativeUrl=""
, connection="Salesforce"
		)             
public class MyPageObject {

	WebDriver driver;
	public MyPageObject(WebDriver driver)
	{
		this.driver= driver;
	}
	@FindBy(xpath="//button[contains(@aria-label,'Priority')]/span")
	public WebElement leadPriority;

	@FindBy(xpath="//button[contains(@aria-label,'Branch')]/span")
	public WebElement leadBranch;

	@FindBy(xpath="//button[contains(@aria-label,'Role')]/span")
	public WebElement leadRole;

	@FindBy(xpath="//input[@name='rbcpcb_LeadStartDate__c']")
	public WebElement leadStartDate;

	@FindBy(xpath = "//records-record-layout-checkbox[@slot='inputField']//input[@name='rbcpcb_ManagedExternal__c']")
	public WebElement referralManagedExternalChkbox;

	@FindBy(xpath="//label[text()='Primary Contact']//parent::lightning-grouped-combobox//input")
	public WebElement BPPrimaryContact;

	@FindBy(xpath="//button[contains(@aria-label,'Business Segmentation Code') and @class='slds-combobox__input slds-input_faux slds-combobox__input-value']")
	public WebElement businessSegmentationCode;

	@FindBy(xpath="//input[@name='Name']")
	public WebElement BPAccountName;
	@FindBy(xpath="//a[@name='Account.rbcpcb_NewPersonReferral']/span")
	public WebElement PCAccountNewreferral;

	@FindBy(xpath="//button[contains(@aria-label,'Source')]")
	public WebElement accountSource;

	@FindBy(xpath="//span[@class='countSortedByFilteredBy']")
	public WebElement filterSortText;

	@FindBy(xpath="//span[@title='Subject']")
	public WebElement activitySubjectHeader;

	@FindBy(xpath="//span[@title='Name']")
	public WebElement activityNameHeader;

	@FindBy(xpath="//span[@title='Related To']")
	public WebElement activityRelatedToHeader;

	@FindBy(xpath="//span[@title='Due Date' and @class='slds-truncate']")
	public WebElement activityDueDateHeader;

	@FindBy(xpath="//li[@class='slds-dropdown__item grid']/a")
	public WebElement tableView;

	@FindBy(xpath="//button[@title='Display as Split View']")
	public WebElement changeTableView;

	@FindBy(xpath="(//div[@class='primaryLabel slds-truncate slds-lookup__result-text']/mark)[1]")
	public WebElement nameActivity;

	@FindBy(xpath="//div[@class='taskStatusCheckbox slds-media__figure']//preceding-sibling::span[@class='slds-checkbox--faux']")
	public WebElement followUpChkbox;

	@FindBy(xpath="//li[@class='slds-breadcrumb__item slds-line-height--reset']/a[contains(@href,'view')]")
	public WebElement accViewName;

	@FindBy(xpath="//span[text()='External Referrer']//ancestor::div//input[contains(@placeholder,'Search Contacts')]")
	public WebElement extReferrerReferral;

	@FindBy(xpath="//span[@title='BNS']")
	public WebElement bns;

	@FindBy(xpath ="//button[@title='Move selection to Chosen']")
	public WebElement arrow;

	@TextType()
	@FindBy(xpath="(//div[@class='slds-var-m-right_small dueDate'])[2]")
	public WebElement dueDate;

	@FindBy(xpath="//a[@class='subjectLink slds-truncate' and @title='Activity (Call)']")
	public WebElement createdActivity;

	@FindBy(xpath="//button[contains(@aria-label,'Reason For Unqualification')]")
	public WebElement reasonForUnqualification;

	@FindBy(xpath="//button[contains(@aria-label,'Lost To Competitor')]")
	public WebElement lostToCompetitor;

	@FindBy(xpath="//span[text()='External Referrer']//ancestor::div[@class='uiInput forceSearchInputLookupDesktop uiInput--default']//input[@title='Search Contacts'] |  //label[text()='External Referrer']//parent::lightning-grouped-combobox//input[contains(@placeholder,'Search Contacts')]")
	public WebElement externalReferrer;

	@FindBy(xpath ="//input[@class='slds-input' and @name ='Email']")
	public WebElement LnREmail;

	@FindBy(xpath="//span[text()='Follow Up Date']")
	public WebElement activityFollowUpDate;  

	@FindBy(xpath="//span[text()='Schedule Follow Up']")
	public WebElement activityScheduleFollowUp;

	@FindBy(xpath="//span[text()='Name']")
	public WebElement activityName;	

	@FindBy(xpath="//span[text()='Related To']")
	public WebElement activityRelatedTo;	

	@FindBy(xpath="//span[text()='Comments']")
	public WebElement activityComments;	

	@FindBy(xpath="//span[text()='Purpose']")
	public WebElement activityPurpose;

	@FindBy(xpath="//span[text()='Client Activity']")
	public WebElement activityClientActivity;

	@FindBy(xpath="//label[@class='slds-form-element__label']")
	public WebElement activitySubject;

	@FindBy(xpath="//button[@title='Edit Account Manager Name']//span[@class='inline-edit-trigger-icon slds-button__icon slds-button__icon_hint']")
	public WebElement editAccManagerName;

	@FindBy(xpath="//a[@id='detailTab__item']")
	public WebElement accDetailsTab;

	@FindBy(xpath="//span[@title='Account Name']")
	public WebElement accTableName;

	@FindBy(xpath="(//li[@class='slds-breadcrumb__item slds-line-height--reset']/a)[2]")
	public WebElement accName;

	@FindBy(xpath="//button[@name='Account.rbcpcb_NewPersonReferral'] | //button[@name='Account.New_Referral'] | //a[@name='Account.rbcpcb_NewPersonReferral']/span")
	public WebElement accNewReferral;

	@FindBy(xpath="(//input[@placeholder='Search Address'])[1]")
	public WebElement accSearchAddress;

	@FindBy(xpath="//input[@name='FinServ__CurrentEmployer__pc']")
	public WebElement accEmployer;

	@FindBy(xpath="//input[@name='Phone'] | //input[@name='MobilePhone']")
	public WebElement accPrimaryPhone;

	@FindBy(xpath="//button[contains(@aria-label,'Pronouns')]")
	public WebElement accPronouns;

	@FindBy(xpath="//input[@name='rbcpcb_Email__c'] | //input[@class='slds-input' and @name ='Email']")
	public WebElement accPrimaryEmail;

	@FindBy(xpath="//button[contains(@aria-label,'Preferred Language')]")
	public WebElement accPrefLanguage;

	@FindBy(xpath="//button[@name='Account.New_Lead'] | //button[@name='Account.rbcpcb_NewPersonLead']")
	public WebElement accNewLead;

	@FindBy(xpath="//span[@title='Account Record Type']")
	public WebElement accountRecordType;

	@FindBy(xpath="//input[@name='firstName']")
	public WebElement accFirstName;

	@FindBy(xpath="//input[@name='lastName']")
	public WebElement accLastName;

	@FindBy(xpath="//button[@class='slds-button slds-button_neutral' and text()='Edit']")
	public WebElement editBtn;

	@FindBy(xpath="//button[contains(@aria-label,'Lead & Referral Status')]")
	public WebElement leadRefSrc;

	@FindBy(xpath="//button[@class='slds-button slds-button_icon-border-filled']")
	public WebElement ChangeOwnerDrpdwn;

	@FindBy(xpath="//span[@class='slds-truncate' and text()='Change Owner']")
	public WebElement ChangeOwnerBtn;

	@FindBy(xpath="//input[@class='default input uiInput uiInputTextForAutocomplete uiInput--default uiInput--input uiInput uiAutocomplete uiInput--default uiInput--lookup']")
	public WebElement InputOwner;

	@FindBy(xpath="(//div[@class='slds-m-left--smalllabels slds-truncate slds-media__body'])[2]")
	public WebElement OwnerResult;

	@FindBy(xpath="//button[@title='Close error dialog']")
	public WebElement closebutton;


	@FindBy(xpath="//button[@class='slds-button slds-button_brand']")
	public WebElement savebutton;

	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='App Launcher']")
	public WebElement appLauncher;
	@LinkType()
	@FindBy(xpath = "//span[@class='slds-truncate' and text()='Leads & Referrals']")
	public WebElement leadsAndReferrals;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Sales']")
	public WebElement sales;


	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Save']")
	public WebElement save;

	@FindBy(xpath="//button[contains(@aria-label,'Lead & Referral Status')]")
	public WebElement leadnRefStatus;

	@FindBy(xpath="//input[@name='lastName']")
	public WebElement leadLastName;

	@FindBy(xpath ="//input[@class='slds-input' and @name ='firstName']")
	public WebElement LeadFirstName;

	@FindBy(xpath="//input[@id='username']")
	public WebElement loginUsrName;

	@FindBy(xpath="//input[@id='password']")
	public WebElement loginPwd;

	@FindBy(xpath="//input[@id='Login']")
	public WebElement loginBtn;

	@FindBy(xpath="//a[@title='My Open Leads']")
	public WebElement myOpenLeadsReport;

	@FindBy(xpath="//span[@title='Created Date']")
	public WebElement sortCreatedDate;

	@FindBy(xpath="//button[@name='ChangeOwnerOne']")
	public WebElement changeOwnerButton;

	@FindBy(xpath="//p[@title='Lead & Referral Owner']//parent::div//span[contains(@data-proxy-id,'aura-pos')]")
	public WebElement ownerId;

	@TextType()
	@FindBy(xpath="(//th[@title='Name']//span[text()='Name'])[2]")
	public WebElement activityNameHeaderBFS;

	@FindBy(xpath="//h2[@class='recordTitle slds-page-header__title slds-card__header-link slds-truncate slds-m-vertical_xxx-small']//a[@data-refid='recordId']")
	public WebElement accSearchName;

	public void enterAdditionalLeadDetails(String Priority,String role,String branch) throws Exception
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", leadPriority);
		leadPriority.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='"+Priority+"']")).click();
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", leadRole);
		leadRole.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='"+role+"']")).click();
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", leadStartDate);
		leadStartDate.click();
		Thread.sleep(1000);
		leadStartDate.sendKeys("4/1/2022");
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", leadBranch);
		leadBranch.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='"+branch+"']")).click();
		
	}


	public void globalSearchReferral(String refName) throws Exception
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", searchLeadsAndReferralsAndMore);
		Thread.sleep(1000);
		WebElement search = driver.findElement(By.xpath("//label[text()='Search Clients and more']//parent::lightning-input//input[contains(@placeholder,'Search Clients and more')] |//label[text()='Search Leads & Referrals and more']//parent::lightning-input//input[contains(@placeholder,'Search Leads & Referrals and more')]"));
		Thread.sleep(1000);
		search.sendKeys(refName);
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", showMoreResult);
		Thread.sleep(1000);

	}

	public int checkTable()
	{
		int val=0;
		List<WebElement> lis = driver.findElements(By.xpath("//button[@title='Display as Split View']"));
		if(lis.size()>0)
			val=1;
		else
			val=0;
		return val;

	}


	public void accountCreation(String firstname,String lastname,String email,String phone, String addressSearch) throws Exception
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		accFirstName.sendKeys(firstname);
		accLastName.sendKeys(lastname);
		List<WebElement> mail= driver.findElements(By.xpath("//input[@name='rbcpcb_Email__c']"));
		if(mail.size()>0){
			js.executeScript("arguments[0].scrollIntoView(true);", accPrimaryEmail);
			accPrimaryEmail.sendKeys(email);}

		js.executeScript("arguments[0].scrollIntoView(true);", accPrimaryPhone);
		accPrimaryPhone.sendKeys(phone);

		List<WebElement> address= driver.findElements(By.xpath("(//input[@placeholder='Search Address'])[1]"));
		if(address.size()>0){
			js.executeScript("arguments[0].scrollIntoView(true);", accSearchAddress);
			accSearchAddress.sendKeys(addressSearch);
			accSearchAddress.sendKeys(Keys.chord(Keys.DOWN,Keys.DOWN));
			accSearchAddress.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
		}
		js.executeScript("arguments[0].scrollIntoView(true);", accPronouns);
		accPronouns.click();
		accPronouns.sendKeys(Keys.DOWN);
		accPronouns.sendKeys(Keys.ENTER);
		Thread.sleep(1000);


		js.executeScript("arguments[0].scrollIntoView(true);", accEmployer);
		accEmployer.sendKeys("RBC");
		Thread.sleep(2000);

		js.executeScript("arguments[0].scrollIntoView(true);", accPrefLanguage);
		accPrefLanguage.click();
		accPrefLanguage.sendKeys(Keys.DOWN);
		accPrefLanguage.sendKeys(Keys.DOWN);
		accPrefLanguage.sendKeys(Keys.ENTER);
		Thread.sleep(1000);

		List<WebElement> lis1 = driver.findElements(By.xpath("//button[contains(@aria-label,'Source')]"));
		if(lis1.size()>0)
		{
			js.executeScript("arguments[0].scrollIntoView(true);", accountSource);
			accountSource.click();
			driver.findElement(By.xpath("//span[@class='slds-truncate' and text()='Web']")).click();
		}
	}

	public void setExternalReferrer(String ref) throws Exception
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", externalReferrer);
		externalReferrer.sendKeys(ref);
		Thread.sleep(1000);
		List<WebElement> lis= driver.findElements(By.xpath("//span[@class='slds-listbox__option-text slds-listbox__option-text_entity']//lightning-base-combobox-formatted-text[@class='slds-truncate']"));
		externalReferrer.click();
		externalReferrer.sendKeys(Keys.BACK_SPACE);
		externalReferrer.sendKeys(lis.get(0).getAttribute("title"));
		Thread.sleep(2000);
		externalReferrer.sendKeys(Keys.DOWN);
		externalReferrer.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}

	public void setExternalReferrerReferral(String ref) throws Exception
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", externalReferrer);
		externalReferrer.sendKeys(ref);
		Thread.sleep(1000);
		List<WebElement> lis= driver.findElements(By.xpath("//div[@class='primaryLabel slds-truncate slds-lookup__result-text']"));
		externalReferrer.click();
		externalReferrer.sendKeys(Keys.BACK_SPACE);
		externalReferrer.sendKeys(lis.get(0).getAttribute("innerText"));
		Thread.sleep(2000);
		/*externalReferrer.sendKeys(Keys.DOWN);
		externalReferrer.sendKeys(Keys.ENTER);*/
	}

	public int uiCheck(String xpath, String attribute, String val)
	{
		int flag=0;
		String expected = driver.findElement(By.xpath(xpath)).getAttribute(attribute);
		if(val.equalsIgnoreCase(expected))
			flag=1;
		else 
			flag=0;
		return flag;

	}

	public void saveAndcloseDialog() throws Exception
	{
		Thread.sleep(1000);
		driver.findElement(By.tagName("html")).sendKeys(Keys.ESCAPE);
		Thread.sleep(1000);
	}

	public void enterDetailsForPersonLead(String Firstname, String Lastname, String Email, String phone) throws Exception
	{
		WebElement firstname = driver.findElement(By.xpath("//input[@class='slds-input' and @name ='firstName']"));
		WebElement lastname = driver.findElement(By.xpath("//input[@class='slds-input' and @name ='lastName']"));
		WebElement email = driver.findElement(By.xpath("//input[@class='slds-input' and @name ='Email']"));
		WebElement phonenum = driver.findElement(By.xpath("//input[@name='MobilePhone' and @class='slds-input']"));
		WebElement LeadRefSrc = driver.findElement(By.xpath("//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value' and contains(@aria-label,'Lead & Referral Source')]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", firstname);
		//	WebElement company =driver.findElement(By.xpath("//input[@name='Company']"));
		firstname.click();
		firstname.sendKeys(Firstname);
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", lastname);
		lastname.click();
		lastname.sendKeys(Lastname);
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", email);
		email.click();
		email.sendKeys(Email);
		Thread.sleep(1000);
		phonenum.sendKeys(phone);
		//company.sendKeys("RBC");
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", LeadRefSrc);
		LeadRefSrc.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='slds-truncate' and text()='Web']")).click();
		Thread.sleep(2000);
		WebElement slot = driver.findElement(By.xpath("(//ul[@class='slds-button-group-row']//runtime_platform_actions-executor-lwc-headless)[3]"));
		WebElement savebtn = slot.findElement(By.xpath("//button[@class='slds-button slds-button_brand']"));
		savebtn.click();
		Thread.sleep(2000);
	}

	public void enterDetailsForPersonReferral(String Firstname, String Lastname, String Email, String Mobile) throws Exception

	{
		WebElement firstname = driver.findElement(By.xpath("//input[@class='slds-input' and @name ='firstName']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", firstname);
		firstname.click();
		firstname.sendKeys(Firstname);
		Thread.sleep(1000);
		WebElement lastname = driver.findElement(By.xpath("//input[@class='slds-input' and @name ='lastName']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", lastname);
		lastname.click();
		lastname.sendKeys(Lastname);
		Thread.sleep(1000);
		WebElement email = driver.findElement(By.xpath("//input[@class='slds-input' and @name ='Email']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", email);
		email.click();
		email.sendKeys(Email);
		Thread.sleep(1000);
		WebElement rating = driver.findElement(By.xpath("//button[contains(@aria-label,'Rating')]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", rating);
		rating.click();
		rating.sendKeys(Keys.DOWN);
		rating.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		WebElement mobile = driver.findElement(By.xpath("//input[@class='slds-input' and @name ='MobilePhone']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", mobile);
		mobile.click();
		mobile.sendKeys(Mobile);



	}

	public void changeLeadnReferralStatus(String Prevstatus, String Currstatus) throws Exception
	{
		int val1 =0; 
		int val2 =0;
		int count =0;
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", leadnRefStatus);
		Thread.sleep(1000);
		leadnRefStatus.click();
		Thread.sleep(2000);
		if(Prevstatus.equalsIgnoreCase("New"))
			val1 =0;
		else if(Prevstatus.equalsIgnoreCase("Working"))
			val1 =1;
		else if(Prevstatus.equalsIgnoreCase("Qualified"))
			val1 =2;
		if(Currstatus.equalsIgnoreCase("Working"))
			val2 =1;
		else if(Currstatus.equalsIgnoreCase("Qualified"))
			val2 =2;
		else if(Currstatus.equalsIgnoreCase("Unqualified"))
			val2 =3;

		count= (val2-val1);
		while(count>0)
		{
			leadnRefStatus.sendKeys(Keys.DOWN);
			count--;
		}
		leadnRefStatus.sendKeys(Keys.ENTER);
		savebutton.click();
		Thread.sleep(2000);
	}


	public  void validateErroMsg(String Msg)
	{
		String cmpltTxt = null;
		List<WebElement> lis = driver.findElements(By.xpath("//div[@class='fieldLevelErrors']//a"));
		for(WebElement ele:lis)
		{
			String text = ele.getAttribute("innerText");
			cmpltTxt = cmpltTxt+text+" ";
		}
		String Error = ("Review the following fields "+cmpltTxt).trim();
		System.out.println("Error is "+Error);

		Verify.verify(Error.equalsIgnoreCase(Msg));
	}

	public void lostTOCmptr()
	{
		WebElement lstCmptr =driver.findElement(By.xpath("//div[text()='Lost To Competitor']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", lstCmptr);
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", bns);
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", arrow);

	}

	public void selectManagedExtRef() throws Exception
	{
		WebElement ele = driver.findElement(By.xpath("//span[ttext()='Managed External']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", ele);
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", ele);
	}

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Name']")
	public WebElement name;

	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='View profile']")
	public WebElement viewProfile;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Log Out']")
	public WebElement logOut;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Reports']")
	public WebElement reports;

	@PageFrame()
	public static class Frame {

		@TextType()
		@FindBy(xpath = "//label[normalize-space(.)='Select row for Drill Down.']/parent::span/parent::div/parent::div/following-sibling::div//label")
		public WebElement reportLeadNReferral;
	}

	@FindBy(xpath = "//iframe[contains(@class, \"isView\")]")
	public Frame frame;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Home']")
	public WebElement home;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Accounts']")
	public WebElement accounts;


	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[@id='combobox-button-369']")
	public WebElement none;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[@id='combobox-button-377']")
	public WebElement heHimHis;

	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[@id='combobox-button-377']")
	public WebElement Pronoun;

	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//p[normalize-space(.)='SRF Number']")
	public WebElement sRFNumber;

	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//p[normalize-space(.)='RBC Loyalty']")
	public WebElement rBCLoyalty;

	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//p[normalize-space(.)='Client Card Entitlement']")
	public WebElement clientCardEntitlement;

	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//p[normalize-space(.)='Last Interaction']")
	public WebElement lastInteraction;

	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//p[normalize-space(.)='Credit Risk Index (CRI)']")
	public WebElement creditRiskIndexCRI;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Add']")
	public WebElement addActivity;

	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Type']")
	public WebElement typeActivity;

	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//label[normalize-space(.)='*Subject']")
	public WebElement Subject;

	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@id='combobox-input-405']")
	public WebElement FinServ__ReferredByContact__c;

	@TextType()
	@FindBy(xpath = "//button[@aria-label='Search']")
	public WebElement searchLeadsAndReferralsAndMore;

	@TextType()
	@FindBy(xpath = "//lightning-formatted-rich-text[@class='primary slds-truncate slds-rich-text-editor__output']//span/mark[@class='data-match']")
	public WebElement leadnReferralName;

	@TextType()
	@FindBy(xpath = "//label[text()='Description']//parent::lightning-textarea//textarea")
	public WebElement description;

	@TextType()
	@FindBy(xpath = "//span[text()='Description']//ancestor::div[@class='slds-form-element slds-hint-parent test-id__output-root slds-form-element_edit slds-form-element_readonly slds-form-element_stacked']//lightning-formatted-text[@slot='outputField']")
	public WebElement descriptionLead;

	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Name']")
	public WebElement leadListName;

	@LinkType()
	@FindBy(xpath = "//span[@title='Lead & Referral Record Type']")
	public WebElement leadListRecordTypeId;

	@LinkType()
	@FindBy(xpath = "//span[@title='Prospect Email']")
	public WebElement leadlistEmail;

	@LinkType()
	@FindBy(xpath = "//span[@title='Lead & Referral Status']")
	public WebElement leadListStatus;

	@LinkType()
	@FindBy(xpath = "//span[@title='Expressed Interest']")
	public WebElement listLeadExpressedInterest;

	@LinkType()
	@FindBy(xpath = "//span[@title='Rating']")
	public WebElement listLeadRating;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Leads & Referrals']")
	public WebElement leadsAndReferrals1;

	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Qualified']")
	public WebElement PathAssistantStep_Qualified;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Change Converted Lead & Referral Status']")
	public WebElement PathAssistantStep_ChangeConvertedStatus;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[@id='combobox-button-540']")
	public WebElement Lost_To_Competitor;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Mark Lead & Referral Status as Complete']")
	public WebElement PathAssistantStep_MarkStatusAsComplete;

	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[@id='combobox-button-544']")
	public WebElement Lost_To_Competitor1;

	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//span[normalize-space(.)='Owner cannot be changed once lead is in Qualified or Unqualified status.']")
	public WebElement ownerCannotBeChangedOnceLeadIsInQualifiedOrUnqualifiedStatusPickAnObjectSearchUsersAshishBalureInUsersRetailUserQARetailManagerBFSUserQAEricHarperEvaGamboaLoadingNewUserShowMoreAshishBalurePressDeleteToRemoveEnterNewOwnerNameSendNotificationEmailAshishBalureWillAlsoBecomeTheOwnerOfTheseRecordsRelatedToHXCMCSDTEACCMattThatAreOwnedByHarikaChintaNotesAndAttachmentsOpenActivities;

	@TextType()
	@FindBy(xpath = "//input[contains(@placeholder,'Search')]")
	public WebElement globalSearch;

	@FindBy(xpath ="//lightning-formatted-rich-text[@class='primary slds-truncate slds-rich-text-editor__output']")
	public WebElement searchResult;

	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[@id='relatedListsTab__item']")
	public WebElement relatedAccount;

	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='New Activity (Call)']")
	public WebElement newActivity;

	@FindBy(xpath="//lightning-formatted-rich-text/span[contains(normalize-space(.),'Show more results for')]")
	public WebElement showMoreResult;

	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@aria-label='Other State/Province']")
	public WebElement otherStateProvince;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Tasks']")
	public WebElement tasks;

	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//li//span[normalize-space(.)='Due Date']")
	public WebElement ActivityDate;

	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//li//span[normalize-space(.)='Status']")
	public WebElement status;

	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//li//span[normalize-space(.)='Assigned To']")
	public WebElement assignedTo;

	@TextType()
	@FindBy(xpath = "//span[@title='Assigned To']/text()")
	public WebElement assignedToHeader;

	@LinkType()
	@FindBy(linkText = "Table")
	public WebElement table;

	@FindBy(xpath = "//a[@aria-label='View All Tasks']//span[@class='viewAllLabel']")
	public WebElement viewAllTask;

	@FindBy(xpath="//div[@title='Edit']")
	public WebElement editTask;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Clients']")
	public WebElement clients;

	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//label[normalize-space(.)='Prospect Mobile']/following-sibling::input")
	public WebElement prospectMobile;

	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//label[normalize-space(.)='Internal Referrer']/following-sibling::div//input")
	public WebElement internalReferrer;

	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//li[normalize-space(.)='Enter an internal referrer or an external referrer. You can list only one referrer for each referral.']")
	public WebElement externalReferrer1;

	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Politically Exposed Details']")
	public WebElement rbcpcb_PoliticallyExposedDetails__pc;

	@TextType()
	@FindBy(xpath = "//input[@name='MobilePhone']")
	public WebElement LnRMobilePhone;

	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='SortExternal Referral Sent To Individual']")
	public WebElement rbcpcb_ExternalReferralSentToIndividual__c;

	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='SortExternal Referral Sent To Business']")
	public WebElement rbcpcb_ExternalReferralSentToBusiness__c;
	@FindBy(xpath = "//input[@name='Company']")
	public WebElement leadCompany;

	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Source of Wealth Description']")
	public WebElement rbcpcb_SourceofWealthDescription__pc;

	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Source of Wealth']")
	public WebElement rbcpcb_SourceofWealth__pc;

	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Primary Mailing Address']")
	public WebElement BillingAddress;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Edit Primary Phone']")
	public WebElement Phone;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Edit Politically Exposed?']")
	public WebElement rbcpcb_PoliticallyExposed__pc;

	@TextType()
	@FindBy(xpath = "//a[@data-label='Details']")
	public WebElement referralDetailsTab;

	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[@id='activityTab__item']")
	public WebElement leadActivityTab;

	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='New Task']")
	public WebElement leadNewTask;

	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//label[normalize-space(.)='Prospect Email']/following-sibling::input")
	public WebElement leadProspectEmail;

	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//lightning-formatted-name")
	public WebElement pageTitle;

	@TextType()
	@FindBy(xpath = "//label[text()='Lead Start Date']")
	public WebElement leadStartLabel;

	@TextType()
	@FindBy(xpath = "//label[text()='Role']")
	public WebElement roleHeader;

	@TextType()
	@FindBy(xpath = "//label[text()='Branch (Transit Number)']")
	public WebElement transitNumberHeader;

	@TextType()
	@FindBy(xpath = "//label[text()='Priority']")
	public WebElement priorityHeader;

	@ChoiceListType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//select")
	public WebElement beyondBankingReferralDropdown;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Next']")
	public WebElement beyondBankingnextButton;

	@ChoiceListType()
	@FindBy(xpath = "(//div[@class='slds-form-element flowruntimeDependentPicklists_deprecated']//select)[2]")
	public WebElement referralTemplateddrpdwn;

	@LinkType()
	@FindBy(xpath = "//lightning-formatted-rich-text[@class='slds-rich-text-editor__output']//a")
	public WebElement beyondBankingReferralLink;

	@BooleanType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//label/span[1]")
	public WebElement referralSubmittedCheckbox;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Previous']")
	public WebElement previousBBRbutton;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Complete']")
	public WebElement completeBBRbutton;

	@LinkType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//a[normalize-space(.)='https://ampli.ca/how-it-works/']")
	public WebElement httpsAmpliCaHowItWorks;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Edit Life Status']")
	public WebElement editLifeStatus;

	@LinkType()
	@FindBy(xpath = "//span[@title='Conversion DateTime']")
	public WebElement leadConversionTimelist;

	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='No items to display.']")
	public WebElement noItemsDisplay;


}
