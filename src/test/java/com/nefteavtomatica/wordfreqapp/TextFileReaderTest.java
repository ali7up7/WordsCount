package com.nefteavtomatica.wordfreqapp;

import static org.junit.Assert.*;

import java.io.*;
import java.nio.file.*;

import org.junit.Test;

public class TextFileReaderTest{
    
    @Test (expected = NoSuchFileException.class)
    public void assertNoSuchFileExceptionThrown() throws Exception {
        TextFileReader textFileReader = new TextFileReader("no such file.txt");
        textFileReader.readFile();
              
    }
    

    @Test
    public void assertExtensionIsTxt() throws IOException {
        TextFileReader textFileReader = new TextFileReader("words.txt");
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