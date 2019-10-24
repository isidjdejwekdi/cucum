package cuc;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class OzonPage {
    public static final String URL = "https://www.ozon.ru";
    public static final String bestsell="Бестселлеры";
    public static final String languagesOfProg="Языки программирования";
    public static final String nameOfChoosenBook ="Изучаем Java";

    public static SelenideElement katalog(){

        return $(By.xpath("//button[@value='Каталог']"));
    }
    public static SelenideElement subMenu(){return $(By.xpath("//div[@class ='_4d969e']"));}
    //public static SelenideElement subMenu(){return $(By.xpath("//div[@style='max-height: 1518px;']//div[@style='max-height: 1518px;']"));}

    public static SelenideElement moveToBooks(){
        return $(By.xpath("//span[contains(text(),'Книги')]"));
    }

    public static SelenideElement computerTech(){
        return $(By.linkText("Компьютерные технологии"));
    }
    public static SelenideElement checkBoxBest(){
        return $(By.xpath("//span[text() ='"+bestsell+"']"));
    }

    public static SelenideElement checkBoxLanguages(){
        return $(By.xpath("//span[contains(text(),'"+languagesOfProg+"')]"));
    }



    public static SelenideElement buttonWarp(){
        return $(By.xpath("//div[@class='count-button-wrap']"));
    }

    public static SelenideElement busket(){
        return $(By.xpath("//a[@href='/cart']"));
    }

    public static SelenideElement choosenCats1(){return $(By.xpath("//div[@class='_4db849']//span[text()='"+bestsell+"']"));}
    public static SelenideElement choosenCats2(){return $(By.xpath("//div[@class='_4db849']//span[text()='"+languagesOfProg+"']"));}
    public static SelenideElement messageToClose(){return $(By.xpath("//button[@aria-label='Закрыть сообщение']"));}
    public static SelenideElement buttonInBusket(){return $(By.xpath("//div[@data-index='1']//button//span[text()='В корзину']"));}
    public static SelenideElement bookName(){return $(By.xpath("//span[text()='"+nameOfChoosenBook+"']"));}



}
