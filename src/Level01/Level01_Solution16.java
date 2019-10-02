package Level01;

class Solution16 {
	  public String solution(int n) {
	      String answer = "";
	      
	      StringBuilder sb = new StringBuilder();
	      
	      for(int i=1; i<=n; i++) {
	    	  if(i%2==1) {
	    		  sb.append("수");
	    	  } else {
	    		  sb.append("박");
	    	  }
	      }
	      
	      answer = sb.toString();
	      
	      return answer;
	  }
	}

public class Level01_Solution16 {

	public static void main(String[] args) {
		
		int n = 3;
		String answer = new Solution16().solution(n);
		System.out.println(answer);
	}
}
