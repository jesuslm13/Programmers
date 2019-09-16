package Level01;

import java.util.Calendar;

class Solution05 {
	public String solution(int a, int b) {

		String answer = "";
		String[] week_list = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

		Calendar c = Calendar.getInstance();

		c.set(c.YEAR, 2016);
		c.set(c.MONTH, a-1);
		c.set(c.DATE, b);
		
		System.out.println(c.getTime());
		
		int week = c.get(c.DAY_OF_WEEK)-1;
		answer = week_list[week];
		
		return answer;
	}
}

public class Level01_Solution05 {

	public static void main(String[] args) {

		int a = 5;
		int b = 24;

		String answer = new Solution05().solution(a, b);
		System.out.println(answer);

	}
}
