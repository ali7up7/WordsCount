package com.nefteavtomatica.wordfreqapp;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.Test;

/**
 * Unit test for simple WordsCount.
 */
public class WordsCountTest {
    @Test
    public void testOfCountWordsFrequencies(){

    }

    @Test
    public void testOfWordsListNotNull() throws Exception {
        WordsCount wordsCount = new WordsCount();
        TextFileReader textFileReader = new TextFileReader("words to count frequency.txt");
        File file = textFileReader.getFile();     
        List<String> wordsListShouldNotBeNull;
        wordsListShouldNotBeNull = wordsCount.parseToList(file);
        assertNotNull("should not be null",wordsListShouldNotBeNull);       
    }

    @Test
    public void assertExtensionIsTxt() throws IOException {
        TextFileReader textFileReader = new TextFileReader("words to count frequency.txt");
        boolean shouldBeTrue = false;      
        shouldBeTrue = textFileReader.extensionIsTxtOf("somefilename.txt");
        assertTrue(shouldBeTrue);
    }

    @Test
    public void assertExtentionIsNotTxt() throws IOException {
        TextFileReader textFileReader = new TextFileReader("words to count frequency.txt");
        boolean shouldBeFalse = true;      
        shouldBeFalse = textFileReader.extensionIsTxtOf("anotherfilename.avi");
        assertFalse(shouldBeFalse);
    }


}
