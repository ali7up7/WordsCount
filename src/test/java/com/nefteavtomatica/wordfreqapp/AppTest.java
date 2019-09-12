package com.nefteavtomatica.wordfreqapp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.*;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;
import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest {
   
      



    
    @Test(expected = Exception.class)
    public void testWithNoFileThrowsException() throws Exception {
            App givenApp = new App();       
            givenApp.getFile("really not existing file.txt"); 
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
