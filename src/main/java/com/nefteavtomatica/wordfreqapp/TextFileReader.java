package com.nefteavtomatica.wordfreqapp;

import java.io.*;
import java.util.Optional;

import javax.lang.model.type.UnknownTypeException;

public class TextFileReader {
        private String fileName;

        public TextFileReader(String fileName) {
            this.fileName = fileName;
        } 

        public File getFile() throws Exception {
            String fileAbsName = "src/test/java/com/nefteavtomatica/wordfreqapp/"+fileName;
            File wordsToCountFile; 
            try {
                if (extensionIsTxt()) {} 
                else throw new UnknownTypeException(null, fileAbsName);
                return    wordsToCountFile = new File(fileAbsName);
            } catch (UnknownTypeException e) {
                System.out.println("unknown file type");
                e.printStackTrace(); 
            } catch (FileNotFoundException e) {
                System.out.println("can not find the file");
                e.printStackTrace(); 
            }
            return null;
            } 
    
        boolean extensionIsTxt() throws IOException {
            Optional<String> maybeExtension = getExtension();
            String extension = maybeExtension.orElseThrow(IOException::new);
                if ("txt".equals(extension)) 
                 return true;
            return false;           
        }
    
        private Optional<String> getExtension() {
            return Optional.ofNullable(fileName)
                 .filter(f -> f.contains("."))
                 .map(f -> f.substring(fileName.lastIndexOf(".") + 1));
        }
    }