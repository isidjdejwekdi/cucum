package cuc;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import gherkin.formatter.model.Scenario;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    @Before
    public void beforeHook(){


        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        System.out.println("Тест начался");
        WebDriverRunner.setWebDriver(new ChromeDriver());
    }
    @After
    public void afterHook(){
        System.out.println("Тест Закончился");
        //WebDriverRunner.closeWebDriver();
    }

}
