package NewSeleniumProject.Githubrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\15408\\eclipse-workspace\\Githubrepo\\src\\Driver Chrome\\chromedriver.exe");
driver=new ChromeDriver();
driver.navigate().to("https://facebook.com");
	}

}
