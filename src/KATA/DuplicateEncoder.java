package KATA;

import java.util.ArrayList;
import java.util.Collections;

public class DuplicateEncoder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(encode("   ()(   "));
	}
	public static String encode(String word) {
		final ArrayList<Character> chars = new ArrayList<>();
        final StringBuilder line = new StringBuilder();

        for (char c : word.toLowerCase().toCharArray()) {
            chars.add(c);
        }

        for (char c : chars) {
            if (Collections.frequency(chars,c) > 1) {
                line.append(")");
            } else {
                line.append("(");
            }
        }

        return new String(line);
	}
}
