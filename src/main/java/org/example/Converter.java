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
}
