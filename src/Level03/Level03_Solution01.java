package Level03;

import java.util.ArrayList;
import java.util.List;

class Solution01 {
    public String solution(int n) {
    	StringBuilder sb = new StringBuilder();
    	List<Integer> remainder_list = new ArrayList<Integer>();
        String answer = "";
        boolean flag = true;
        
        while(flag) {
        	int q = Math.floorDiv(n, 3);
        	int remainder = n%3;
        	
        	if(remainder != 0) {
        		n = q;
        		remainder_list.add(0, remainder);
        	} else {
        		n = q-1;
        		remainder = 4;
        		remainder_list.add(0, remainder);
        	}
        	
        	if(n == 0 || n == 1) {
        		if(n == 1) {
        			remainder_list.add(0, n);
        		}
        		flag = false;
        	}
        }
        
        for(int i : remainder_list) {
        	sb.append(i);
        }
        
        answer = sb.toString();
        
        return answer;
    }
}

public class Level03_Solution01 {

	public static void main(String[] args) {
		
		String answer = new Solution01().solution(3);
		System.out.println("answer : " + answer);
	}

}
