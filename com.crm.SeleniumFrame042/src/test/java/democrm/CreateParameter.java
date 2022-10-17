package democrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import practics.test;

public class CreateParameter {
	@test
	public void method() {
		String BROWSER = System.clearProperty("browser");
		System.out.println(BROWSER);
		
		ChromeDriver driver;
		 if(BROWSER.equalsIgnoreCase("chrome"))
		 {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		 }
		 else if(BROWSER.equalsIgnoreCase("firefox"))
		 {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		 }
		 else
		 {
		  driver = new ChromeDriver();
		 }
}
		
	}


