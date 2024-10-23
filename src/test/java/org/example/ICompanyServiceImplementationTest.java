package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/*
    @author sn4s
    @project SoftwareTesting
    @class org.example
    @version 
    @SE 21.09.24 - 12:43
*/

class ICompanyServiceImplementationTest {
    private final Company Alphabet = new Company(null, 5);
    private final Company Google = new Company(Alphabet, 4);
    private final Company Android = new Company(Google, 3);
    private final Company Pixel = new Company(Google, 7);
    private final Company AOSP = new Company(Android, 6);
    private final Company Chrome = new Company(Google, 5);
    private final Company Chromium = new Company(Chrome, 4);
    private final Company AI = new Company(Google, 4);
    private final Company Gemini = new Company(AI, 4);
    private final Company Ad = new Company(Google, 3);

    List<Company> companies = List.of(Alphabet, Google, Android, Pixel, AOSP, Chrome, Chromium, AI, Gemini, Ad);
    
    private final ICompanyService testing = new ICompanyServiceImplementation();
    
    @Test
    void whenCompanyIsAlphabetThenTopLevelParentIsAlphabet() {
        Company result = testing.getTopLevelParent(Alphabet);
        Assertions.assertEquals(Alphabet, result);
    }

    @Test
    void whenCompanyIsGoogleThenTopLevelParentIsAlphabet() {
        Company result = testing.getTopLevelParent(Google);
        Assertions.assertEquals(Alphabet, result);
    }

    @Test
    void whenCompanyIsAndroidThenTopLevelParentIsAlphabet() {
        Company result = testing.getTopLevelParent(Android);
        Assertions.assertEquals(Alphabet, result);
    }

    @Test
    void whenCompanyIsPixelThenTopLevelParentIsAlphabet() {
        Company result = testing.getTopLevelParent(Pixel);
        Assertions.assertEquals(Alphabet, result);
    }

    @Test
    void whenCompanyIsAOSPThenTopLevelParentIsAlphabet() {
        Company result = testing.getTopLevelParent(AOSP);
        Assertions.assertEquals(Alphabet, result);
    }

    @Test
    void whenCompanyIsChromeThenTopLevelParentIsAlphabet() {
        Company result = testing.getTopLevelParent(Chrome);
        Assertions.assertEquals(Alphabet, result);
    }

    @Test
    void whenCompanyIsChromiumThenTopLevelParentIsAlphabet() {
        Company result = testing.getTopLevelParent(Chromium);
        Assertions.assertEquals(Alphabet, result);
    }

    @Test
    void whenCompanyIsAIThenTopLevelParentIsAlphabet() {
        Company result = testing.getTopLevelParent(AI);
        Assertions.assertEquals(Alphabet, result);
    }

    @Test
    void whenCompanyIsGeminiThenTopLevelParentIsAlphabet() {
        Company result = testing.getTopLevelParent(Gemini);
        Assertions.assertEquals(Alphabet, result);
    }

    @Test
    void whenCompanyIsAdThenTopLevelParentIsAlphabet() {
        Company result = testing.getTopLevelParent(Ad);
        Assertions.assertEquals(Alphabet, result);
    }







    @Test
    void whenCompanyIsAlphabetThenEmployeeCountIncludesAllCompanies() {
        long result = testing.getEmployeeCountForCompanyAndChildren(Alphabet, companies);
        Assertions.assertEquals(5 + 4 + 3 + 7 + 6 + 5 + 4 + 4 + 4 + 3, result);
    }

    @Test
    void whenCompanyIsGoogleThenEmployeeCountIncludesOnlyItself() {
        long result = testing.getEmployeeCountForCompanyAndChildren(Google, companies);
        Assertions.assertEquals(40, result);
    }

    @Test
    void whenCompanyIsAndroidThenEmployeeCountIncludesOnlyItself() {
        long result = testing.getEmployeeCountForCompanyAndChildren(Android, companies);
        Assertions.assertEquals(9, result);
    }

    @Test
    void whenCompanyIsPixelThenEmployeeCountIncludesPixelAndItsChildren() {
        long result = testing.getEmployeeCountForCompanyAndChildren(Pixel, companies);
        Assertions.assertEquals(7, result);
    }

    @Test
    void whenCompanyIsAOSPThenEmployeeCountIncludesOnlyItself() {
        long result = testing.getEmployeeCountForCompanyAndChildren(AOSP, companies);
        Assertions.assertEquals(6, result);
    }

    @Test
    void whenCompanyIsChromeThenEmployeeCountIncludesChromeAndItsChildren() {
        long result = testing.getEmployeeCountForCompanyAndChildren(Chrome, companies);
        Assertions.assertEquals(5 + 4, result);
    }

    @Test
    void whenCompanyIsChromiumThenEmployeeCountIncludesOnlyItself() {
        long result = testing.getEmployeeCountForCompanyAndChildren(Chromium, companies);
        Assertions.assertEquals(4, result);
    }

    @Test
    void whenCompanyIsAIThenEmployeeCountIncludesAIAndItsChildren() {
        long result = testing.getEmployeeCountForCompanyAndChildren(AI, companies);
        Assertions.assertEquals(4 + 4 , result);
    }

    @Test
    void whenCompanyIsGeminiThenEmployeeCountIncludesOnlyItself() {
        long result = testing.getEmployeeCountForCompanyAndChildren(Gemini, companies);
        Assertions.assertEquals(4, result);
    }

    @Test
    void whenCompanyIsAdThenEmployeeCountIncludesOnlyItself() {
        long result = testing.getEmployeeCountForCompanyAndChildren(Ad, companies);
        Assertions.assertEquals(3, result);
    }
}