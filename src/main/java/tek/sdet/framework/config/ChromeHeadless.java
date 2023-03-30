package tek.sdet.framework.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeHeadless implements Browser{

	@Override
	public WebDriver openBrowser(String url) {
		WebDriverManager.chromedriver().setup();
//		in order to use headless execution we can use chrome option class
//		same steps apply to FireFox , Edge broswer too
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--Headless");
//		options.addArguments("--incognito");  it's a private mood
		WebDriver driver = new ChromeDriver(options);
		driver.get(url);
		return driver;
	}

	
}
