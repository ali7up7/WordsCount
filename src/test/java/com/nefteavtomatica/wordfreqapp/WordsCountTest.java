package com.nefteavtomatica.wordfreqapp;

import java.io.File;
import java.util.*;

import static org.junit.Assert.*;
import org.junit.Test;


public class WordsCountTest {


    @Test
    public void  assertWordsFreqMapNotNull() throws Exception {
        WordsCount wordsCount = getWordsCount("words to count frequency.txt");
        List<String> wordsList = wordsCount.parseToList(); 
        Map<String, Long> wordsFreqMap = wordsCount.countWordsFrequencies();
        assertNotNull(wordsFreqMap);       
    }

    @Test
    public void testOfWordsListNotNull() throws Exception {
        List<String> wordsListShouldNotBeNull;
        WordsCount wordsCount = getWordsCount("words to count frequency.txt");
        wordsListShouldNotBeNull = wordsCount.parseToList();
        assertNotNull("wordList should not be null",wordsListShouldNotBeNull);       
    }

    //to-do: delete?
    public List<String> getWordsList(String fileName) throws Exception{
        WordsCount wordsCount = getWordsCount(fileName); 
        List<String> wordsList = wordsCount.parseToList();
        return wordsList;
    }

    public  WordsCount getWordsCount(String fileName) throws Exception {
        TextFileReader textFileReader = new TextFileReader(fileName);
        File file = textFileReader.getFile();     
        WordsCount wordsCount = new WordsCount(file);    
        return wordsCount;
        }
}
