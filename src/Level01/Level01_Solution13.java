package Level01;

class Solution13 {
	public boolean solution(String s) {
		boolean answer = true;
		
		if(s.length()==4 || s.length()==6) {
			try {
				int i = Integer.parseInt(s);
			} catch (Exception e) {
				answer = false;
			} finally {
				return answer;
			}
		} else {
			answer = false;
			return answer;
		}
	}
}

public class Level01_Solution13 {

	public static void main(String[] args) {

		String s = "11111";
		boolean answer = new Solution13().solution(s);
		System.out.println(answer);
	}
}
