package Level01;

class Solution19 {
	  public int solution(int n) {
	      int answer = 0;
	      
	      for(int i=1; i<=n; i++) {
	    	  if(n%i==0) {
	    		  answer+=i;
	    	  }
	      }
	      
	      return answer;
	  }
	}

public class Level01_Solution19 {

	public static void main(String[] args) {
		
		int n = 12;
		int answer = new Solution19().solution(n);
		System.out.println(answer);
	}
}
