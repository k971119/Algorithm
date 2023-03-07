package KATA;

public class BuildTower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		towerBuilder(3);
	}
	
	public static void towerBuilder(int nFloors) {
		int lSide = nFloors;
		int rSide = nFloors;
		for(int h = 0; h < nFloors; h++) {		//Height
			for(int w = 0; w < nFloors+h; w++) {
				System.out.print((lSide <= w+1) && (rSide >= w+1)? "*":" ");
			}
			lSide--;
			rSide++;
			System.out.println();
		}
	}
}
