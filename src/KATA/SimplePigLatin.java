package KATA;

public class SimplePigLatin {
	public static void main(String args[]) {
		System.out.println(pigIt("Pig latin is cool !!"));
	}
	
	public static String pigIt(String str) {
		return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
		/*
		String result = "";
		String[] words = str.split(" ");
		for(String word : words) {
			String combination = "";
			String letters[] = word.split("");
			for(int i = 1; i < letters.length; i++) {
				combination += letters[i];
			}
			combination += letters[0];
			if(combination.matches("^[a-zA-Z]*$")) {
				combination += "ay";
			}
			result += combination;
			result += " ";
		}
		
		return result.trim();
		*/
    }
}
