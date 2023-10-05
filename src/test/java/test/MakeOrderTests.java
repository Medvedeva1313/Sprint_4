package test;
import PageObject.MainPage;
import PageObject.OrderPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



@RunWith(Parameterized.class)
    public class MakeOrderTests {

        private final String name;
        private final String surname;
        private final String address;
        private final String subwayStation;
        private final String phoneNumber;
        private final String orderDate;
        private final String rentalPeriod;
        private final String colour;
        private final String comment;

        private WebDriver driver;

        public MakeOrderTests(String name,String surname,String address,String subwayStation,String phoneNumber,String orderDate,String rentalPeriod,String colour,String comment){
            this.name=name;
            this.surname=surname;
            this.address=address;
            this.subwayStation=subwayStation;
            this.phoneNumber=phoneNumber;
            this.orderDate=orderDate;
            this.rentalPeriod=rentalPeriod;
            this.colour=colour;
            this.comment=comment;
        }



        // Тестовые данные
        @Parameterized.Parameters
        public static Object[][] makingOrderVariations() {
            return new Object[][] {
                    { "Тест", "Тест", "Гризодубовой 5","ЦСКА","89997774455","04.10.2023","сутки","black","Позвонить за 20 минут"},
                    { "Тест", "Тест", "Гризодубовой 5","ЦСКА","84445556655","05.10.2023","двое суток","grey","ааа"},
            };
        }




        @Test
        public void checkMakingOrderfromHeader() {

            driver = new ChromeDriver();
            driver.get("https://qa-scooter.praktikum-services.ru/");

            MainPage mainPage = new MainPage(driver);
            mainPage.clickHeaderOrderButton();

            OrderPage orderPage = new OrderPage(driver);
            orderPage.setOrderFieldsFirstPage(name, surname, address, subwayStation, phoneNumber);
            orderPage.orderFirstPageNextButtonClick();
            orderPage.setOrderFieldsSecondPage(orderDate, rentalPeriod, colour, comment);
            orderPage.orderSecondPageOrderButtonClick();
            orderPage.orderSecondPageModalYesButtonClick();

            Assert.assertTrue(orderPage.isOrderSucceed());
        }

        @Test
        public void checkMakingOrderfromHome() {

            driver = new ChromeDriver();
            driver.get("https://qa-scooter.praktikum-services.ru/");

            MainPage mainPage = new MainPage(driver);
            mainPage.clickHomeOrderButton();

            OrderPage orderPage = new OrderPage(driver);
            orderPage.setOrderFieldsFirstPage(name, surname, address, subwayStation, phoneNumber);
            orderPage.orderFirstPageNextButtonClick();
            orderPage.setOrderFieldsSecondPage(orderDate, rentalPeriod, colour, comment);
            orderPage.orderSecondPageOrderButtonClick();
            orderPage.orderSecondPageModalYesButtonClick();

            Assert.assertTrue(orderPage.isOrderSucceed());

        }

        @After
        public void teardown() {
            // Закрываю браузер
            driver.quit();
        }
}
