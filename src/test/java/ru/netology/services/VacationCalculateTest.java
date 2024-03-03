//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;
//import ru.netology.services.VacationCalculate;
//
//public class VacationCalculateTest {
//
//    @ParameterizedTest
//    @CsvSource({
//            "14888, 10000, 3000, 20000",
//            "1000, 100000, 60000, 150000"
//    })
//    public void firstTest(int expected, int income, int expenses, int threshold) {
//        VacationCalculate service = new VacationCalculate();
//
//        // int expected = 14888;
//        int actual = service.calculate(income, expenses, threshold);
//
//        Assertions.assertEquals(expected, actual);
//    }
//}
package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class VacationCalculateTest {
    @Test
    public void MonthVacationExample() {
        VacationCalculate service = new VacationCalculate();

        int expected = 3;
        int actual = service.calculate(10000, 3000, 20000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MonthVacationSecondExample() {
        VacationCalculate service = new VacationCalculate();

        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxMonthVacation() {
        VacationCalculate service = new VacationCalculate();

        int expected = 12;
        int actual = service.calculate(0, 0, 0);

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void elevenMonthVacation() {
        VacationCalculate service = new VacationCalculate();

        int expected = 11;
        int actual = service.calculate(90000, 0, 1);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minMonthVacation() {
        VacationCalculate service = new VacationCalculate();

        int expected = 1;
        int actual = service.calculate(1100, 100, 11000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nullMonthVacation() {
        VacationCalculate service = new VacationCalculate();

        int expected = 0;
        int actual = service.calculate(10000, 3000, 77001);

        Assertions.assertEquals(expected, actual);

    }
}
