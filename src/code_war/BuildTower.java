package code_war;

public class BuildTower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(String floor : towerBuilder(5)) {
			System.out.println(floor);
		}
	}
	
	public static String[] towerBuilder(int nFloors) {
		/*
		int lSide = nFloors;
		int rSide = nFloors;
		
		String[] result = new String[nFloors];
		
		for(int h = 0; h < nFloors; h++) {		//Height
			String Floor = "";
			for(int w = 0; w < nFloors+h; w++) {
				Floor += ((lSide <= w+1) && (rSide >= w+1)? "*":" ");
			}
			if((nFloors*2)-1 > Floor.length()) {
				for(int i = Floor.length(); i < (nFloors*2)-1; i++) {
					Floor+=" ";
				}
			}
			result[h] = Floor;
			lSide--;
			rSide++;
		}
		return result;
		*/
		String t[] = new String[nFloors], e;
	    
	    for (int i = 0; i < nFloors; i++)
	      t[i] = (e = " ".repeat(nFloors-i-1)) + "*".repeat(i+i+1) + e;
	    
	    return t;
	}
}
