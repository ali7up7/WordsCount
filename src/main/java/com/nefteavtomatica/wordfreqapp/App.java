package com.nefteavtomatica.wordfreqapp;

import java.util.*;

import javax.lang.model.type.UnknownTypeException;

import java.io.*;


public class App {

    public static void main(String[] args) {
        System.out.println("buy ");
        App app = new App();
       

    }



 

    public void readFile(String fileName) throws Exception {
        try {
            
            File wordsToCountFile = new File(
                    "src/main/java/com/nefteavtomatica/wordfreqapp/"+fileName);
            Scanner scanner = new Scanner(wordsToCountFile);
            List<String> wordsList = new ArrayList<>();

            while (scanner.hasNext())
                wordsList.add(scanner.next());
            scanner.close();
        } catch (UnknownTypeException e) {
            System.out.println("unknown file type");
            e.printStackTrace(); 
        } catch (FileNotFoundException e) {
            System.out.println("can not find the file");
            e.printStackTrace(); 
            throw new FileNotFoundException();
        }                
        } 
    


    public boolean extensionIsTxt(String file) throws IOException {
        Optional<String> maybeExtension = getExtension(file);
        String extension = maybeExtension.orElseThrow(IOException::new);
            if ("txt".equals(extension)) 
             return true;
        return false;           
    }

    public Optional<String> getExtension(String file) {
        return Optional.ofNullable(file)
             .filter(f -> f.contains("."))
             .map(f -> f.substring(file.lastIndexOf(".") + 1));
    }
    


}
    

   

