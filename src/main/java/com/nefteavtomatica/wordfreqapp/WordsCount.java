package com.nefteavtomatica.wordfreqapp;

import java.util.*;
import java.io.*;


public class WordsCount {
    private File  file;

    public WordsCount(File file){
        this.file = file;
    }

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
    
    public List<String> parseToList() throws FileNotFoundException {
        Scanner jogger = new Scanner(file);
        List<String> wordsList = new ArrayList<>();
        while (jogger.hasNext())
            wordsList.add(jogger.next());
        jogger.close();
        return wordsList;
        }

        

}
    

   

