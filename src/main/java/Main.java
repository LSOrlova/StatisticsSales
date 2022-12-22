import ru.netology.Stats.StatsService;

public class Main {
    public static void main(String[] args) {
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long salesTotal = service.salesTotal(sales);
        System.out.println("Сумма всех продаж " + salesTotal);
        long salesAverage = service.salesAverage(sales);
        System.out.println("Средняя сумма продаж " + salesAverage);
        long maxMonth = service.maxSales(sales);
        System.out.println("Номер месяца, к котором был максимум продаж " + maxMonth);
        long minMonth = service.minSales(sales);
        System.out.println("Номер месяца, в котором был минимум продаж " + minMonth);
        int belowAvarage = service.belowAverage(sales);
        System.out.println("Количество месяцев с продажами ниже средних " + belowAvarage);
        int upperAvarage = service.upperAverage(sales);
        System.out.println("Количество месяцев с продажами выше средних " + upperAvarage);
    }


}
