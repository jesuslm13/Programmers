package Level01;

class Solution20 {
	  public String solution(String s) {
	      
		  String answer = "";
		  int flag = 0;
		  
		  char [] c_array = s.toCharArray();
		  
		  for(int i=0; i<c_array.length; i++) {
			  if(Character.isWhitespace(c_array[i])) {
				  flag = 0;
				  continue;
			  } else {
				  if(flag%2 == 0) {
					  c_array[i] = Character.toUpperCase(c_array[i]);
					  flag++;
				  } else {
					  c_array[i] = Character.toLowerCase(c_array[i]);
					  flag++;
				  }
			  }
		  }
		  
		  for(char c : c_array) {
			  answer += Character.toString(c);
		  }
		  
	      return answer;
	  }
	}

public class Level01_Solution20 {

	public static void main(String[] args) {
		
		String s = "aaa bbb  ccc";
		String answer = new Solution20().solution(s);
		System.out.println(answer);
		
	}
}
