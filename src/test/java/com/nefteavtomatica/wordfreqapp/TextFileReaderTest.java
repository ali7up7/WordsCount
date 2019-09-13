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
    
}