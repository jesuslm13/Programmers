package Level01;

import java.util.Arrays;
import java.util.Comparator;

class Solution10 {
	public String[] solution(String[] strings, int n) {

		Arrays.sort(strings, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {

				int len = 0;
				boolean flag = true;

				if (o1.charAt(n) < o2.charAt(n)) {
					return -1;
				} else if (o1.charAt(n) == o2.charAt(n)) {
					while (flag) {
						if ((len > o1.length()) || (len > o2.length())) {
							flag = false;
							if (o1.length() < o2.length()) {
								return -1;
							} else {
								return 1;
							}
						} else {
							if (o1.charAt(len) == o2.charAt(len)) {
								len++;
								continue;
							} else {
								flag = false;
								if (o1.charAt(len) < o2.charAt(len)) {
									return -1;
								} else {
									return 1;
								}
							}
						}
					}
					return 0;
				} else {
					return 1;
				}
			}
		});

		String[] answer = strings;

		return answer;
	}
}

public class Level01_Solution10 {

	public static void main(String[] args) {

		String[] strings = { "abce", "abcd", "cdx" };
		int n = 2;
		String[] answer = new Solution10().solution(strings, n);

		for (String s : answer) {
			System.out.println(s);
		}

	}
}
