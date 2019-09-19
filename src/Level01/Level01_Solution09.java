package Level01;

class Solution09 {
	  public long solution(int a, int b) {
	      long answer = 0;
	      
	      if(a>b) {
	    	  for(int i=b; i<=a; i++) {
	    		  answer+=i;
	    	  }
	      } else {
	    	  for(int i=a; i<=b; i++) {
	    		  answer+=i;
	    	  }
	      }
	      
	      return answer;
	  }
	}

public class Level01_Solution09 {

	public static void main(String[] args) {
		
		int a = 3;
		int b = 3;
		
		long answer = new Solution09().solution(a, b);
		System.out.println(answer);
	}
}
