package com.nefteavtomatica.wordfreqapp;

import static org.junit.Assert.*;
import java.io.File;
import java.util.List;
import org.junit.Test;


public class WordsCountTest {


    @Test
    public void testOfCountWordsFrequencies(){


    }

    @Test
    public void testOfWordsListNotNull() throws Exception {
        List<String> wordsListShouldNotBeNull;
        wordsListShouldNotBeNull = getWordsList("words to count frequency.txt").parseToList();
        assertNotNull("wordList should not be null",wordsListShouldNotBeNull);       
    }

    public WordsCount getWordsList(String fileName) throws Exception {
        TextFileReader textFileReader = new TextFileReader(fileName);
        File file = textFileReader.getFile();     
        WordsCount wordsCount = new WordsCount(file);      
        return wordsCount;
        }
}
