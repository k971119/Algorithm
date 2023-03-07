package KATA;

import static java.util.Arrays.stream;

public class oddOrEven {
	public static void main(String args[]) {
		
	}
	
	public static String oddOrEven(int[] array) {
		//return stream(array).sum() % 2 == 0? "even":"odd";			//한줄짜리 코드
		int sum = 0;
		for(int a : array) {
			sum += a;
		}
		switch(sum%2) {
		case 0 : return "even";
		case 1 : return "odd";
		}
		return null;
	}
}
