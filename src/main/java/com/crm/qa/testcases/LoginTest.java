package com.crm.qa.testcases;

import com.crm.qa.base.BasePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.TaskPage;
import org.testng.annotations.Test;

public class LoginTest extends BasePage {
    @Test
    public void verifyLoginTestWithValidCredintials(){
        LoginPage loginPage = new LoginPage();
        loginPage.switchToIframe();
        loginPage.setFirstName("Maruf");
        loginPage.setLastName("Ahmed");
        loginPage.setPhoneNumber("01632987555");
        loginPage.setCountry("Bangladesh");
        loginPage.setCity("Dhaka");
        loginPage.setEmail("maruf35@mailinator.com");
        loginPage.setGender();
        loginPage.setAvailableDay();
        loginPage.setTimeContact();
        loginPage.setFileUpload();
        loginPage.clickOnTutorialLink();
        loginPage.switchToMainWindow();
        sleepFor(5);
    }


}
