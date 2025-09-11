import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * This program checks which words in a file are not present in a dictionary.
*/
public class WordAnalysis
{
    public static void main(String[] args)
        throws FileNotFoundException
    {   Set<String> dictionary = readWords("Chapter 15 Class Notes/src/words");
        Set<String> documentWords = readWords("Chapter 15 Class Notes/src/war-and-peace.txt");
        for (String e:documentWords){
            if(!dictionary.contains(e)){
                System.out.println(e);
            }
        }
    }

    /**
     * Reads all words from a file.
     *
     * @param filename the name of the file
     * @return a set with all lowercased words in the file. Here, a
     * word is a sequence of upper- and lowercase letters.
    */
    public static Set<String> readWords(String filename)
        throws FileNotFoundException
    {   Set<String> words = new HashSet<>();
        Scanner scan = new Scanner(new File(filename), "UTF-8");
        scan.useDelimiter("[^a-zA-Z]+");
        while (scan.hasNext()) {
            words.add(scan.next().toLowerCase());

        }
        return words; 
    }
//how dare you say that I am not completing the code in the middle, I have completed it to the best of my ability!  

}
