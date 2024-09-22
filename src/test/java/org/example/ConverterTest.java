package org.example;

import org.junit.jupiter.api.Test;

import static org.example.Converter.checkRoman;
import static org.example.Converter.romanToArabic;
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
    void whenRomanIsNullThenReturnException() {
        assertThrows(IllegalArgumentException.class, ()-> romanToArabic(null));
    }

    @Test
    void whenRomanIsWrongThenReturnExceptionMMMM() {
        assertThrows(IllegalArgumentException.class, () -> romanToArabic("MMMM"));
    }

    @Test
    void whenRomanIsWrongThenReturnExceptionIIII() {
        assertThrows(IllegalArgumentException.class, () -> romanToArabic("IIII"));
    }

    @Test
    void testRomanToArabic1987() {
        assertEquals(1987, romanToArabic("MCMLXXXVII"));
    }

    @Test
    void testRomanToArabic900() {
        assertEquals(900, romanToArabic("CM"));
    }

    @Test
    void testRomanToArabic500() {
        assertEquals(500, romanToArabic("D"));
    }

    @Test
    void testRomanToArabicWithBlankInput() {
        assertFalse(checkRoman(""));
    }

    @Test
    void testCheckRomanWhenRoman(){
        assertTrue(checkRoman("MMXXI"));
    }

    @Test
    void testCheckRomanWhenNotRoman(){
        assertFalse(checkRoman("ABC"));
    }

    @Test
    void testCheckRomanWhenNull(){
        assertFalse(checkRoman(null));
    }



}