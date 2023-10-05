package test;

import PageObject.MainPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DropdownListQuestionsTests {
        private WebDriver driver;



        @Test
        public void checkHowMuchDropdownAnswer() {
            driver = new ChromeDriver();
            driver.get("https://qa-scooter.praktikum-services.ru/");

            MainPage mainPage = new MainPage(driver);

            mainPage.clickHowMuchDropdownList();
            Assert.assertEquals("Проверяем текст ответа",
                    "Сутки — 400 рублей. Оплата курьеру — наличными или картой.", mainPage.getHowMuchDropdownListAnswer());
        }

        @Test
        public void checkCanSeveralScootersDropdownListAnswer() {
            driver = new ChromeDriver();
            driver.get("https://qa-scooter.praktikum-services.ru/");

            MainPage mainPage = new MainPage(driver);

            mainPage.clickCanSeveralScootersDropdownList();
            Assert.assertEquals("Проверяем текст ответа",
                    "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.", mainPage.getCanSeveralScootersDropdownListAnswer());
        }

        @Test
        public void checkWhatRentalTimeDropdownListAnswer() {
            driver = new ChromeDriver();
            driver.get("https://qa-scooter.praktikum-services.ru/");

            MainPage mainPage = new MainPage(driver);

            mainPage.clickWhatRentalTimeDropdownList();
            Assert.assertEquals("Проверяем текст ответа",
                    "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.", mainPage.getWhatRentalTimeDropdownListAnswer());
        }

        @Test
        public void checkCanOrderTodayDropdownListAnswer() {
            driver = new ChromeDriver();
            driver.get("https://qa-scooter.praktikum-services.ru/");

            MainPage mainPage = new MainPage(driver);

            mainPage.clickCanOrderTodayDropdownList();
            Assert.assertEquals("Проверяем текст ответа",
                    "Только начиная с завтрашнего дня. Но скоро станем расторопнее.", mainPage.getCanOrderTodayDropdownListAnswer());
        }

        @Test
        public void checkCanProlongRentalTimeDropdownListAnswer() {
            driver = new ChromeDriver();
            driver.get("https://qa-scooter.praktikum-services.ru/");

            MainPage mainPage = new MainPage(driver);

            mainPage.clickCanProlongRentalTimeDropdownList();
            Assert.assertEquals("Проверяем текст ответа",
                    "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.", mainPage.getCanProlongRentalTimeDropdownListAnswer());
        }

        @Test
        public void checkIsChargingAddedDropdownListAnswer() {
            driver = new ChromeDriver();
            driver.get("https://qa-scooter.praktikum-services.ru/");

            MainPage mainPage = new MainPage(driver);

            mainPage.clickIsChargingAddedDropdownList();
            Assert.assertEquals("Проверяем текст ответа",
                    "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.", mainPage.getIsChargingAddedDropdownListAnswer());
        }

        @Test
        public void checkCanCancelOrderDropdownListAnswer() {
            driver = new ChromeDriver();
            driver.get("https://qa-scooter.praktikum-services.ru/");

            MainPage mainPage = new MainPage(driver);

            mainPage.clickCanCancelOrderDropdownList();
            Assert.assertEquals("Проверяем текст ответа",
                    "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.", mainPage.getCanCancelOrderDropdownListAnswer());
        }

        @Test
        public void checkCanMakeOrderOutsideMoscowDropdownListAnswer() {
            driver = new ChromeDriver();
            driver.get("https://qa-scooter.praktikum-services.ru/");

            MainPage mainPage = new MainPage(driver);

            mainPage.clickCanMakeOrderOutsideMoscowDropdownList();
            Assert.assertEquals("Проверяем текст ответа",
                    "Да, обязательно. Всем самокатов! И Москве, и Московской области.", mainPage.getCanMakeOrderOutsideMoscowDropdownListAnswer());
        }

        @After
        public void teardown() {
            // Закрываю браузер
            driver.quit();
        }
    }

