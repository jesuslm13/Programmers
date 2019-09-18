package Level01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Solution08 {
	public int[] solution(int[] arr, int divisor) {

		int[] answer = new int[1];
		int flag = 0;
		List<Integer> list = new ArrayList<Integer>();

		for (int i : arr) {
			if (i % divisor == 0) {
				list.add(i);
			}
		}

		if (list.size() == 0) {
			answer[0] = -1;
		} else {
			list.sort(new Comparator<Integer>() {

				@Override
				public int compare(Integer o1, Integer o2) {

					if (o1 > o2) {
						return 1;
					} else if (o1 == o2) {
						return 0;
					} else {
						return -1;
					}
				}
			});

			answer = new int[list.size()];

			for (int i : list) {
				answer[flag] = i;
				flag++;
			}
		}

		return answer;
	}
}

public class Level01_Solution08 {

	public static void main(String[] args) {

		int[] arr = { 1, 9, 7, 3 };
		int divisor = 5;

		int[] answer = new Solution08().solution(arr, divisor);

		for (int i : answer) {
			System.out.print(i);
		}

	}
}
