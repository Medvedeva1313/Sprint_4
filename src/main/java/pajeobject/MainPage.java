package pajeobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
public class MainPage {
    private static final String PAGE_URL = "https://qa-scooter.praktikum-services.ru/";
    private WebDriver driver;

    //Question button xpath's
    public static String xpathHowMuchDropdownList = ".//div[contains(@id,'accordion__heading') and text()='Сколько это стоит? И как оплатить?']";
    public static String xpathCanSeveralScootersDropdownList = ".//div[contains(@id,'accordion__heading') and text()='Хочу сразу несколько самокатов! Так можно?']";
    public static String xpathWhatRentalTimeDropdownList = ".//div[contains(@id,'accordion__heading') and text()='Как рассчитывается время аренды?']";
    public static String xpathCanOrderTodayDropdownList = ".//div[contains(@id,'accordion__heading') and text()='Можно ли заказать самокат прямо на сегодня?']";
    public static String xpathCanProlongRentalTimeDropdownList = ".//div[contains(@id,'accordion__heading') and text()='Можно ли продлить заказ или вернуть самокат раньше?']";
    public static String xpathIsChargingAddedDropdownList = ".//div[contains(@id,'accordion__heading') and text()='Вы привозите зарядку вместе с самокатом?']";
    public static String xpathCanCancelOrderDropdownList = ".//div[contains(@id,'accordion__heading') and text()='Можно ли отменить заказ?']";
    public static String xpathCanMakeOrderOutsideMoscowDropdownList = ".//div[contains(@id,'accordion__heading') and text()='Я жизу за МКАДом, привезёте?']";//жиВу

    //Question buttons By
    public static By howMuchDropdownList = By.xpath(xpathHowMuchDropdownList);
    public static By canSeveralScootersDropdownList = By.xpath(xpathCanSeveralScootersDropdownList);
    public static By whatRentalTimeDropdownList = By.xpath(xpathWhatRentalTimeDropdownList);
    public static By canOrderTodayDropdownList = By.xpath(xpathCanOrderTodayDropdownList);
    public static By canProlongRentalTimeDropdownList = By.xpath(xpathCanProlongRentalTimeDropdownList);
    public static By isChargingAddedDropdownList = By.xpath(xpathIsChargingAddedDropdownList);
    public static By canCancelOrderDropdownList = By.xpath(xpathCanCancelOrderDropdownList);
    public static By canMakeOrderOutsideMoscowDropdownList = By.xpath(xpathCanMakeOrderOutsideMoscowDropdownList);

    public static By faqPanel0 = By.id("accordion__panel-0");
    public static By faqPanel1 = By.id("accordion__panel-1");
    public static By faqPanel2 = By.id("accordion__panel-2");
    public static By faqPanel3 = By.id("accordion__panel-3");
    public static By faqPanel4 = By.id("accordion__panel-4");
    public static By faqPanel5 = By.id("accordion__panel-5");
    public static By faqPanel6 = By.id("accordion__panel-6");
    public static By faqPanel7 = By.id("accordion__panel-7");
    //Order buttons By
    private By headerOrderButton = By.xpath(".//button[@class='Button_Button__ra12g']");
    private By homeOrderButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }
    public MainPage open() {
        driver.get(PAGE_URL);
        return this;
    }

    //Order buttons click
    public void clickHeaderOrderButton() {
        driver.findElement(headerOrderButton).click();
    }

    public  void clickHomeOrderButton() {
        WebElement element = driver.findElement(homeOrderButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(homeOrderButton).click();
    }

    //Question list click
    public void clickHowMuchDropdownList() {
        WebElement element = driver.findElement(howMuchDropdownList);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);

        driver.findElement(howMuchDropdownList).click();
    }

    public void clickCanSeveralScootersDropdownList() {
        WebElement element = driver.findElement(canSeveralScootersDropdownList);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(canSeveralScootersDropdownList).click();
    }

    public void clickWhatRentalTimeDropdownList() {
        WebElement element = driver.findElement(whatRentalTimeDropdownList);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);

        driver.findElement(whatRentalTimeDropdownList).click();
    }

    public void clickCanOrderTodayDropdownList() {
        WebElement element = driver.findElement(canOrderTodayDropdownList);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);

        driver.findElement(canOrderTodayDropdownList).click();
    }

    public void clickCanProlongRentalTimeDropdownList() {
        WebElement element = driver.findElement(canProlongRentalTimeDropdownList);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);

        driver.findElement(canProlongRentalTimeDropdownList).click();
    }

    public void clickIsChargingAddedDropdownList() {
        WebElement element = driver.findElement(isChargingAddedDropdownList);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);

        driver.findElement(isChargingAddedDropdownList).click();
    }

    public void clickCanCancelOrderDropdownList() {
        WebElement element = driver.findElement(canCancelOrderDropdownList);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);

        driver.findElement(canCancelOrderDropdownList).click();
    }

    public void clickCanMakeOrderOutsideMoscowDropdownList() {
        WebElement element = driver.findElement(canMakeOrderOutsideMoscowDropdownList);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);

        driver.findElement(canMakeOrderOutsideMoscowDropdownList).click();
    }

    //get question id by question xpath method
    public String getQuestionId(String questionXpath) {
        return driver.findElement(By.xpath(questionXpath)).getAttribute("id");
    }

    //get answer xpath by question id method
    public String getAnswerXpath(String questionId) {
        return ".//div[@aria-labelledby='" + questionId + "']";
    }

    //get text by question xpath methods
    public String getHowMuchDropdownListAnswer() {
        String questionXpathId = getQuestionId(xpathHowMuchDropdownList);
        String answerXpath = getAnswerXpath(questionXpathId);

        return driver.findElement(By.xpath(answerXpath)).getText();
    }

    public String getCanSeveralScootersDropdownListAnswer() {
        String questionXpathId = getQuestionId(xpathCanSeveralScootersDropdownList);
        String answerXpath = getAnswerXpath(questionXpathId);

        return driver.findElement(By.xpath(answerXpath)).getText();
    }

    public String getWhatRentalTimeDropdownListAnswer() {
        String questionXpathId = getQuestionId(xpathWhatRentalTimeDropdownList);
        String answerXpath = getAnswerXpath(questionXpathId);

        return driver.findElement(By.xpath(answerXpath)).getText();
    }

    public String getCanOrderTodayDropdownListAnswer() {
        String questionXpathId = getQuestionId(xpathCanOrderTodayDropdownList);
        String answerXpath = getAnswerXpath(questionXpathId);

        return driver.findElement(By.xpath(answerXpath)).getText();
    }

    public String getCanProlongRentalTimeDropdownListAnswer() {
        String questionXpathId = getQuestionId(xpathCanProlongRentalTimeDropdownList);
        String answerXpath = getAnswerXpath(questionXpathId);

        return driver.findElement(By.xpath(answerXpath)).getText();
    }

    public String getIsChargingAddedDropdownListAnswer() {
        String questionXpathId = getQuestionId(xpathIsChargingAddedDropdownList);
        String answerXpath = getAnswerXpath(questionXpathId);

        return driver.findElement(By.xpath(answerXpath)).getText();
    }

    public String getCanCancelOrderDropdownListAnswer() {
        String questionXpathId = getQuestionId(xpathCanCancelOrderDropdownList);
        String answerXpath = getAnswerXpath(questionXpathId);

        return driver.findElement(By.xpath(answerXpath)).getText();
    }

    public String getCanMakeOrderOutsideMoscowDropdownListAnswer() {
        String questionXpathId = getQuestionId(xpathCanMakeOrderOutsideMoscowDropdownList);
        String answerXpath = getAnswerXpath(questionXpathId);

        return driver.findElement(By.xpath(answerXpath)).getText();
    }
    public boolean checkFAQPanel(By faqButton, By faqPanel, String faqData) {
        WebElement element = driver.findElement(faqButton);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(faqButton)).click();
        String text = driver.findElement(faqPanel).getText();
        return text.equals(faqData);
    }
}