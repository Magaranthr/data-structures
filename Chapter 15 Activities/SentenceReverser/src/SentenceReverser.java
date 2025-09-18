import java.util.Scanner;
import java.util.Stack;

/**
 * Class for reversing the order of a sentence.
*/
public class SentenceReverser
{
    /**
     * Reverses the given sentence.
     *
     * @param sentence Sentence to be reversed.
     * @return reversed sentence.
    */
    public static String reverse(String sentence)
    {
    	Scanner scanner = new Scanner(sentence);
    	
        // Complete this method. Use a Stack.
        String reversed = "";
        Stack<String> words = new Stack<String>();
        while(scanner.hasNext()) {
            String word = scanner.next();
            if(word.contains("."))
            {   
                words.push(word.substring(0, word.length()-1));
                while(words.size()>0) {
                    if(words.size()==1) {
                        reversed += words.pop() + ". ";
                    }
                    else
                        reversed += words.pop() + " ";
                    
                }
                
                
            }
            else
                words.push(word);
        }

        return reversed;



    }
}
