package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    By emailField = By.xpath("//*[@id=\"email\"]");
    By passField = By.xpath("//*[@id=\"password\"]");
    By enterButton = By.xpath("//button[@type = 'submit']");
    By imNotRegiser = By.xpath("//a[@href = '/podbor-kredita']");

    public void typeEmail (String email){
        WebElement login = driver.findElement(emailField);
        login.sendKeys(email);
    }
    public void typePassword (String password){
        WebElement login = driver.findElement(passField);
        login.sendKeys(password);
    }
    public void clickEnterButton (){
        driver.findElement(enterButton).click();
    }
    public void login(String email,String password){
        typeEmail(email);
        typePassword(password);
        clickEnterButton();
    }
    public void clickImNotRegister (){
        driver.findElement(imNotRegiser).click();
    }
}
