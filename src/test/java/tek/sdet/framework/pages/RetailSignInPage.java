package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailSignInPage extends BaseSetup {

	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(id = "signinLink")
	public WebElement signIn;
	@FindBy(id = "email")
	public WebElement emailFieldInSignInPage;
	@FindBy(css = "#password")
	public WebElement passwordFaildInSignInPage;
	@FindBy(xpath = "//button[text()='Login']")
	public WebElement loginButtonInSignInPage;
	@FindBy(id = "newAccountBtn")
	public WebElement createNewAccountButton;
	@FindBy(id = "nameInput")
	public WebElement nameValueInCreateNewAcc;
	@FindBy(id = "emailInput")
	public WebElement emailValueInCreateNewAcc;
	@FindBy(id = "passwordInput")
	public WebElement passwordValueInCreateNewAcc;
	@FindBy(id = "confirmPasswordInput")
	public WebElement confirmpasswordValueInCreateNewAcc;
	@FindBy(id = "signupBtn")
	public WebElement signupbuttonInCreateNewAcc;
	@FindBy(id = "newCompanyAccount")
	public WebElement wantToSellSomethingButton;
	@FindBy(xpath = "//input[@id='email']")
	public WebElement emailfaildInpageSellSomething;
	@FindBy(xpath = "//input[@id='password']")
	public WebElement passwordfaildInpageSellSomething;
	@FindBy(xpath = "//input[@id='nameInput']")
	public WebElement companyfaildInpageSellSomething;
	@FindBy(xpath = "//textarea[@id='descriptionInput']")
	public WebElement DescriptionfaildInpageSellSomething;
	@FindBy(xpath = "//input[@id='urlInput']")
	public WebElement urlfaildInpageSellSomething;
	@FindBy(xpath = "//button[@class=' signup__invalid signup__btn']")
	public WebElement createAccountButtInpageSellSomething;
	@FindBy(xpath = "//div[contains(text(),'Personal Information Updated Successfully')]")
	public WebElement updatemessageSuccessfully;
	
}
