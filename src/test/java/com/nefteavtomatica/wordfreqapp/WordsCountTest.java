package com.nefteavtomatica.wordfreqapp;

import static org.junit.Assert.*;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;
import junit.framework.TestCase;

/**
 * Unit test for simple WordsCount.
 */
public class WordsCountTest {
    @Test
    public void testOfCountWordsFrequencies(){

    }

    @Test
    public void testOfWordsListNotNull() throws Exception {
        WordsCount app = new WordsCount();
        File file = app.getFile("words to count frequency.txt");      
        List<String> wordsListShouldNotBeNull;
        wordsListShouldNotBeNull = app.parseToList(file);
        assertNotNull("should not be null",wordsListShouldNotBeNull);       
    }

    @Test
    public void testFileExtensionIsTxt() throws IOException {
        WordsCount app = new WordsCount();
        boolean shouldBeTrue = false;      
        shouldBeTrue = app.extensionIsTxtOf("somefilename.txt");
        assertTrue(shouldBeTrue);
    }

    @Test
    public void testFileExtensionIsNotTxt() throws IOException {
        WordsCount app = new WordsCount();
        boolean shouldBeFalse = true;      
        shouldBeFalse = app.extensionIsTxtOf("anotherfilename.avi");
        assertFalse(shouldBeFalse);
    }
}
