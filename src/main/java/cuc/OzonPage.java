package cuc;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.impl.WebElementsCollection;
import org.openqa.selenium.By;

import java.util.Collection;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class OzonPage {
    public static int random = (int) (Math.random() * 35);
    public static String index = String.valueOf(random);
    public static final String URL = "https://www.ozon.ru";
    public static final String bestsell="Бестселлеры";
    public static final String languagesOfProg="Языки программирования";
    public static String NameOfChoosingElement;
    public static String NameOfChoosenElement;



    public static SelenideElement katalog(){return $(By.xpath("//button[@value='Каталог']")); }
    public static SelenideElement subMenu(){return $(By.xpath("//div[@class ='_4d969e']"));}
    //public static SelenideElement subMenu(){return $(By.xpath("//div[@style='max-height: 1518px;']//div[@style='max-height: 1518px;']"));}
    public static SelenideElement moveToBooks(){return $(By.xpath("//span[contains(text(),'Книги')]")); }
    public static SelenideElement computerTech(){return $(By.linkText("Компьютерные технологии")); }
    public static SelenideElement checkBoxBest(){return $(By.xpath("//span[text() ='"+bestsell+"']")); }
    public static SelenideElement checkBoxLanguages(){return $(By.xpath("//span[contains(text(),'"+languagesOfProg+"')]"));}
    /*public static SelenideElement buttonWarp(){
        return $(By.xpath("//div[@class='count-button-wrap']"));
    }*/
    public static SelenideElement busket(){return $(By.xpath("//a[@href='/cart']"));    }
    public static SelenideElement choosenCats1(){return $(By.xpath("//div[@class='_4db849']//span[text()='"+bestsell+"']"));}
    public static SelenideElement choosenCats2(){return $(By.xpath("//div[@class='_4db849']//span[text()='"+languagesOfProg+"']"));}
    public static SelenideElement messageToClose(){return $(By.xpath("//button[@aria-label='Закрыть сообщение']"));}
    //public static SelenideElement buttonInBasket(){return $(By.xpath("//div[@data-index='1']//button//span[text()='В корзину']"));}
    public static SelenideElement buttonInBasket(){
        return $(By.xpath("//div[@data-index='"+index+"']//div[text()='В корзину ']"));
    }
    public static String getNameOfChoosingElement(){
        return NameOfChoosingElement = $(By.xpath("//div[@data-index='"+index+"']//span[@data-test-id='tile-name']")).text();
    }
    public static String getNameOfChoosenElement(){
        return NameOfChoosenElement = $(By.xpath("//div[@class='cart-item']//a/span")).text();
    }
    //public static SelenideElement bookName(){return $(By.xpath("//span[text()='"+nameOfChoosenBook+"']"));}
    //public static SelenideElement choosenBook(){return $(By.xpath())}
    public static SelenideElement chooseCity(){return $(By.xpath("//span[@class='c11d10']"));}
    public static SelenideElement inputCityRow(){return $(By.xpath("//p[text()='Ваш город ...']/preceding-sibling::*"));}
    public static SelenideElement izhevsUR(){return $(By.xpath("//a[contains(text(),'Ижевск, Удмуртская республика')]"));}

    public static SelenideElement sportTovar(){return $(By.linkText("Спортивные товары"));}
    public static SelenideElement snowboarsAndAcs(){return $(By.xpath("//span[contains(text(),'Сноуборды и аксессуары')]"));}
    public static SelenideElement snowboards(){return $(By.linkText("Сноуборды"));}
    public static SelenideElement priceCategoryFrom(){return $(By.xpath("//input[@data-test-id='range-filter-from-input']")); }
    public static SelenideElement levelOfTraining(){return $(By.xpath("//span[contains(text(),'Для прогрессирующих')]"));}
    public static SelenideElement burtonToBusket(){return $(By.xpath("//div[@data-index='"+index+"']//span[text()='В корзину']"));}
    //public static SelenideElement getName

    //public static SelenideElement nameOfSnowboard(){return $(By.xpath("//span[text()='"+nameOfSnowboard+"']"));}
}
