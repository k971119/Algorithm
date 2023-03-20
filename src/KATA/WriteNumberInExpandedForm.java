package KATA;

public class WriteNumberInExpandedForm {

	public static void main(String[] args) {
		System.out.println(expandedForm(70304));
	}
	
	public static String expandedForm(int num) {
		String[] letters = String.valueOf(num).split("");
		String expand = "";
		String result = "";
		
		for(int i = 0; i < letters.length; i++) {
			expand = letters[i];
			if(!expand.equals("0")) {
				for(int j = i; j < letters.length-1; j++) {
					expand+="0";
				}
			}else {
				expand = "";
			}
			if(i==0) {
				result = expand;
			}else {
				result += expand.equals("")? "":(" + "+expand);
			}
		}
		return result;
	}
}
