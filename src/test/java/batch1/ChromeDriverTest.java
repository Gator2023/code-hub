package batch1;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://money.rediff.com/companies/Tata-Consultancy-Services-Ltd/13020033?query=Tcs");
        Thread.sleep(3000);
        driver.quit();


    }
}
