package Level01;

class Solution17 {
	public int solution(String s) {
		int answer = 0;

		try {
			answer = Integer.parseInt(s);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return answer;
		}

	}
}

public class Level01_Solution17 {

	public static void main(String[] args) {

		String s = "+1234";
		int answer = new Solution17().solution(s);
		System.out.println(answer);
	}
}
