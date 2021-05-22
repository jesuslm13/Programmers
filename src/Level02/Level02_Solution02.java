package Level02;

import java.util.PriorityQueue;

// Start : 21.05.23 00:26
// finish : 21.05.23 02:00

class Solution02 {
    public int solution(int[] scoville, int K) {
    	
    	PriorityQueue<Integer> pq = new PriorityQueue<Integer>(); 
    	int answer = 0;
    	int min_1;
    	int min_2;
    	int test_scoville;
    	boolean flag = true;
    	
    	for( int i : scoville) {
    		pq.add(i);
    	}
    	
//    	System.out.println("list size :: " + list.size());
    	
    	while(flag) {
//    		System.out.println("list[0] :: " + list.get(0));
    		if(pq.size() > 1) {
//    			System.out.println("한개 이상");
    			min_1 = pq.poll();
    			min_2 = pq.poll();
    			
//    			System.out.println("min_1 : " + min_1 + " / " + "min_2 : " + min_2);
    			
    			if(min_1 < K || min_2 < K) {
    				test_scoville = min_1 + (min_2 * 2);
//    				System.out.println("test_scoville  : " + test_scoville );
    				pq.add(test_scoville);
    				
    				answer ++;
    			} else {
    				flag = false;
    			}
    		} else {
    			if(pq.peek() < K) {
    				answer = -1;
    			}
    			
    			flag = false;
    		}
    	}
        
        return answer;
    }
}

public class Level02_Solution02 {

	public static void main(String[] args) {
		
		int[] scoville = {1, 2, 3, 9, 10, 12};
		
		int answer = new Solution02().solution(scoville, 7);
		System.out.println("answer : " + answer);
	}
}
