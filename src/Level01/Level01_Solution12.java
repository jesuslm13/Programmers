package Level01;

import java.util.Arrays;
import java.util.Comparator;

class Solution12 {
	  public String solution(String s) {
	      String answer = "";
	      String [] s_array = new String[s.length()];
	      
	      for(int i=0; i<s.length(); i++) {
	    	  s_array[i] = s.valueOf(s.charAt(i));
	      }
	      
	      Arrays.sort(s_array, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				if(o1.charAt(0) > o2.charAt(0)) {
					return -1;
				} else if(o1.charAt(0) == o2.charAt(0)) {
					return 0;
				} else {
					return 1;
				}
			}
		});
	      
	      for(String res : s_array) {
	    	  answer+=res;
	      }
	      
	      return answer;
	  }
	}

public class Level01_Solution12 {

	public static void main(String[] args) {
		
		String s = "Zbcdefg";
		
		String answer = new Solution12().solution(s);
		
		System.out.println(answer);
	}
}
