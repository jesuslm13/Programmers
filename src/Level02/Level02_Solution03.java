package Level02;

import java.util.LinkedList;
import java.util.List;

class Solution03 {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        List<Integer> list = new LinkedList<Integer>();
        
        for(int i : numbers) {
        	list.add(i);
        }
        
        
        
        return answer;
    }
}

public class Level02_Solution03 {

	public static void main(String[] args) {
		
		int[] numbers = {1, 1, 1, 1, 1};
		int target = 5;
		
		int answer = new Solution03().solution(numbers, target);
		System.out.println("answer : " + answer);
		
	}
}
