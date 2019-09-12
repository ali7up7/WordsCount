package com.nefteavtomatica.wordfreqapp;

import static org.junit.Assert.*;
import java.io.IOException;
import org.junit.Test;

public class TextFileReaderTest{
    @Test
    public void assertExtensionIsTxt() throws IOException {
        TextFileReader textFileReader = new TextFileReader("words to count frequency.txt");
        boolean shouldBeTrue = false;      
        shouldBeTrue = textFileReader.extensionIsTxt();
        assertTrue(shouldBeTrue);
    }

    @Test
    public void assertExtentionIsNotTxt() throws IOException {
        TextFileReader textFileReader = new TextFileReader("words to count frequency.avi");
        boolean shouldBeFalse = true;      
        shouldBeFalse = textFileReader.extensionIsTxt();
        assertFalse(shouldBeFalse);
    }
   }