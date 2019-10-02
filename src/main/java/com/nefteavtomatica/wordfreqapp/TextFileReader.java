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

        public File getFile() throws Exception{        
            readFile();
            return file;
            } 

        public void readFile() throws  IOException {
              File possiblyFile = new File(fileName);
              if (! possiblyFile.exists()) throw new NoSuchFileException(fileName);
              if (possiblyFile.canRead() ) file = possiblyFile;          
        }    
    }
