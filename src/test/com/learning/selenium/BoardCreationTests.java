package test.com.learning.selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BoardCreationTests extends TestBase{

    @Test
    public void testBoardCreation() throws InterruptedException {
        initLogin();
        fillAtlassianLoginForm("rochman.elena@gmail.com", "12345.com");
        submitLogin();

        //clickOnPlusButtonOnHeader
        clickOnPlusButtonOnHeader();
        //selectCreateBoard
        selectCreateBoard();
        //fillBoardCreationForm
        fillBoardName();
        //selectprivate
        //change to selectVisibilty(String vis)
        selectPrivate();

        //VerifyBoardCreation (compare before and after creation count)
    }

    public void selectPrivate() {
        click(By.cssSelector("button._1Lkx3EjS3wCrs7"));
        click(By.cssSelector("button [name=private]"));
    }

    public void fillBoardName() {
        type(By.cssSelector("[data-test-id=create-board-title-input]"), "hkhkhjh");
    }

    public void selectCreateBoard() {
        click(By.cssSelector("[data-test-id=header-create-board-button]"));
    }

    public void clickOnPlusButtonOnHeader() {
        click(By.cssSelector("[data-test-id=header-create-menu-button]"));
    }
}
