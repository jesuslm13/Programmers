package Level01;

import java.util.ArrayList;
import java.util.List;

class Solution14 {
	  public String solution(String[] seoul) {
	      
		  String answer = "";
	      String key = "Kim";
		  
	      List<String> list = new ArrayList<String>();
	      
	      for(String s : seoul) {
	    	  list.add(s);
	      }
	      
	      int i = list.indexOf(key);
	      
	      answer += "김서방은 "+i+"에 있다";
	      
	      return answer;
	  }
	}

public class Level01_Solution14 {

	public static void main(String[] args) {
		
		String[] seoul = {"Jane", "Kim"};	
		String answer = new Solution14().solution(seoul);
		
		System.out.println(answer);
	}
}
