package cuc;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import cuc.OzonPage;
import cucumber.api.PendingException;
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
        OzonPage.subMenu().shouldBe(Condition.exist);
        //Thread.sleep(500);
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
        OzonPage.getNameOfChoosingElement();
        OzonPage.buttonInBasket().click();
        Thread.sleep(500);
        //System.out.println(OzonPage.getNameOfChoosingBook());
    }


    @Then("^a button 'В корзину' disappears$")
    public void aButtonВКорзинуDisappears() {
        Assert.assertFalse("Кнопка не исчезла",OzonPage.buttonInBasket().isDisplayed());
    }

    @When("^open a tab 'Корзина'$")
    public void openATabКорзина() throws InterruptedException {
        OzonPage.busket().click();
        Thread.sleep(1500);
    }

    @Then("^appears choosen book$")
    public void appearsChoosenBook() {
        OzonPage.getNameOfChoosenElement();
        Assert.assertTrue("Выбранная книга не была добавлена в коорзину",OzonPage.NameOfChoosingElement.equals(OzonPage.NameOfChoosenElement));
        System.out.println(OzonPage.NameOfChoosenElement+" "+OzonPage.NameOfChoosingElement);
    }
//////////////////////////////////////////////////////////////////////
    @Then("^click on city to choose$")
    public void clickOnCityToChoose() throws InterruptedException {
        OzonPage.chooseCity().click();
        Thread.sleep(500);
    }

    @And("^type in appears row text \"([^\"]*)\" and press enter$")
    public void typeInAppearsRowTextAndPressEnter(String text) throws Throwable {
        OzonPage.inputCityRow().sendKeys("Ижевск");
        OzonPage.izhevsUR().click();
    }

    @Then("^move cursor on 'Спорт товары'$")
    public void moveCursorOnСпортТовары() {
        OzonPage.sportTovar().hover();
    }

    @And("^click on 'Сноуборды и аксессуары'$")
    public void clickOnСноубордыИАксессуары() {
        OzonPage.snowboarsAndAcs().click();
    }

    @Then("^click on 'Сноуборды'$")
    public void clickOnСноуборды() throws InterruptedException {
        OzonPage.snowboards().click();
        OzonPage.messageToClose().click();
        Thread.sleep(500);
    }

    @Then("^set price category$")
    public void setPriceCategory() throws InterruptedException {
        OzonPage.priceCategoryFrom().doubleClick();
        //Thread.sleep(1000);
        OzonPage.priceCategoryFrom().sendKeys("25000");
        //OzonPage.priceCategoryFrom().pressEnter();
        //Thread.sleep(500);
    }

    @And("^set level of training$")
    public void setLevelOfTraining() throws InterruptedException {
        OzonPage.levelOfTraining().click();
        Thread.sleep(1000);

    }

    @Then("^choose on a any snowboard from the suggested list and click on 'В корзину'$")
    public void chooseOnAAnySnowboardFromTheSuggestedListAndClickOnВКорзину() throws InterruptedException {
        OzonPage.buttonInBasket().click();
        OzonPage.getNameOfChoosingElement();
        Thread.sleep(1000);
    }

    @And("^this button disappears$")
    public void thisButtonDisappears() {
        Assert.assertFalse("Кнопка не исчезла",OzonPage.buttonInBasket().isDisplayed());
    }

    @Then("^appears choosen snowboard$")
    public void appearsChoosenSnowboard() {
        OzonPage.getNameOfChoosenElement();
        Assert.assertTrue("Выбранный сноуборд не был добавлен в корзину",OzonPage.NameOfChoosingElement.equals(OzonPage.NameOfChoosenElement));
        System.out.println(OzonPage.NameOfChoosenElement+"\n"+OzonPage.NameOfChoosingElement);
        //
    }
}
