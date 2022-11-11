import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class noResultados {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
        // identify element
        WebElement p=driver.findElement(By.name("q"));
        //enter text with sendKeys() then apply submit()
        p.sendKeys("dfghbjlkmñkklllkñ.");
        // Explicit wait condition for search results
        WebDriverWait w = new WebDriverWait(driver, 5);
        w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul")));
        p.submit();

            if(driver.findElement(By.xpath("//*[@id='topstuff']/div/p:nth-child(1)"))!=null){
                System.out.println("el mensaje de no encuentra resultado es"+driver.findElement(By.xpath("//*[@id='topstuff']/div/p/text()[1]")).getText());


            }


        driver.close();

    }
}
