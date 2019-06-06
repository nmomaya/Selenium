import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create driver object
	System.setProperty("webdriver.chrome.driver","E:\\Selenium_NM\\chromedriver_win32\\chromedriver.exe");
	WebDriver test = new ChromeDriver();
	test.manage().window().maximize();
	test.get("http://www.moneycontrol.com");
	String home =	test.getCurrentUrl();
	String home1 =	test.getTitle();
	System.out.println("\n"+ home + "\n" +"and" + "\n" +home1);
	test.get("http://www.cricinfo.com");
	home =	test.getCurrentUrl();
	home1 = test.getTitle();
	System.out.printf(home+"   and     " +home1);
	test.navigate().back();
	test.navigate().forward();
	test.close();
	
   
	
	}

};
