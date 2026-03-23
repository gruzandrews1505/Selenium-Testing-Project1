package Pages1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	protected WebDriver dr;

	public LoginPage(WebDriver dr) {
		this.dr = dr;
	}

	private By fname = By.name("customer[first_name]" ); // object
	private By lname = By.name("customer[last_name]");
	private By email = By.name("customer[email]");
	private By pwd = By.name("customer[password]");// object

	public void enterFirstName(String firstname) {
		dr.findElement(fname).sendKeys(firstname);
	}

	public void enterLastName(String lastname) {
		dr.findElement(lname).sendKeys(lastname);
	}

	public void enterEmail(String emailid) {
		dr.findElement(email).sendKeys(emailid);
	}

	public void enterPassword(String pass) {
		dr.findElement(pwd).sendKeys(pass);
	}
}