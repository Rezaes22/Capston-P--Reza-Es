package tek.sdet.framework.steps;

import org.junit.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class Retail_order_steps extends CommonUtility {
	POMFactory factory = new POMFactory();

	
	@And("User click on Orders section")
	public void userClickOnOrdersSec() {
		click(factory.order().orderMainButton);
		logger.info("User clicked on order button");
	}
	@And("User click on first order in list")
	public void userClickOnFirstOrder(){
		click(factory.order().firstOrder);
		logger.info("User click on first order");
	}
	@And("User click on Cancel The Order button")
	public void userClickOnCancelorder(){
		waitTillPresence(factory.order().cancelTheOrder);
		click(factory.order().cancelTheOrder);
		logger.info("User cancel the order");
	}
	@And("User select the cancelation Reason {string}")
	public void userSelectCanclationReason(String name) {
		selectByVisibleText(factory.order().cancelationReason, name);
		logger.info("user Tell the reason of canselation");
	}
	@And("User click on Cancel Order button")
	public void clickingOnCancelOrderButton() {
		click(factory.order().cancelSubmition);
		logger.info("User clicked on cancel button");
	}
	@Then("a cancelation message should be displayed ‘Your Order Has Been Cancelled’")
	public void cancelationMessagedisplay() {
		waitTillPresence(factory.order().messageYourOrderDeleted);
		Assert.assertTrue(isElementDisplayed(factory.order().messageYourOrderDeleted));
		logger.info("Message should be displayed");
	}
	
	
	@And("User click on Return Items button")
	public void returnitem() {
	waitTillPresence(factory.order().returnbtn);
	click(factory.order().returnbtn);
	logger.info("user clicked on retrun Item");
	}
	@And("User select the Return Reason {string}")
	public void reasonReutn(String return1) {
	selectByVisibleText(factory.order().returninput, return1);
	logger.info("user has chosen the item damaged");
	}
	@And("User select the drop off service {string}")
	public void dropOfItem(String dropOf) {
	selectByVisibleText(factory.order().dropof, dropOf);
	logger.info("User select the drop off service 'FedEx'");
	}
	@And("User click on Return Order button")
	public void retrunbutton() {
	click(factory.order().orderbtn);
	logger.info("User click on Return Order button");
	}
	@Then("a cancelation message should be displayed ‘Return was successful’")
	public void cancelmessage() {
	waitTillPresence(factory.order().retunmessage);
	Assert.assertTrue(isElementDisplayed(factory.order().retunmessage));
	logger.info("user ger the cancelation message");
}
	
	
	@And("User click on Review button")
	public void reviewbtn() {
	click(factory.order().reviewBtn);
	logger.info("user clicked on review button");
	}
	@And("User write Review headline {string} and {string}")
	public void Review(String headline,String writesomeing) {
	sendText(factory.order().headline,headline);
	sendText(factory.order().write, writesomeing);
	logger.info("user wrote the healine and describtion");

	}
	@And("User click Add your Review button")
	public void reviewbtnn() {
	click(factory.order().reviewbtn);
	logger.info("user click review button");
	}
	@Then("a review message should be displayed ‘Your review was added successfully’")
	public void reviewmessage() {
	waitTillPresence(factory.order().reviewmessage);
	Assert.assertTrue(isElementDisplayed(factory.order().reviewmessage));
	logger.info("review message displayed");


	}

}
