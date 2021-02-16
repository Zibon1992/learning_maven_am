package com.crm.qa.pages;

import com.crm.qa.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TaskPage extends BasePage {
    public TaskPage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//button[contains(text(),'Click Me')]")
    WebElement alert;
    @FindBy(id="speed")
    WebElement speed;
    @FindBy(id="files")
    WebElement files;

    public void clickOnAlert(){
        alert.click();


    }
    public void dropDownSelection(){
        Select speedSelect = new Select(speed);
        speedSelect.selectByVisibleText("Fast");
    }
    public void dropDownSelection1(){
        Select speedSelect = new Select(files);
        speedSelect.selectByVisibleText("DOC file");
    }

}
