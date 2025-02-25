package ru.netology.javaqa.CorpSales.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SalesTest {


    private Sales sales; // Объект класса Sales
    private long[] salesStatistic; // Массив статистики продаж

    // метод будет выполняться перед каждым тестом, инициализируя общую переменную для всех тестов
    @BeforeEach
    public void setUp() {
        // Инициализация объекта и массива перед каждым тестом
        sales = new Sales();
        salesStatistic = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    }

    @Test


    public void calculateMaxSalesMonth() {

        // вызываем целевой метод:
        int actual = sales.maxSalesMonth(salesStatistic);
        int expected = 8;

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test


    public void calculateMinSalesMonth() {

        // вызываем целевой метод:
        int actual = sales.minSalesMonth(salesStatistic);
        int expected = 9;

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test


    public void calculateTotalSalesSum() {

        // вызываем целевой метод:
        long actual = sales.totalSales(salesStatistic);
        long expected = 180;

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test


    public void calculateAverageSalesSum() {

        // вызываем целевой метод:
        double actual = sales.averageSales(salesStatistic);
        double expected = 15.0;

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test


    public void calculateMonthBelowAverage() {

        // вызываем целевой метод:
        int actual = sales.monthsBelowAverage(salesStatistic);
        int expected = 5;

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test


    public void calculateMonthsAboveAverage() {

        // вызываем целевой метод:
        int actual = sales.monthsAboveAverage(salesStatistic);
        int expected = 5;

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}


