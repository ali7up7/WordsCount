package com.nefteavtomatica.wordfreqapp;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class TextFileReader {
        private String fileName;
        private File file;
        protected List<String> wordsList;

        public TextFileReader(String fileName) {
            this.fileName = fileName;
        } 

        public File getTxtFile() throws Exception{        
            readFile();
            return file;
            } 

        protected void readFile() throws  IOException {
              File possiblyFile = new File(fileName);
              if (! possiblyFile.exists()) throw new NoSuchFileException(fileName);
              if (possiblyFile.canRead() ) file = possiblyFile;          
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

        public void parseToList() throws FileNotFoundException {
            Scanner jogger = new Scanner(file);
            wordsList = new ArrayList<String>();
            while (jogger.hasNext())
                wordsList.add(jogger.next());
            jogger.close();
            }
    }