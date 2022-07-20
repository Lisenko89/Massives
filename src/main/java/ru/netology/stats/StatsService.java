package ru.netology.stats;

public class StatsService {
    public long summMounths(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long averageSale(long[] sales){
        long avr = summMounths(sales)/12;
        return avr;
    }

    public long maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public long minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public long lessAverage(long[] sales){
        long countless = 0;
        long average =  averageSale(sales);
        for (long sale : sales) {
            if (sale < average){
                countless++;
            }
        }
        return countless;
    }

    public long aboveAverage(long[] sales){
        long countabove = 0;
        long average =  averageSale(sales);
        for (long sale : sales) {
            if (sale > average){
                countabove++;
            }
        }
        return countabove;
    }
}
