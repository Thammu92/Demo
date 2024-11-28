package dropdown_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BlazeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.blazedemo.com/");
		Select from_city=new Select(driver.findElement(By.name("fromPort")));
		Select to_city=new Select(driver.findElement(By.name("toPort")));
		from_city.selectByVisibleText("Boston");
		to_city.selectByIndex(4);
		driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[1]/input")).click();
		WebElement pname=driver.findElement(By.id("inputName"));
		pname.clear();
		pname.sendKeys("John");
		WebElement paddress=driver.findElement(By.name("address"));
		paddress.clear();
		paddress.sendKeys("dsdfsdr");
		WebElement pcity=driver.findElement(By.name("city"));
		pcity.clear();
		pcity.sendKeys("NewYork");
		WebElement pstate=driver.findElement(By.id("state"));
		pstate.clear();
		pstate.sendKeys("adsdt");
		WebElement pzipcode=driver.findElement(By.id("zipCode"));
		pzipcode.clear();
		pzipcode.sendKeys("24685");
		Select pcardtype=new Select(driver.findElement(By.name("cardType")));
		pcardtype.selectByIndex(1);
		WebElement pcardno=driver.findElement(By.name("creditCardNumber"));
		pcardno.clear();
		pcardno.sendKeys("5437629082");
		WebElement pcmonth=driver.findElement(By.id("creditCardMonth"));
		pcmonth.clear();
		pcmonth.sendKeys("8");
		WebElement pcyear=driver.findElement(By.id("creditCardYear"));
		pcyear.clear();
		pcyear.sendKeys("2026");
		WebElement pname_on_card=driver.findElement(By.id("nameOnCard"));
		pname_on_card.clear();
		pname_on_card.sendKeys("John Willis");
		WebElement checkme=driver.findElement(By.id("rememberMe"));
		checkme.click();
		WebElement purchase=driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input"));
		purchase.click();

	}

}
