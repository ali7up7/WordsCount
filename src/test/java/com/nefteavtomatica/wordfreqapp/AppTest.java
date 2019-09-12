package com.nefteavtomatica.wordfreqapp;

import static org.junit.Assert.*;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;
import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest {
   
      



    

    @Test
    public void testOfWordsListNotNull() throws Exception {
        App app = new App();
        File file = app.getFile("words to count frequency.txt");      
        List<String> wordsListShouldNotBeNull;
        wordsListShouldNotBeNull = app.parseToList(file);
        assertNotNull("should not be null",wordsListShouldNotBeNull);       
    }

    @Test
    public void testFileExtensionIsTxt() throws IOException {
        App app = new App();
        boolean shouldBeTrue = false;      
        shouldBeTrue = app.extensionIsTxtOf("somefilename.txt");
        assertTrue(shouldBeTrue);
    }

    @Test
    public void testFileExtensionIsNotTxt() throws IOException {
        App app = new App();
        boolean shouldBeFalse = true;      
        shouldBeFalse = app.extensionIsTxtOf("anotherfilename.avi");
        assertFalse(shouldBeFalse);
    }

  




  
/** 
 * 
    String fileName =  "words to count frequency.txt";
 * 
    @Test
    public void wordsListShouldBe_Bad() throws IOException {
        try{
            App app=new App();
            app.getFile();            
        } catch (Exception e) {
        }    
    }
*/
}
