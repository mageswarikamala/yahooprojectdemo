package demoyahoo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demoyahoo {
	By fn=By.xpath(".//*[@id='usernamereg-firstName']");
	By sn=By.xpath(".//*[@id='usernamereg-lastName']");
	By cont=By.xpath(".//*[@id='reg-submit-button']");
	By em=By.xpath(".//*[@id='usernamereg-yid']");
	By psw=By.xpath(".//*[@id='usernamereg-password']");
	
	@Test
	public void demologin()
	
	{
		System.setProperty("webdriver.chrome.driver", "E:\\javaselenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/account/create?src=fpctx&intl=in&lang=en-IN&done=https%3A%2F%2Fin.yahoo.com&specId=yidReg");
		driver.findElement(fn).sendKeys("vaishnavi");
		driver.findElement(sn).sendKeys("vishnu");
		driver.findElement(em).sendKeys("mageswari.senkumar@yahoo.com");
		driver.findElement(psw).sendKeys("VaishVish10");
		driver.findElement(cont).click();
	}
	

}
