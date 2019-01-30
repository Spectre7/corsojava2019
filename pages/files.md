# Reading - Writing text files

Note: this lesson will introduce a new concept (other than files): Exceptions and how to handle them.

## Reading
You can read text files using this class:
 - *FileReader* for text files in your system.  
 
*FileReader* (for text files) should usually be wrapped in a *BufferedFileReader*. This saves up data so you can deal with it a line at a time or whatever instead of character by character (which usually isn't much use). 

``` java
import java.io.*;

public class Test {
    public static void main(String [] args) {

        // The name of the file to open.
        String fileName = "temp.txt";

        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
    }
}
```



## Writing
 1) Writing text files is left as exercise.  
 2) Rifare l'esercizio precedente utilizzando *PrintWriter*.

