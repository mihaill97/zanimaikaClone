package Tests;

import Pages.FirstStepPage;
import Pages.LoginPage;
import Pages.MainPage;
import Pages.SecondStepPage;
import Settings.ChromeSettings;
import org.junit.Test;

public class TestZanimaika extends ChromeSettings {
    @Test
    public void LoginZanimaika ()throws InterruptedException{
        MainPage  mainPage = new MainPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        //actions
        mainPage.clickButtonEnter();
        loginPage.login(userEmail,userPassword);
        mainPage.exitMenu();
    }
    @Test
    public void RegistrationZanimaika () throws InterruptedException{
        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        FirstStepPage firstStepPage = new FirstStepPage(driver);
        SecondStepPage secondStepPage = new SecondStepPage(driver);
        //actions
        mainPage.clickButtonEnter();
        loginPage.clickImNotRegister();
        //first step page
        firstStepPage.typeData();
        firstStepPage.clickAgreeWithTerms();
        firstStepPage.clickButtonContinue();
        Thread.sleep(1000);
        //second step page
        secondStepPage.typeData();
        secondStepPage.clickButtonContin();
    }

}
