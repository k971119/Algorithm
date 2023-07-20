package code_war;

public class BitCounting {
	public static void main(String args[]) {
		
	}
	
	public static int countBits(int n) {
		String binary = Integer.toBinaryString(n);
		return (int)countChar(binary, '1');
	}
	
	public static long countChar(String bin, char ch) {
		return bin.chars().filter(c -> c == ch).count();
	}
}
