package test;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import pajeobject.MainPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static pajeobject.MainPage.howMuchDropdownList;
import static pajeobject.MainPage.canSeveralScootersDropdownList;
import static pajeobject.MainPage.whatRentalTimeDropdownList;
import static pajeobject.MainPage.canOrderTodayDropdownList;
import static pajeobject.MainPage.canProlongRentalTimeDropdownList;
import static pajeobject.MainPage.isChargingAddedDropdownList;
import static pajeobject.MainPage.canCancelOrderDropdownList;
import static pajeobject.MainPage.canMakeOrderOutsideMoscowDropdownList;
import static pajeobject.MainPage.faqPanel0;
import static pajeobject.MainPage.faqPanel1;
import static pajeobject.MainPage.faqPanel2;
import static pajeobject.MainPage.faqPanel3;
import static pajeobject.MainPage.faqPanel4;
import static pajeobject.MainPage.faqPanel5;
import static pajeobject.MainPage.faqPanel6;
import static pajeobject.MainPage.faqPanel7;


@RunWith(Parameterized.class)

    public class DropdownListQuestionsTests {
        private WebDriver driver;
    private final By faqButton;
    private final By faqPanel;
    private final String faqData;

        public DropdownListQuestionsTests (By faqButton, By faqPanel, String faqData) {
            this.faqButton = faqButton;
            this.faqPanel  = faqPanel;
            this.faqData   = faqData;

        }

        // Тестовые данные
        @Parameters(name = "Проверка Вопросов о важном. Тестовые данные: {0} {1} {2}")
        public static Object[][] getData() {
            return new Object[][] {
                    {howMuchDropdownList, faqPanel0,  "Сутки — 400 рублей. Оплата курьеру — наличными или картой."},
                    {canSeveralScootersDropdownList, faqPanel1,  "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."},
                    {whatRentalTimeDropdownList, faqPanel2,  "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."},
                    {canOrderTodayDropdownList, faqPanel3,  "Только начиная с завтрашнего дня. Но скоро станем расторопнее."},
                    {canProlongRentalTimeDropdownList, faqPanel4,  "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."},
                    {isChargingAddedDropdownList, faqPanel5,  "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."},
                    {canCancelOrderDropdownList, faqPanel6, "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."},
                    {canMakeOrderOutsideMoscowDropdownList, faqPanel7, "Да, обязательно. Всем самокатов! И Москве, и Московской области."},
            };
        }
    @Before
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
    }

        @Test
        public void checkTextFAQPannel() {
            boolean result;
            MainPage mainPage = new MainPage(driver);
            mainPage.open();
            result = mainPage.checkFAQPanel(faqButton, faqPanel, faqData);
            Assert.assertTrue(result);
        }


        @After
        public void teardown() {
            // Закрываю браузер
            driver.quit();
        }
    }

