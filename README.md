# WordsCount
java+mvn counts words frequency in file

# Welcome to the WordsCount wiki!

## Features
WordsCount counts numbers of words in a file that allows its opening, e.g. .txt, .gitignore, .xml etc.

## Usage
### launch 
`java -Dfile.encoding=UTF-8 -cp "/$(pwd)/target/classes" com.nefteavtomatica.wordfreqapp.WordsCount` when launching terminal in /word-freq-app directory. Otherwise, provide the full path to target/classes. Or launch with debugger.

### utilizing
enter file name with extension e.g. words.txt

## Error Handling
Throws NoSuchFileException if there is no file with name entered in the current directory.
Throws IOException if file is not parsable.

