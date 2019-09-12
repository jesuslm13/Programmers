package Level01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution03 {
    public int[] solution(int[] array, int[][] commands) {
        int [] answer = new int[commands.length];
        List<Integer> list=null;
        int i, j, k = 0;
        int flag = 0;
        
        for(int [] command : commands) {
        	list = new ArrayList<Integer>();
        	i = command[0];
        	j = command[1];
        	k = command[2];
        	
        	for(int arg=i-1; arg<j; arg++) {
        		list.add(array[arg]);
        	}
        	
        	Collections.sort(list);
        	System.out.println("list : "+list);
        	answer[flag] = list.get(k-1);
        	
        	flag++;
        }
        
        return answer;
    }
}

public class Level01_Solution03 {

	public static void main(String[] args) {
		
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int [] answer = new Solution03().solution(array, commands);
		
		for(int i : answer) {
			System.out.print(i);
		}
		
	}
}
