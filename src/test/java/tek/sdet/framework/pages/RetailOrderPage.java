package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup {
	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(id = "orderLink")
	public WebElement orderMainButton;
	@FindBy(xpath = "//p[@class='order__header-btn']")
	public WebElement ShowDetailsORsSelectORder;
	@FindBy(xpath = "//button[@id='cancelBtn']")
	public WebElement cancelTheOrder;
	@FindBy(xpath = "//select[@id='reasonInput']")
	public WebElement cancelationReason;
	@FindBy(xpath = "//p[contains(text(),'Your Order Has ')]")
	public WebElement messageYourOrderDeleted;
	@FindBy(xpath = "//button[@id='orderSubmitBtn']")
	public WebElement cancelSubmition;
	@FindBy(xpath = "//button[@id='returnBtn' and text()='Return Items']")
	public WebElement returnbtn;
	@FindBy(id = "reasonInput")
	public WebElement returninput;
	@FindBy(id = "dropOffInput")
	public WebElement dropof;
	@FindBy(id = "orderSubmitBtn")
	public WebElement orderbtn;
	@FindBy(xpath = "//div[@class='return__confirm-message']")
	public WebElement retunmessage;
	@FindBy(id = "reviewBtn")
	public WebElement reviewBtn;
	@FindBy(id = "headlineInput")
	public WebElement headline;
	@FindBy(id = "descriptionInput")
	public WebElement write;
	@FindBy(id = "reviewSubmitBtn")
	public WebElement reviewbtn;
	@FindBy(xpath = "//div[text()='Your review was added successfully']")
	public WebElement reviewmessage;
	@FindBy(className = "order__header-number")
	public WebElement firstOrder;
	

}
