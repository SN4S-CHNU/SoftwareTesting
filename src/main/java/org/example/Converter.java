package org.example;

/*
    @author sn4s
    @project LB1
    @class Converter
    @version 1
    @since 12.09.24 - 19:55
*/

import java.util.List;

public class Converter {
    public static String arabicToRoman(int number) {
        if (number < 1 || number > 3999) {
            return null;
        }

        List<RomanNumeral> romanNumerals = RomanNumeral.getReverseSortedValues();

        int i = 0;
        StringBuilder sb = new StringBuilder();

        while ((number > 0) && (i < romanNumerals.size())) {
            RomanNumeral currentSymbol = romanNumerals.get(i);
            if (currentSymbol.getValue() <= number) {
                sb.append(currentSymbol.name());
                number -= currentSymbol.getValue();
            } else {
                i++;
            }
        }

        return sb.toString();
    }

    public static Integer romanToArabic(String input) {


        if (!checkRoman(input)) {
            throw new IllegalArgumentException("Invalid roman");
        }
        String romanNumeral = input.toUpperCase();
        int result = 0;

        List<RomanNumeral> romanNumerals = RomanNumeral.getReverseSortedValues();

        int i = 0;

        while ((romanNumeral.length() > 0) && (i < romanNumerals.size())) {
            RomanNumeral symbol = romanNumerals.get(i);
            if (romanNumeral.startsWith(symbol.name())) {
                result += symbol.getValue();
                romanNumeral = romanNumeral.substring(symbol.name().length());
            } else {
                i++;
            }
        }

        return result;
    }

    public static boolean checkRoman(String roman) {
        if (roman == null || roman.isEmpty()) {
            return false;
        }
        String romanRegex = "^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$";
        return roman.matches(romanRegex);
    }
}
