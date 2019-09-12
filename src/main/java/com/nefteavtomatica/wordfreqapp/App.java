package com.nefteavtomatica.wordfreqapp;

import java.util.*;

import javax.lang.model.type.UnknownTypeException;

import java.io.*;


public class App {

    public static void main(String[] args) {
        System.out.println("buy ");
        App app = new App();
    }

    public List<String> parseToList(File file) throws FileNotFoundException {
    Scanner scanner = new Scanner(file);
    List<String> wordsList = new ArrayList<>();
    while (scanner.hasNext())
        wordsList.add(scanner.next());
    scanner.close();
    return wordsList;
    }

    public File getFile(String fileName) throws Exception {
        String fileAbsName = "src/main/java/com/nefteavtomatica/wordfreqapp/"+fileName;
        File wordsToCountFile; 
        try {
            if (extensionIsTxtOf(fileAbsName)) {} 
            else throw new UnknownTypeException(null, fileAbsName);
            return    wordsToCountFile = new File(fileName);
        } catch (UnknownTypeException e) {
            System.out.println("unknown file type");
            e.printStackTrace(); 
        } catch (FileNotFoundException e) {
            System.out.println("can not find the file");
            e.printStackTrace(); 
        }
        return null;
        } 

    boolean extensionIsTxtOf(String file) throws IOException {
        Optional<String> maybeExtension = getExtension(file);
        String extension = maybeExtension.orElseThrow(IOException::new);
            if ("txt".equals(extension)) 
             return true;
        return false;           
    }

    private Optional<String> getExtension(String file) {
        return Optional.ofNullable(file)
             .filter(f -> f.contains("."))
             .map(f -> f.substring(file.lastIndexOf(".") + 1));
    }
}
    

   

