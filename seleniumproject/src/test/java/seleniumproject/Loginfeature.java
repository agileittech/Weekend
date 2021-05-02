package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;

public class Loginfeature extends ExcelReader {
	WebDriver w ;
	Cell c0;
	Row r0;

@Before
public void browsersconfiguration() {
	System.setProperty("webdriver.chrome.driver", "C:\\AgileIT Weekend\\seleniumproject\\chromedriver.exe");
	System.setProperty("webdriver.gecko.driver", "C:\\AgileIT Weekend\\seleniumproject\\geckodriver.exe");
}
@Given ("^To Open Url of Rediffmail Page in ([a-zA-Z]{1,})")
public void openurl(String Browser) {
	if (Browser.equals("Chrome")){
	w = new ChromeDriver();	
	w.get("https://mail.rediff.com/cgi-bin/login.cgi");
	}else if (Browser.equals("Firefox")){
	w  = new FirefoxDriver();
	w.get("https://mail.rediff.com/cgi-bin/login.cgi");
	}
}
@When ("the page is successfully opened enter username")
public void enterusername() {
	ExcelReader e = new ExcelReader();
	e.gettingrowsandcells(0,0);
	RichTextString s = e.readdata(c0);
	String forsendkeys = s.toString();
	w.findElement(By.name("login")).sendKeys(forsendkeys);
}
@And("^Enter ([a-zA-Z0-9]{1,})")
public void enterpassword(String value) {
	w.findElement(By.name("passwd")).sendKeys(value);
}
@Then("Click on signin button")
public void click() {
	w.findElement(By.name("proceed")).click();
}
}
