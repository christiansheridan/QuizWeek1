import java.util.*;
public class LoopFun
{

    /**
     * Given a number, return the factorial of that number.
     * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
     * @param number
     * @return the factorial of the number
     */
    public int factorial(int number){
        int number1 = 1;
        int i;
        for(i = 2; i <= number; i++) 
            number1 *= i;
        return number1;
    }

    /**
     * Given a phrase, get the acronym of that phrase. Acronym is the combination of
     * the first character of each word in upper case.
     * For example, given "Ruby on Rails", this method will return "ROR"
     * @param phrase
     * @return Upper case string of the first letter of each word
     */
    public String acronym(String phrase) {
       
        String[] parts = phrase.split(" ");
        //This is what I wanted to do
        int i;
        int lengthOfString = parts.length;
        String part1 = "";
        for (i = 0; i < lengthOfString; i++){
         part1 += parts[i].substring(0,1).toUpperCase();
        }
        return part1;
    }
        
        /*String part1 = parts[0];
        String part2 = parts[1];
        String part3 = parts[2];
        
        String q = part1.substring(0,1).toUpperCase() + part2.substring(0,1).toUpperCase() + part3.substring(0,1).toUpperCase();
        return q;*/
    

    /**
     * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
     * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
     * at the end of the alphabet, it will wraps around.
     * For example:
     *  'a' => 'd'
     *  'w' => 'z'
     *  'x' => 'a'
     *  'y' => 'b'
     * @param word
     * @return the encrypted string by shifting each character by three character
     */
    public String encrypt(String word) {
        String word2 = "";
        int i;
        int lengthOfChar = word.length();
        for(i = 0; i <lengthOfChar; i++){
            char c = word.charAt(i);
            if (c > 'w')
            word2+= (char)(word.charAt(i) -23);
            else
            word2+= (char)(word.charAt(i) + 3);} 
            return word2;
            }
        }
