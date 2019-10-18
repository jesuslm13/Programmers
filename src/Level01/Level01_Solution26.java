package Level01;

class Solution26 {
	public String solution(int num) {
		String answer = "";

		if (num % 2 == 0) {
			answer = "Even";
		} else {
			answer = "Odd";
		}
		return answer;
	}
}

public class Level01_Solution26 {

	public static void main(String[] args) {

		int num = 0;
		String answer = new Solution26().solution(num);
		System.out.println(answer);
	}
}
