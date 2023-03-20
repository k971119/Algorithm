package KATA;

public class SumOfDigits {
	public static void main(String args[]) {
		System.out.println(digital_root(1569877));
		System.out.println(digital_root2(1569877));
	}
	
	public static int digital_root(int n) {
		String letters[] = String.valueOf(n).split("");
		int result = 0;
		for(String num : letters) {
			result += Integer.parseInt(num);
		}
		if(result > 9) {
			result = digital_root(result);
		}
		return result;
	}
	
	public static int digital_root2(int n) {
	    return (n != 0 && n%9 == 0) ? 9 : n % 9;
	  }
}
