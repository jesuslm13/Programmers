package Level01;

class Solution22 {
	  public int[] solution(long n) {
	      int[] answer = new int[String.valueOf(n).length()];
	      long answer_temp = 0;
	      boolean loop_flag = true;
	      int count_flag = 0;
	      
	      while(loop_flag) {
	    	  answer_temp = n%10;
	    	  answer[count_flag] = (int) answer_temp;
	    	  n = n/10;
	    	  
	    	  if(n==0) {
	    		  loop_flag = false;
	    	  }
	    	  
	    	  count_flag++;
	      }
	      
	      return answer;
	  }
	}

public class Level01_Solution22 {

	public static void main(String[] args) {
		
		long n = 12345;
		int [] answer = new Solution22().solution(n);
		
		for(int i : answer) {
			System.out.printf("%d,", i);
		}
	}
}
