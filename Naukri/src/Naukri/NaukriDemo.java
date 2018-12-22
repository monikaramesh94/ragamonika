package Naukri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\Javaselenium\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.myntra.com/login?referer=https%3A%2F%2Fwww.myntra.com%2Fcheckout%2Faddress&force=true");
		System.out.println(dr.getTitle());
		/*By username=By.name("email");
		By password=By.name("Password");
		dr.findElement(username).sendKeys("Monika");
		dr.findElement(password).sendKeys("123456");*/
		
		By username=By.xpath("//input[@placeholder='Your Email Address']");
		dr.findElement(username).sendKeys("Monika");
		By password=By.xpath("//input[@placeholder='Enter Password']");
		dr.findElement(password).sendKeys("Monika");

	}

}
