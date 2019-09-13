package com.nefteavtomatica.wordfreqapp;

import java.util.*;
import java.io.*;


public class WordsCount {
    protected File  file;
    protected List<String> wordsList;
    protected Map<String, Long> wordsFreqMap;

    public WordsCount(){
        
    }

    public static void main(String[] args) {
        System.out.println("----+-----");
    }

    public void countWordsFrequencies(){
        long wordFreq;
        wordsFreqMap = new HashMap<String, Long>();
        for (String word: wordsList){
            wordFreq = wordsList.stream().filter( f -> f.equals(word)).count();
            wordsFreqMap.putIfAbsent(word, wordFreq);
        }       
    }
    
    public void parseToList() throws FileNotFoundException {
        Scanner jogger = new Scanner(file);
        wordsList = new ArrayList<String>();
        while (jogger.hasNext())
            wordsList.add(jogger.next());
        jogger.close();
        }

    public void printWordsFrequencies(){
        System.out.println("table of words with their frequencies");
        wordsFreqMap.forEach((word, freq) -> System.out.printf("%15s  number is %d%n", word, freq));
    } 
    
    public  void setFile(String fileName) throws Exception {
        TextFileReader textFileReader = new TextFileReader(fileName);
        file = textFileReader.setFile();        
        }

        

}
    

   

