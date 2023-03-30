package tek.sdet.framework.pages;

import tek.sdet.framework.base.BaseSetup;

public class POMFactory extends BaseSetup{

	private RetailHomePage homePage;
	private RetailSignInPage signInPage;
	private RetailAccountPage account;
	private RetailOrderPage order;

	public POMFactory () {
		this.homePage = new RetailHomePage();
		this.signInPage = new RetailSignInPage();
		this.account = new RetailAccountPage();
		this.order = new RetailOrderPage();
	}
	public RetailHomePage homePage() {
        return this.homePage;
	}
	public RetailSignInPage signInPage() {
		return this.signInPage;
	}
	public RetailAccountPage account() {
		return this.account;
	}
	public RetailOrderPage order() {
		return this.order;
	}
	
}
