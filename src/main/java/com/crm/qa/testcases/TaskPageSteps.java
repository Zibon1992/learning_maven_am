package com.crm.qa.testcases;

import com.crm.qa.base.BasePage;
import com.crm.qa.pages.TaskPage;
import org.testng.annotations.Test;

public class TaskPageSteps extends BasePage {

    @Test
    public void verifyClickButton(){
        TaskPage taskPage = new TaskPage();
        taskPage.clickOnAlert();
        //new TasksPage().clickOnAlert();
        sleepFor(5);
        taskPage.dropDownSelection();
        sleepFor(2);
    }

    @Test
    public void dropRandomTest(){
        TaskPage taskPage = new TaskPage();
        taskPage.dropDownSelection();
        sleepFor(2);
        taskPage.dropDownSelection1();
        sleepFor(4);
    }

}
