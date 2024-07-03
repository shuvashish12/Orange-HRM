import browser.Browser;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(value = TestListener.class)
public class DashboardPageTest extends BaseTest {

    @Test
    public void dashboardTest1(){
        Browser browser = new Browser();
        browser.startBrowser()
                .loginToSystem()
                .validateDashBoardPage();
    }

    @Test
    public void dashboardTest2(){
        Browser browser = new Browser();
        browser.startBrowser()
                .loginToSystem()
                .testSomething();
    }
}
