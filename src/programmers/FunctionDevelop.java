package programmers;

import java.util.ArrayList;

public class FunctionDevelop {

	public int[] solution(int[] progresses, int[] speeds) {
		ArrayList<Integer> result = new ArrayList<>();

		int successWorkCount = 0;
		int day = -1;

		for (int i = 0; i < progresses.length; i++) {

			while (progresses[i] + (day * speeds[i]) < 100) {

				day++;

				if (successWorkCount != 0) {
					result.add(successWorkCount);
					successWorkCount = 0;
				}
			}
			successWorkCount++;
			if (i == progresses.length - 1) { // 마지막은 강제로 넣어주자..
				result.add(successWorkCount);
			}
		}
		return result.stream().mapToInt(Integer::intValue).toArray();
	}

}
