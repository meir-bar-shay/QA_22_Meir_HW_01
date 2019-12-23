import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginWiki extends TestBase{

    @Test
    public void loginTest() {

        openSite("https://www.wikipedia.org/");

        selectLangEn();
        initLogin();

        //fill login form

        fillLoginForm("Meir.bar.shay", "Wiki2019");

        driver.findElement(By.id("wpLoginAttempt")).click();

    }

    public void initLogin() {
        driver.findElement(By.id("pt-login")).click();
    }

}
