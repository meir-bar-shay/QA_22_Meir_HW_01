import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Selectors extends TestBase{

    @Test
        public void WikiElementsTest() throws InterruptedException {
        //open site
        openSite("https://www.wikipedia.org/");
            //select lang bycss
        driver.findElement(By.cssSelector("#js-link-box-ru")).click();
            //back
        back();
        driver.findElement(By.xpath("//*[@id='js-link-box-en']")).click();

        }


}
