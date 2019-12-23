import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver driver;

    @BeforeMethod

    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();

    }

    public void openSite(String url) {
        driver.get(url);
    }

    public void selectLangEn() {
        driver.findElement(By.id("js-link-box-en")).click();
    }

    public void fillLoginForm(String user, String pwd) {
        Type(By.id("wpName1"), user);
        Type(By.id("wpPassword1"), pwd);
    }

    public void Type(By locator, String text) {
        driver.findElement(locator).click();
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public void back() {
        driver.navigate().back();
    }

    public String getPageTitle() {
        return driver.findElement(By.cssSelector("h1")).getText();
    }

    public void clickOnMenuByIndex(int i) {
        driver.findElement(By.xpath("//nav//li[" + i +"]")).click();
    }

    public String getMenuTitle(int i) {
        return driver.findElement(By.xpath("//nav//li[" + i +"]")).getText();
    }

    public void pause(int millis) throws InterruptedException {
        Thread.sleep(millis);
    }
}