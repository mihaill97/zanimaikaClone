package Settings;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeSettings {
    protected WebDriver driver;
    protected String userEmail = "wowcirkle7991@gmail.com";
    protected String userPassword = "GrJ1YnjZ";

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/misha/tools/chromedriver-2");
        driver = new ChromeDriver();
        driver.get("https://zanimaika.ru/");
        driver.manage().window().maximize();
    }
    @After
    public void cleanUp(){
        driver.quit();
}

}