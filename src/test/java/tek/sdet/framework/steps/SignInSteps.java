package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;
import org.junit.Assert;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class SignInSteps extends CommonUtility {
	POMFactory factory = new POMFactory();

	
	@When("User click on sign in option")
	public void userClickonSignInButton() {
		click(factory.signInPage().signIn);
		logger.info("user click on sign in option");
	}
	@And("User enter email {string} and password {string}")
	public void enterEmailAnsPass(String emailValue, String passValue) {
		sendText(factory.signInPage().emailFieldInSignInPage, emailValue);
		sendText(factory.signInPage().passwordFaildInSignInPage, passValue);
		logger.info("user entered email and password");
	}
	@And("User click on login button")
	public void clickOnLoginButt() {
		click(factory.signInPage().loginButtonInSignInPage);
		logger.info("user click on sign in button");
	}
	@Then("User should be logged in into Account")
	public void userShouldBeLogin() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().accountOption));
		logger.info("user should be in home page");
	}
	@Then("User click on log out button")
	public void loggingout() {
		click(factory.homePage().logoutoption);
		logger.info("user logged out");
	}
	
	@And("User click on Create New Account button")
	public void userClickOnNewAcc() {
		click(factory.signInPage().createNewAccountButton);
		logger.info("user clicked on new account");
	}
	@And("User fill the signUp information with below data")
	public void fillTheboxInfo(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		sendText(factory.signInPage().nameValueInCreateNewAcc, data.get(0).get("name"));
		sendText(factory.signInPage().emailValueInCreateNewAcc, data.get(0).get("email"));
		sendText(factory.signInPage().passwordValueInCreateNewAcc, data.get(0).get("password"));
		sendText(factory.signInPage().confirmpasswordValueInCreateNewAcc, data.get(0).get("confirmPassword"));
		logger.info("user put the information to all the blankes");
	}
	@And("User click on SignUp button")
	public void clickonSignUpButton() {
		click(factory.signInPage().signupbuttonInCreateNewAcc);
		logger.info("user click on sign up button");
	}
	@Then("User should be logged into account page")
	public void userShouldBeLogIn() {
		Assert.assertTrue(isElementEnabled(factory.account().profileImage));
		logger.info("user should be log in");
	}
}
