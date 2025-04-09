package ru.ls.qa.school.core;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class SkyScrapper {

    private Integer firstFloorFlatSale ;
    private Integer floorsCount ;
    private Integer freqIncrease ;


    public int totalGain() {
        int total = 0;
        int currentPrice = firstFloorFlatSale;

        for (int i = 1; i <= floorsCount; i++) {

            if ((i - 1) % freqIncrease == 0 && i > 1) {
                currentPrice = currentPrice + 1000;
            }
            total = total + currentPrice;
        }
        return total;
    }

    public static int testCalculateGain(SkyScrapper s) {
        int x = s.getFirstFloorFlatSale();
        int m = s.getFreqIncrease();
        int n = s.getFloorsCount();

        int k = n / m;
        int sum = x * n + 1000 * (m * (k - 1) * k / 2 + (n % m) * k);
        return sum;
    }
}