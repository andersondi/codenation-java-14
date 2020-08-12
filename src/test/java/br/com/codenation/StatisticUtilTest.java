package br.com.codenation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StatisticUtilTest {

    @Test
    public void testAverage() {
        assertEquals( 3, StatisticUtil.average( new int[]{ 1, 2, 3, 4, 5 } ) );
    }

    @Test
    public void testMode() {
        assertEquals( 3, StatisticUtil.mode( new int[]{ 1, 2, 3, 3 } ) );
    }

    @Test
    public void testMedian() {
        assertEquals( 3, StatisticUtil.median( new int[]{ 1, 2, 3, 4, 5 } ) );
    }

    @Test
    public void testMedianWithEvenArrayUnOrderedAndNegativeNumbers() {
        assertEquals( -5, StatisticUtil.median( new int[]{ -8, -4, -7, -3, -5, -5 } ) );
    }

    @Test
    public void testMedianWithEvenArrayUnOrderedAndNegativeAndPositiveNumbers() {
        assertEquals( 1, StatisticUtil.median( new int[]{ -3, 4, -1, 3, -5, 6 } ) );
    }
}
