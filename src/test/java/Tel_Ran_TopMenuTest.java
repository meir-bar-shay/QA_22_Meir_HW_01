import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tel_Ran_TopMenuTest extends TestBase {

    @Test
    public void testTopMenu() throws InterruptedException {
        openSite("https://www.tel-ran.com/");
        pause(5000);

        String menuTitle = getMenuTitle(2);

        clickOnMenuByIndex(2);
        pause(5000);

        String pageTitle = getPageTitle();

        System.out.println("menu: " + menuTitle + "; menu: " + pageTitle);

        Assert.assertEquals(pageTitle, menuTitle);

        back();


    }

}
