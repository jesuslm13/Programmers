package Level01;

class Solution15 {
	public int solution(int n) {
		int answer = 0;

		boolean[] list = new boolean[n + 1];

		// list up
		for (int i = 0; i <= n; i++) {
			if ((i == 0) || (i == 1)) {
				list[i] = false;
			} else {
				list[i] = true;
			}
		}

		// 소수 선별
		for (int i = 2; i <= n; i++) {
			if (list[i] == true) {
				for (int j = 2; i * j <= n; j++) {
					list[i * j] = false;
				}
			}
		}

		// 소수 갯수
		for (boolean b : list) {
			if (b == true) {
				answer++;
			}
		}

		return answer;
	}
}

public class Level01_Solution15 {

	public static void main(String[] args) {

		int n = 10;
		int answer = new Solution15().solution(n);
		System.out.println(answer);
	}
}
