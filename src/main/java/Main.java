import ru.netology.javaqa.CorpSales.services.Sales;

public class Main {
    public static void main(String[] args) {
        long[] statistic = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        Sales sales = new Sales();

        System.out.println(sales.maxSalesMonth(statistic)); // Месяц с максимальными продажами
        System.out.println(sales.minSalesMonth(statistic)); // Месяц с минимальными продажами
        System.out.println(sales.totalSales(statistic));    // Общая сумма продаж
        System.out.println(sales.averageSales(statistic));  // Средняя сумма продаж
        System.out.println(sales.monthsBelowAverage(statistic)); // Месяцы ниже среднего
        System.out.println(sales.monthsAboveAverage(statistic)); // Месяцы выше среднего
    }

}
