import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Css_Xpath {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    public void openWikipediaTest() throws InterruptedException {
        driver.get("https://mavir.co.il/");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//div[@class='menu']//li[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='menu']//li[3]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='main country country-israel']//li[3]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(text(),"'")]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//p[38]//a[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//p[38]//a[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//p[38]//a[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//p[38]//a[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//p[38]//a[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//p[38]//a[1]")).click();
        Thread.sleep(3000);

//        driver.findElement(By.cssSelector("//p[38]//a[1]")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.cssSelector("//p[38]//a[1]")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.cssSelector("//p[38]//a[1]")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.cssSelector("//p[38]//a[1]")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.cssSelector("//p[38]//a[1]")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.cssSelector("//p[38]//a[1]")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.cssSelector("//p[38]//a[1]")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.cssSelector("//p[38]//a[1]")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.cssSelector("//p[38]//a[1]")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.cssSelector("//p[38]//a[1]")).click();
//        Thread.sleep(3000);



    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
