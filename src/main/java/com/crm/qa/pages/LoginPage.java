package com.crm.qa.pages;


import com.crm.qa.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage extends BasePage {
    @FindBy(id = "RESULT_TextField-1")
    WebElement firstname;
    @FindBy(id = "RESULT_TextField-2")
    WebElement lastname;
    @FindBy(id = "RESULT_TextField-3")
    WebElement contactnumber;
    @FindBy(id = "RESULT_TextField-4")
    WebElement country;
    @FindBy(id = "RESULT_TextField-5")
    WebElement city;
    @FindBy(id = "RESULT_TextField-6")
    WebElement email;
    @FindBy(xpath = "//*[contains(text(),'Male')]")
    WebElement setgender;
    @FindBy(xpath = "//*[@name='RESULT_CheckBox-8']/following-sibling::label")
    WebElement daysAvailable;
    @FindBy(id = "RESULT_RadioButton-9")
    WebElement timeContact;
    @FindBy(id = "RESULT_FileUpload-10")
    WebElement fileUpload;
    @FindBy(xpath = "//a[contains(text(),'Software Testing Tutorials')]")
    WebElement tutorialLink;


    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public void setFirstName(String first) {
        firstname.sendKeys(first);
    }

    public void setLastName(String last) {
        lastname.sendKeys(last);
    }

    public void setPhoneNumber(String number) {
        contactnumber.sendKeys(number);
    }

    public void setCountry(String homeland) {
        country.sendKeys(homeland);
    }

    public void setCity(String town) {
        city.sendKeys(town);
    }

    public void setEmail(String mail) {
        email.sendKeys(mail);
    }

    public void setGender() {
        setgender.click();
    }

    public void setAvailableDay() {
        daysAvailable.click();
    }

    public void setTimeContact() {
        Select timContact = new Select(timeContact);
        timContact.selectByVisibleText("Morning");
    }

    public void setFileUpload(){
        fileUpload.sendKeys("D:\\buynoir_new_build\\gaun.jpg");
    }
    public void clickOnTutorialLink(){
        tutorialLink.click();
    }
    public void switchToIframe() {
        driver.switchTo().frame("frame-one1434677811");
    }

    public void switchToMainWindow() {
        driver.switchTo().parentFrame();
    }
}