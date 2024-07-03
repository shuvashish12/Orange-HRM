package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;

import java.time.Duration;

public class Browser {
    static WebDriver driver;

    public LoginPage startBrowser(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        return PageFactory.initElements(driver, LoginPage.class);
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
