package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
    @author sn4s
    @project LB1
    @class ConverterTest
    @version 
    @since 12.09.24 - 20:10
*/

public class ConverterTest {

    @Test
    public void whenNumberLowerThan_1ThenReturnNull() {
        assertNull(Converter.arabicToRoman(0));
    }

    @Test
    public void whenNumberGreaterThan_3999ThenReturnNull() {
        assertNull(Converter.arabicToRoman(4000));
    }

    @Test
    public void whenNumberIsNegativeThenReturnNull() {
        assertNull( Converter.arabicToRoman(-5));
    }

    @Test
    void testNumber1() {
        assertEquals("I", Converter.arabicToRoman(1));
    }

    @Test
    void testNumber2() {
        assertEquals("II", Converter.arabicToRoman(2));
    }

    @Test
    void testNumber3() {
        assertEquals("III", Converter.arabicToRoman(3));
    }

    @Test
    void testNumber4() {
        assertEquals("IV", Converter.arabicToRoman(4));
    }

    @Test
    void testNumber5() {
        assertEquals("V", Converter.arabicToRoman(5));
    }

    @Test
    void testNumber6() {
        assertEquals("VI", Converter.arabicToRoman(6));
    }

    @Test
    void testNumber9() {
        assertEquals("IX", Converter.arabicToRoman(9));
    }

    @Test
    void testNumber10() {
        assertEquals("X", Converter.arabicToRoman(10));
    }

    @Test
    void testNumber11() {
        assertEquals("XI", Converter.arabicToRoman(11));
    }

    @Test
    void testNumber14() {
        assertEquals("XIV", Converter.arabicToRoman(14));
    }

    @Test
    void testNumber15() {
        assertEquals("XV", Converter.arabicToRoman(15));
    }

    @Test
    void testNumber19() {
        assertEquals("XIX", Converter.arabicToRoman(19));
    }

    @Test
    void testNumber20() {
        assertEquals("XX", Converter.arabicToRoman(20));
    }

    @Test
    void testNumber40() {
        assertEquals("XL", Converter.arabicToRoman(40));
    }

    @Test
    void testNumber50() {
        assertEquals("L", Converter.arabicToRoman(50));
    }

    @Test
    void testNumber90() {assertEquals("XC", Converter.arabicToRoman(90)); }

    @Test
    void testNumber100() {
        assertEquals("C", Converter.arabicToRoman(100));
    }

    @Test
    void testNumber400() {
        assertEquals("CD", Converter.arabicToRoman(400));
    }

    @Test
    void testNumber500() {
        assertEquals("D", Converter.arabicToRoman(500));
    }

    @Test
    void testNumber900() {
        assertEquals("CM", Converter.arabicToRoman(900));
    }

    @Test
    void testNumber1000() {
        assertEquals("M", Converter.arabicToRoman(1000));
    }

    @Test
    void testNumber1987() {
        assertEquals("MCMLXXXVII", Converter.arabicToRoman(1987));
    }

    @Test
    void testNumber2023() {
        assertEquals("MMXXIII", Converter.arabicToRoman(2023));
    }

    @Test
    void testNumber3012(){
        assertEquals("MMMXII", Converter.arabicToRoman(3012));
    }

    @Test
    void testNumber3999() {
        assertEquals("MMMCMXCIX", Converter.arabicToRoman(3999));
    }

    @Test
    void testNumber44() {
        assertEquals("XLIV", Converter.arabicToRoman(44));
    }

    @Test
    void testNumber99() {
        assertEquals("XCIX", Converter.arabicToRoman(99));
    }

    @Test
    void testNumber349() {
        assertEquals("CCCXLIX", Converter.arabicToRoman(349));
    }

    @Test
    void testNumber798() {
        assertEquals("DCCXCVIII", Converter.arabicToRoman(798));
    }

    @Test
    void testNumber1500() {
        assertEquals("MD", Converter.arabicToRoman(1500));
    }

    @Test
    void testNumber2421() {
        assertEquals("MMCDXXI", Converter.arabicToRoman(2421));
    }

    @Test
    void testNumber3500() {
        assertEquals("MMMD", Converter.arabicToRoman(3500));
    }

    @Test
    void testNumber3990() {
        assertEquals("MMMCMXC", Converter.arabicToRoman(3990));
    }

    @Test
    void testNumber1789() {
        assertEquals("MDCCLXXXIX", Converter.arabicToRoman(1789));
    }

    @Test
    void testNumber2468() {
        assertEquals("MMCDLXVIII", Converter.arabicToRoman(2468));
    }

    @Test
    void testNumber148() {
        assertEquals("CXLVIII", Converter.arabicToRoman(148));
    }

    @Test
    void testNumber144() {
        assertEquals("CXLIV", Converter.arabicToRoman(144));

    }

}