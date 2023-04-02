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

public class Retail_Account_Steps extends CommonUtility {
	POMFactory factory = new POMFactory();

	@When("User click on Account option")
	public void clickOnaccountOtion() {
		click(factory.homePage().accountOption);
		logger.info("User clicked on account option");
	}

	@And("User update Name {string} and Phone {string}")
	public void updateprofileinformation(String name, String phone) {
		clearTextUsingSendKeys(factory.account().nameFaildUpdateSection);
		sendText(factory.account().nameFaildUpdateSection, name);
		clearTextUsingSendKeys(factory.account().phonenumberUpdateSection);
		sendText(factory.account().phonenumberUpdateSection, phone);
		logger.info("User add name and phone value");
	}

	@And("User click on Update button")
	public void clickOnupdatebutt() {
		waitTillClickable(factory.account().updatebuttInUpdateSection);
		click(factory.account().updatebuttInUpdateSection);
		logger.info("user clicked on update button");
	}

	@Then("user profile information should be updated")
	public void profileShouldbeUpdate() {
		waitTillPresence(factory.account().updatemessageSuccessfully);
		Assert.assertTrue(isElementDisplayed(factory.account().updatemessageSuccessfully));
		logger.info("user profile should be updated");
	}

	@When("User enter below information")
	public void userEnterBelowInformation(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		sendText(factory.account().previousPassword, data.get(0).get("previousPassword"));
		sendText(factory.account().newPassword, data.get(0).get("newPassword"));
		sendText(factory.account().confirmPassword, data.get(0).get("confirmPassword"));
		logger.info("User enterd all the value");
	}

	@When("User click on Change Password button")
	public void userClickOnChangePassword() {
		click(factory.account().changePasswordButt);
		logger.info("User clicked on change password button");
	}

	@Then("a message should be displayed ‘Password Updated Successfully’")
	public void aMessageShouldBeDisplayed() {
		waitTillPresence(factory.account().passwordUpdatedSuccessfully);
		Assert.assertTrue(isElementDisplayed(factory.account().passwordUpdatedSuccessfully));
		logger.info("User updated Successfully");
	}

	@When("User click on Add a payment method link")
	public void userClickOnAddAPayment() {
		click(factory.account().addApaymentMethodOption);
		logger.info("User clicked on payment method optin");
	}

	@And("User fill Debit or credit card information")
	public void userFillDebitInfo(DataTable dataTable) {
		List<Map<String, String>> name = dataTable.asMaps(String.class, String.class);
		sendText(factory.account().cardNumber, name.get(0).get("cardNumber"));
		sendText(factory.account().nameOFCardNumber, name.get(0).get("nameOnCard"));
		selectByVisibleText(factory.account().expirationMonthInput, name.get(0).get("expirationMonth"));
		selectByVisibleText(factory.account().expirationYearInput, name.get(0).get("expirationYear"));
		sendText(factory.account().securityCodeInput, name.get(0).get("securityCode"));
		logger.info("User put value in all the sections");
	}

	@And("User click on Add your card button")
	public void userClickOnAddYourCard() {
		click(factory.account().addTOYourCardButt);
		logger.info("User clicked on add card button");
	}

	@Then("a message should be displayed ‘Payment Method added successfully’")
	public void aMessageshouldBeDisplayed() {
		waitTillPresence(factory.account().paymentMethodaddedsuccessfully);
		Assert.assertTrue(isElementDisplayed(factory.account().paymentMethodaddedsuccessfully));
		logger.info("User should be able to see the message below");
	}

	@And("User click on Edit option of card section")
	public void clickingOnEdit() {
		click(factory.account().mastercardAlreadyAdd);
		click(factory.account().editButton);
		logger.info("User clicked on edit button");
	}

	@And("user edit information with below data")
	public void putTheInformation(DataTable dataTable) {
		List<Map<String, String>> name = dataTable.asMaps(String.class, String.class);
		clearTextUsingSendKeys(factory.account().cardNumber);
		sendText(factory.account().cardNumber, name.get(0).get("cardNumber"));
		clearTextUsingSendKeys(factory.account().nameOFCardNumber);
		sendText(factory.account().nameOFCardNumber, name.get(0).get("nameOnCard"));
		sendValueUsingJS(factory.account().expirationMonthInput, name.get(0).get("expirationMonth"));
		sendValueUsingJS(factory.account().expirationYearInput, name.get(0).get("expirationYear"));
		clearTextUsingSendKeys(factory.account().securityCodeInput);
		sendText(factory.account().securityCodeInput, name.get(0).get("securityCode"));
		logger.info("User put the new value in all the sections");
	}

	@And("user click on Update Your Card button")
	public void clickingTOtheUpdateButt() {
		click(factory.account().updateYourCardButton);
		logger.info("User clicked update button");
	}

	@Then("a message should be displayed ‘Payment Method updated Successfully’")
	public void seeingThemessage() {
		waitTillPresence(factory.account().paymentupdatedSuccessfully);
		Assert.assertTrue(isElementDisplayed(factory.account().paymentupdatedSuccessfully));
		logger.info("User should be able to see the message");
	}

	@And("User click on remove option of card section")
	public void remove() {
		click(factory.account().editButton);
		click(factory.account().removeButtonRemivingCard);
		logger.info("user clicked on remove button");
	}

	@Then("Then payment details should be removed")
	public void messageForRemoving() {
		logger.info("User should removed the card");
	}

	@When("User click on Add address option")
	public void clickingOnAddressOption() {
		click(factory.account().addAddressInAccountHomePage);
		logger.info("User clicked on add Address Section");
	}

	@When("user fill new address form with below information")
	public void fillingAllTheInformation(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		selectByValue(factory.account().countryInputAddAddress, data.get(0).get("country"));
		sendText(factory.account().fullNameInputAddAddress, data.get(0).get("fullName"));
		sendText(factory.account().phoneNumberInputAddAddress, data.get(0).get("phoneNumber"));
		sendText(factory.account().streetInputAddAddress, data.get(0).get("streetAddress"));
		sendText(factory.account().apartmentInputAddAdress, data.get(0).get("apt"));
		sendText(factory.account().cityInputAddAddress, data.get(0).get("city"));
		selectByVisibleText(factory.account().stateInputAddAddress, data.get(0).get("state"));
		sendText(factory.account().zipCodeInputAddAddress, data.get(0).get("zipCode"));
		logger.info("User submit all the information to add address section");
	}

	@When("User click Add Your Address button")
	public void clickingOnAddressnButt() {
		click(factory.account().AddYourAddressToSubmitAddingAddress);
		logger.info("User clicked on button of adding address to store all the information");
	}

	@Then("a message should be displayed ‘Address Added Successfully’")
	public void messageShouldbeDisplayed() {
		waitTillPresence(factory.account().addressAddedSuccessfullyMessage);
		Assert.assertTrue(isElementDisplayed(factory.account().addressAddedSuccessfullyMessage));
		logger.info("User should be able to see the message");
	}

	@When("User click on edit address option")
	public void clickOnEdit() {
		click(factory.account().editOptionForEdittingAddress);
		logger.info("user clicked on edit option");
	}

	@When("user fill new address form with below informations")
	public void userFillNewAddressFormWithBelowInformations(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		selectByValue(factory.account().countryInputAddAddress, data.get(0).get("country"));
		clearTextUsingSendKeys(factory.account().fullNameInputAddAddress);
		sendText(factory.account().fullNameInputAddAddress, data.get(0).get("fullName"));
		clearTextUsingSendKeys(factory.account().phoneNumberInputAddAddress);
		sendText(factory.account().phoneNumberInputAddAddress, data.get(0).get("phoneNumber"));
		clearTextUsingSendKeys(factory.account().streetInputAddAddress);
		sendText(factory.account().streetInputAddAddress, data.get(0).get("streetAddress"));
		clearTextUsingSendKeys(factory.account().apartmentInputAddAdress);
		sendText(factory.account().apartmentInputAddAdress, data.get(0).get("apt"));
		clearTextUsingSendKeys(factory.account().cityInputAddAddress);
		sendText(factory.account().cityInputAddAddress, data.get(0).get("city"));
		selectByVisibleText(factory.account().stateInputAddAddress, data.get(0).get("state"));
		clearTextUsingSendKeys(factory.account().zipCodeInputAddAddress);
		sendText(factory.account().zipCodeInputAddAddress, data.get(0).get("zipCode"));
		logger.info("User submit all the information to add address section");
	}

	@When("User click update Your Address button")
	public void clickonUpdateYourAddress() {
		click(factory.account().updateYourAddressButtom);
		logger.info("");
	}

	@Then("a message should be displayed ‘Address Updated Successfully’")
	public void aMessageShouldBeappear() {
		waitTillPresence(factory.account().addressUPDATedSuccfully);
		Assert.assertTrue(isElementDisplayed(factory.account().addressUPDATedSuccfully));
		logger.info("Message displayed");
	}

	@When("User click on remove option of Address section")
	public void userClickOnRemove() {
		click(factory.account().removeButtForREmovingAddress);
		logger.info("user removed the address");
	}

	@Then("Address details should be removed")
	public void addressDetailsSholdBEDeleted() {
		logger.info("Address details removed");
	}
}