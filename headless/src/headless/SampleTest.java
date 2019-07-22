package headless;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTest {

    public static void main(String[] args) throws IOException, InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver.exe");
            ChromeOptions chromeOptions = new ChromeOptions();
            //chromeOptions.addArguments("headless");
            chromeOptions.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors");  
            WebDriver driver = new ChromeDriver(chromeOptions);  
            
//            chromeOptions.addArguments("--no-sandbox");
//            chromeOptions.addArguments("'--ignore-certificate-errors'");

          

            driver.get("https://google.com");

            Thread.sleep(1000);

            if (driver.getPageSource().contains("I'm Feeling Lucky")) {
                    System.out.println("Pass");
            } else {
                    System.out.println("Fail");
            }
            driver.quit();
    }
}