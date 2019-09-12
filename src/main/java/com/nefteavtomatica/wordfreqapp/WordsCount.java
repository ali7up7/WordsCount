package com.nefteavtomatica.wordfreqapp;

import java.util.*;

import javax.lang.model.type.UnknownTypeException;

import java.io.*;


public class WordsCount {
    protected String fileName;
    private File  wordsToCountFile;

    public static void main(String[] args) {
        System.out.println("buy ");
    }





   

    public Map<String, Long> countWordsFrequencies(List<String> wordsList){
        Map<String, Long> wordsFreqsMap= new HashMap<String, Long>();
        long wordFreq;
        for (String word: wordsList){
            wordFreq = wordsList.stream().filter( f -> f.contains(word)).count();
            wordsFreqsMap.putIfAbsent(word, wordFreq);
        }   
        return  wordsFreqsMap;    
    }
    
    public List<String> parseToList(File file) throws FileNotFoundException {
        Scanner jogger = new Scanner(file);
        List<String> wordsList = new ArrayList<>();
        while (jogger.hasNext())
            wordsList.add(jogger.next());
        jogger.close();
        return wordsList;
        }

        

}
    

   

