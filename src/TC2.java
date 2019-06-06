import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","E:\\Selenium_NM\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver fire = new FirefoxDriver ();
		fire.get("http://www.google.com");
		//System.out.println(fire.getTitle());
		System.out.println("Test Output is "+fire.getTitle());
		
	}

}
