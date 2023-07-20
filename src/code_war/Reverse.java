package code_war;

import java.io.IOException;
import java.util.Arrays;

public class Reverse {
	public static void main(String[] args) throws IOException {
		System.out.println(reverseWords("This is an example!"));
	}
	
	public static String reverseWords(final String original)
	  {
	    String[] words = original.split(" ");
	    for(int c = 0; c < words.length; c++){
	      String word = words[c];
	      String[] letters = word.split("");
	      for(int i = 0; i < (letters.length/2); i++){
	        //swap
	        String temp = letters[i];
	        letters[i] = letters[letters.length-1-i];
	        letters[letters.length-1-i] = temp;
	        //swap
	      }
	      
	      words[c] = Arrays.toString(letters)
	    		  .replace("]", "")
	    		  .replace("[", "")
	    		  .replace(" ", "")
	    		  .replace(",", "")
	    		  .trim();
	    }
	    String result = "";
	    for(String w : words){
	    	w.replaceAll("[\\[,\\]]", "");
	    	result+=(w+" ");
	    }
	    return result.trim();
	  }
}