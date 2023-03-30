package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(id = "profileImage")
	public WebElement profileImage;
	@FindBy(xpath = "//input[@id='nameInput']")
	public WebElement nameFaildUpdateSection;
	@FindBy(xpath = "//input[@id='personalPhoneInput']")
	public WebElement phonenumberUpdateSection;
	@FindBy(xpath = "//input[@id='emailInput']")
	public WebElement emailUpdateSection;
	@FindBy(xpath = "//button[@id='personalUpdateBtn']")
	public WebElement updatebuttInUpdateSection;
	@FindBy(id = "previousPasswordInput")
	public WebElement previousPassword;
	@FindBy(id = "newPasswordInput")
	public WebElement newPassword;
	@FindBy(id = "confirmPasswordInput")
	public WebElement confirmPassword;
	@FindBy(id = "credentialsSubmitBtn")
	public WebElement changePasswordButt;
	@FindBy(id = "cardNumberInput")
	public WebElement cardNumber;
	@FindBy(id = "nameOnCardInput")
	public WebElement nameOFCardNumber;
	@FindBy(id = "expirationMonthInput")
	public WebElement expirationMonthInput;
	@FindBy(id = "expirationYearInput")
	public WebElement expirationYearInput;
	@FindBy(id = "securityCodeInput")
	public WebElement securityCodeInput;
	@FindBy(id = "paymentSubmitBtn")
	public WebElement addTOYourCardButt;
	@FindBy(xpath = "//p[text()='Add a payment method']")
	public WebElement addApaymentMethodOption;
	@FindBy(xpath = "//*[@class='account__address-new-icon']")
	public WebElement addAddressInAccountHomePage;
	@FindBy(id = "countryDropdown")
	public WebElement countryInputAddAddress;
	@FindBy(id = "fullNameInput")
	public WebElement fullNameInputAddAddress;
	@FindBy(id = "phoneNumberInput")
	public WebElement phoneNumberInputAddAddress;
	@FindBy(id = "streetInput")
	public WebElement streetInputAddAddress;
	@FindBy(id = "apartmentInput")
	public WebElement apartmentInputAddAdress;
	@FindBy(id = "cityInput")
	public WebElement cityInputAddAddress;
	@FindBy(xpath = "//select[@name='state']")
	public WebElement stateInputAddAddress;
	@FindBy(xpath = "//input[@id='zipCodeInput']")
	public WebElement zipCodeInputAddAddress;
	@FindBy(xpath = "//button[@id='addressBtn']")
	public WebElement AddYourAddressToSubmitAddingAddress;
	@FindBy(xpath = "//div[contains(text(),'Personal Information Updated Successfully')]")
	public WebElement updatemessageSuccessfully;
	@FindBy(xpath = "//div[@class='Toastify__toast-body']")
	public WebElement passwordUpdatedSuccessfully;
	@FindBy(xpath = "//div[contains(text(),'Payment Method added sucessfully')]")
	public WebElement paymentMethodaddedsuccessfully;
	@FindBy(xpath = "//button[contains(text(),'Edit')]")
	public WebElement editButton;
	@FindBy(xpath = "//div[text()='Payment Method updated Successfully']")
	public WebElement paymentupdatedSuccessfully;
	@FindBy(id = "paymentSubmitBtn")
	public WebElement updateYourCardButton;
	@FindBy(xpath = "//button[text()='remove']")
	public WebElement removeButtonRemivingCard;
	@FindBy(id = "")
	public WebElement mastercardAlreadyAdd;
	@FindBy(xpath = "//div[contains(text(),'Address Added Successfully')]")
	public WebElement addressAddedSuccessfullyMessage;
	@FindBy(xpath = "//button[contains(text(),'Edit')]")
	public WebElement editOptionForEdittingAddress;
	@FindBy(xpath = "//button[@id='addressBtn']")
	public WebElement updateYourAddressButtom;
	@FindBy(xpath = "//button[contains(text(),'Remove')]")
	public WebElement removeButtForREmovingAddress;
	@FindBy(xpath = "//div[@class='Toastify__toast-body']")
	public WebElement addressUPDATedSuccfully;

}
