package Level01;

import java.util.ArrayList;
import java.util.List;

class Solution18 {
	public String solution(String s, int n) {
		String answer = "";
		List<Character> lower_list = new ArrayList<Character>();
		List<Character> upper_list = new ArrayList<Character>();
		StringBuilder sb = new StringBuilder();
		
		for(int i=97, j=65; i<=122; i++, j++) {
			lower_list.add(new Character((char) i));
			upper_list.add(new Character((char) j));
		}
		
		char [] c_array = s.toCharArray();
		
		for(char c : c_array) {
			if(new Character(c).equals(' ')) {
				sb.append(" ");
			} else {
				if( Character.isLowerCase(c)) {	// 소문자
					try {
						sb.append(lower_list.get(lower_list.indexOf(c)+n));
					} catch(Exception e) {
						sb.append(lower_list.get(lower_list.indexOf(c)+n-lower_list.size()));
					}
				} else {
					try {
						sb.append(upper_list.get(upper_list.indexOf(c)+n));
					} catch(Exception e) {
						sb.append(upper_list.get(upper_list.indexOf(c)+n-upper_list.size()));
					}
				}
			}
		}
		
		answer = sb.toString();
		
		return answer;
	}
}

public class Level01_Solution18 {

	public static void main(String[] args) {
		
		String s = "a B z";
		int n = 4;
		
		String answer = new Solution18().solution(s, n);
		System.out.println(answer);
	}
}
