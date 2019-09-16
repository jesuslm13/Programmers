package Level01;

class Solution06 {
	  public String solution(String s) {
	      String answer = "";
	      
	      int len = s.length();
	      System.out.println(len);
	      if(len%2 ==0) {
	    	  answer = s.substring((len/2)-1, (len/2)+1); 
	      } else {
	    	  answer = s.substring((len/2), (len/2)+1);
	      }
	      
	      return answer;
	  }
	}

public class Level01_Solution06 {
	public static void main(String[] args) {
		
		String s = "abcde";
		String answer = new Solution06().solution(s);
		
		System.out.println(answer);
	}
}
