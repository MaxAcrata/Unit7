package ru.netology.javaqa.CorpSales.services;

public class Sales {

    // TODO    номер месяца, в котором был пик продаж
    public int maxSalesMonth(long[] sales) {
        int maxMonth = 0; // Номер месяца с максимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // Если текущие продажи больше или равны предыдущему максимуму
                maxMonth = i; // Запоминаем текущий месяц как максимальный
            }
        }
        return maxMonth + 1; // Месяцы нумеруются с 1, индексы массива с 0
    }

    //  TODO   номер месяца, в котором был минимум продаж
    public int minSalesMonth(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }


    // TODO    сумма всех продаж;
    public long totalSales(long[] sales) {
        long total = 0;
        for (long sale : sales) {
            total += sale;
        }
        return total;
    }

    // TODO    средняя сумма продаж в месяц;
    public double averageSales(long[] sales) {
        if (sales.length == 0) {
            return 0; // Если массив пустой, возвращаем 0
        }
        long total = totalSales(sales); // Используем метод totalSales для расчета общей суммы
        return (double) total / sales.length;
    }


    // TODO    количество месяцев, в которых продажи были ниже среднего
    public int monthsBelowAverage(long[] sales) {
        double average = averageSales(sales); // Рассчитываем среднюю сумму продаж
        int count = 0;
        for (long sale : sales) {
            if (sale < average) { // Если продажи меньше среднего
                count++; // Увеличиваем счетчик
            }
        }
        return count;
    }

    //    TODO количество месяцев, в которых продажи были выше среднего

    public int monthsAboveAverage(long[] sales) {
        double average = averageSales(sales); // Рассчитываем среднюю сумму продаж
        int count = 0;
        for (long sale : sales) {
            if (sale > average) { // Если продажи больше среднего
                count++; // Увеличиваем счетчик
            }
        }
        return count;
    }
}
