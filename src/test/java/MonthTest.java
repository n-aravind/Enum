import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MonthTest {

    @Test
    void getDaysInJanuary2019(){
        assertEquals(31,Month.daysInAMonth(2019,Month.January));
    }

    @Test
    void getDaysInMarch2019(){
        assertEquals(31,Month.daysInAMonth(2019,Month.March));
    }

    @Test
    void getDaysInApril2019(){
        assertEquals(30,Month.daysInAMonth(2019,Month.April));
    }

    @Test
    void getDaysInMay2019(){
        assertEquals(31,Month.daysInAMonth(2019,Month.May));
    }

    @Test
    void getDaysInJune2019(){
        assertEquals(30,Month.daysInAMonth(2019,Month.June));
    }

    @Test
    void getDaysInJuly2019(){
        assertEquals(31,Month.daysInAMonth(2019,Month.July));
    }

    @Test
    void getDaysInAugust2019(){
        assertEquals(31,Month.daysInAMonth(2019,Month.August));
    }

    @Test
    void getDaysInSeptember2019(){
        assertEquals(30,Month.daysInAMonth(2019,Month.September));
    }

    @Test
    void getDaysInOctober2019(){
        assertEquals(31,Month.daysInAMonth(2019,Month.October));
    }

    @Test
    void getDaysInNovember2019(){
        assertEquals(30,Month.daysInAMonth(2019,Month.November));
    }

    @Test
    void getDaysInDecember2019(){
        assertEquals(31,Month.daysInAMonth(2019,Month.December));
    }

    @Test
    void getDaysInFebruaryNonLeapYear(){
        assertEquals(28,Month.daysInAMonth(2019,Month.February));
    }

    @Test
    void getDaysInFebruaryLeapYear(){
        assertEquals(29,Month.daysInAMonth(2020,Month.February));
    }

    @Test
    void getDaysInFebruaryCenturyYear(){
        assertEquals(28,Month.daysInAMonth(1900,Month.February));
    }

    @Test
    void getDaysInFebruaryCenturyDivisibleBy400Year(){
        assertEquals(29,Month.daysInAMonth(1600,Month.February));
    }
}