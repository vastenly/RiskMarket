package ru.riskmarket.pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.By.xpath;

/**
 * Created by VKov on 28-Mar-16.
 */
public class FirstPage extends AbstractPage {

    @NameOfElement("Вход в кабинет")
    @FindBy(xpath = "//button[.='Вход в кабинет']")
    public SelenideElement enterToCabinet;

    @NameOfElement("Логин")
    @FindBy(css = "input[name='userName']")
    public SelenideElement login;

    @NameOfElement("Пароль")
    @FindBy(css = "input[name='password']")
    public SelenideElement password;

    @NameOfElement("Войти")
    @FindBy(css = "input[value='Войти']")
    public SelenideElement enter;

    @NameOfElement("Фрейм входа в кабинет")
    @FindBy(css = ".modal-content")
    public SelenideElement frameEnterToCabinet;

    @NameOfElement("Укажите страну")
    @FindBy(css = "#countryInput")
    public SelenideElement countryInput;

    @NameOfElement("Даты поездки")
    @FindBy(css = "#preview")
    public SelenideElement datesJourney;

    @NameOfElement("Выпадающий календарь")
    @FindBy(css = ".period-control-popup")
    public SelenideElement popupCalendar;

    public void clickAnyAvailableDate() {
        popupCalendar.$("span[data-ng-click]").click();
        if(!popupCalendar.$("span[data-ng-click]").exists())
        {
            popupCalendar.$(xpath("(./div[1]/button)[2]")).click();
        }
        popupCalendar.$("span[data-ng-click]").click();
    }
}
