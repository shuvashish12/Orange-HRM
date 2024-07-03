package pages;

import browser.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(name = "username") private WebElement userName;
    @FindBy(name = "password") private WebElement password;
    @FindBy(css = "[type='submit']") private WebElement submitButton;

    public DashBoardPage loginToSystem(){
        userName.sendKeys("Admin");
        password.sendKeys("admin123");
        submitButton.click();
        return PageFactory.initElements(Browser.getDriver(), DashBoardPage.class);
    }

}
