import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginWiki {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver=new ChromeDriver();
    }


    @Test
    public void loginTest() throws InterruptedException {

            driver.get("https://www.wikipedia.org/");
            Thread.sleep(5000);

            driver.findElement(By.id("js-link-box-en")).click();
            Thread.sleep(5000);
            driver.findElement(By.id("pt-login")).click();
            Thread.sleep(5000);

            driver.findElement(By.id("wpName1")).click();
            driver.findElement(By.id("wpName1")).clear();
            driver.findElement(By.id("wpName1")).sendKeys("Meir.bar.shay");

            driver.findElement(By.id("wpPassword1")).click();
            driver.findElement(By.id("wpPassword1")).clear();

            driver.findElement(By.id("wpPassword1")).sendKeys("Wiki2019");
            driver.findElement(By.id("wpLoginAttempt")).click();
            Thread.sleep(5000);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();

    }
}
