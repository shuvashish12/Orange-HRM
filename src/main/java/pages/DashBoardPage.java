package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.security.PublicKey;

public class DashBoardPage {
    @FindBy(tagName = "h6") private WebElement headerText;

    public void validateDashBoardPage(){
        String text = headerText.getText();
        Assert.assertEquals(text, "Dashboard2");
    }

    public void testSomething(){
        Assert.assertEquals(2, 5);
    }
}
