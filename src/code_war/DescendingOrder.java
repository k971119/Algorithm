package code_war;

import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sortDesc(54793561));
	}
	
	public static int sortDesc(final int num) {
		String result = "";
		String[] sNumbers = String.valueOf(num).split("");
		Arrays.sort(sNumbers, Collections.reverseOrder());
		result = Arrays.toString(sNumbers).replaceAll("[^0-9]", "");
		
		return Integer.parseInt(result);
	}

}
