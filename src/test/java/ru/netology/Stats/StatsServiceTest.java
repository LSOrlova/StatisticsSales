package ru.netology.Stats;

import org.junit.jupiter.api.Assertions;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
    public void countSalesTotal() {
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 180;
        int actual = (int) service.salesTotal(sales);
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void countSalesAverage() {
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 15;
        int actual = (int) service.salesAverage(sales);
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void maxSales() {
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 8;
        int actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void minSales() {
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 9;
        int actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void belowAverage() {
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.belowAverage(sales);
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void upperAverage() {
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.upperAverage(sales);
        Assertions.assertEquals(expected, actual);
    }
}