package test.com.learning.selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TeamDeletionTests extends  TestBase{
    @Test
    public void testTeamDeletion() throws InterruptedException {
        initLogin();
        fillAtlassianLoginForm("rochman.elena@gmail.com", "12345.com");
        submitLogin();

        //deleteTeam
        click(By.cssSelector("[data-test-id^=home-team-tab-section]"));
        click(By.cssSelector("[data-test-id=home-team-settings-tab]"));
        click(By.cssSelector(".quiet-button"));
        //confirm
        click(By.cssSelector(".js-confirm"));
    }
}
