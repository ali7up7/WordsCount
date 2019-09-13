package com.nefteavtomatica.wordfreqapp;

import java.io.*;
import java.nio.file.Files;
import java.util.Optional;

import javax.lang.model.type.UnknownTypeException;

public class TextFileReader {
        private String fileName;
        private File file;

        public TextFileReader(String fileName) {
            this.fileName = fileName;
        } 

        public File getTxtFile() throws Exception{
            try {
            if (extensionIsTxt())  {
            } else
                throw new UnknownTypeException(null, fileName);
            readFile(fileName);    
            
            return null;
            } 

        private File readFile(String fileName){
            if (Files.exists("",fileName))
            return new File(fileName);
            } catch (UnknownTypeException e) {
                System.out.println("unknown file type");
                e.printStackTrace(); 
            } catch (FileNotFoundException e) {
                System.out.println("can not find the file");
                e.printStackTrace(); 
            }
            
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