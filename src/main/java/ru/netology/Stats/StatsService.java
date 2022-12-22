package ru.netology.Stats;

import static java.lang.Long.sum;

public class StatsService {
    public long salesTotal(long[] sales) {
        long salesTotal = 0;
        for (int i = 0; i <= 11; i++) {
            salesTotal = salesTotal + sales[i];
        }
        return salesTotal;
    }

    public long salesAverage(long[] sales) {
        long salesAverage = 0;
        for (long i : sales) {
            salesAverage += i;
        }
        return salesAverage / sales.length;
    }
        public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }
    public int minSales(long[] sales) {
        int minMonth = 0;
        int monthForMin = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = monthForMin;
            }
            monthForMin = monthForMin + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int belowAverage(long[] sales) {
        int monthMinCounter = 0;
        for (long sale: sales) {
            if (sale < salesAverage(sales))
                monthMinCounter++;
        }
        return monthMinCounter;
    }
    public int upperAverage(long[] sales) {
        int monthMaxCounter = 0;
        for (long sale: sales) {
            if (sale > salesAverage(sales))
                monthMaxCounter++;
        }
        return monthMaxCounter;
    }
}
