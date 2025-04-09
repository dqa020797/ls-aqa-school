package ru.ls.qa.school.core;

import org.junit.jupiter.api.RepeatedTest;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static ru.ls.qa.school.core.SkyScrapper.testCalculateGain;

public class SkyScrapperTests {

    SkyScrapper skyScrapper;

    @RepeatedTest(100000)
    void totalGainTest() {

        int firstFloorFlatSale = (int) (Math.random() * 10_000) + 1;
        int floorsCount = (int) (Math.random() * 10_000) + 1;
        int freqIncrease = (int) (Math.random() * 10_000) + 1;

        skyScrapper = SkyScrapper.builder()
                                 .firstFloorFlatSale(firstFloorFlatSale)
                                 .floorsCount(floorsCount)
                                 .freqIncrease(freqIncrease)
                                 .build();


        int actualResult = skyScrapper.totalGain();
        int expectedResult = testCalculateGain(skyScrapper);
        assertThat(actualResult).isEqualTo(expectedResult);
    }
}