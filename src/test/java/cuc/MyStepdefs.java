package cuc;

import com.codeborne.selenide.Configuration;
import cuc.OzonPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import static com.codeborne.selenide.Selenide.open;

public class MyStepdefs {

    @When("^open ozon page$")
    public void openGoogle() {
        Configuration.startMaximized = true;
        Configuration.timeout = 5000;
        open(OzonPage.URL);
    }

    @And("^click on button katalog$")
    public void clickOnButtonKatalog() throws InterruptedException {
        OzonPage.katalog().click();
        Thread.sleep(500);
    }

    @Then("^a submenu appears$")
    public void aSubmenuAppears() {
        Assert.assertTrue("вкладка каталог не выбрана",OzonPage.subMenu().isDisplayed());
    }

    @Then("^move cursor on 'Книги'$")
    public void moveCursorOnКниги() {
        OzonPage.moveToBooks().hover();
    }

    @And("^click on 'Компьютерные технологии'$")
    public void clickOnКомпьютерныеТехнологии() throws InterruptedException {
        OzonPage.computerTech().click();
        Thread.sleep(1000);
    }

    @Then("^choose parametres 'Бестселлеры' and 'Языки программирования'$")
    public void chooseParametresБестселлерыAndЯзыкиПрограммирования() throws InterruptedException {
        OzonPage.checkBoxBest().click();
        OzonPage.checkBoxLanguages().click();
        Thread.sleep(1000);
    }

    @Then("^a window appears in which the selected categories$")
    public void aWindowAppearsInWhichTheSelectedCategories() {
        Assert.assertTrue("Категория бестселлеры не выбрана",OzonPage.choosenCats1().exists());
        Assert.assertTrue("Категория языки программирования не выбрана",OzonPage.choosenCats2().exists());
    }

    @Then("^choose on a any book from the suggested list and click on 'В корзину'$")
    public void chooseOnAAnyBookFromTheSuggestedListAndClickOnВКорзину() throws InterruptedException {
        if (OzonPage.messageToClose().isDisplayed())
            OzonPage.messageToClose().click();
        OzonPage.buttonInBusket().click();
        Thread.sleep(500);
    }


    @Then("^a button 'В корзину' disappears$")
    public void aButtonВКорзинуDisappears() {
        Assert.assertFalse("Кнопка не исчезла",OzonPage.buttonInBusket().isDisplayed());
    }

    @When("^open a tab 'Корзина'$")
    public void openATabКорзина() throws InterruptedException {
        OzonPage.busket().click();
        Thread.sleep(1000);
    }

    @Then("^appears choosen book$")
    public void appearsChoosenBook() {
        Assert.assertTrue("Выбранная нига не была добавлена в коорзину",OzonPage.bookName().exists());
    }
}
