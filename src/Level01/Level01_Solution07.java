package Level01;

import java.util.*;

class Solution07 {
	public int[] solution(int []arr) {
		
        int[] answer = null;
        int flag = 0;
        List<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<arr.length; i++) {
        	if(i==0) {
        		list.add(flag, arr[i]);
        		flag ++;
        	} else if(i>0 && arr[i-1] != arr[i]) {
        		list.add(flag, arr[i]);
        		flag++;
        	} else {
        		continue;
        	}
        }
        
        answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++) {
        	answer[i]=list.get(i);
        }
        
        return answer;
	}
}

public class Level01_Solution07 {

	public static void main(String[] args) {
		
		int [] arr = {1,1,3,3,0,1,1};
		
		int [] answer = new Solution07().solution(arr);

		for(int i : answer) {
			System.out.print(i);
		}
	}
}
