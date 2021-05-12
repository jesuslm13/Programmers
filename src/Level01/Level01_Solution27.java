package Level01;

import java.util.ArrayList;
import java.util.List;

class Solution27 {
	
    public int solution(int[] nums) {
    	
    	int startflag_1st = 0;
    	int startflag_2nd = 1;
    	int startflag_3rd = 2;
    	
    	int endflag_1st = nums.length-3;
    	int endflag_2nd = nums.length-2;
    	int endflag_3rd = nums.length-1;
    	
    	int max_num = new Solution27().getMaxNum(nums);
    	
    	int sumRes = 0;
    	List<Integer> answer_list = new ArrayList<Integer>();
        int answer = 0;
        
        for(int i=startflag_1st; i<=endflag_1st; i++) {
        	for(int j=i+1; j<=endflag_2nd; j++) {
        		for(int k=j+1; k<=endflag_3rd; k++) {
        			
        			sumRes = nums[i] + nums[j] + nums[k];
        			System.out.println("sumRes : " + sumRes);
        			for(int l = 2; l<sumRes; l++) {
        				if(Math.floorMod(sumRes, l) == 0 && sumRes%l == sumRes) {
        					answer_list.add(Integer.valueOf(max_num));
        					System.out.println("add max_num : " + max_num);
        					
        				}
        			}
        		}
        	}
        }
        
        answer = answer_list.size();

        return answer;
    }
    
    public int getMaxNum(int[] nums) {
    	
    	int max_num = 0;
    	
    	for(int i : nums) {
    		if(max_num < i) {
    			max_num = i;
    		}
    	}
    	
    	System.out.println("max_num : " + max_num);
    	
    	return max_num;
    }
}

public class Level01_Solution27 {
	
	public static void main(String[] args) {
		
		int[] nums = {1, 2, 3, 4};
		int answer;
		
		answer = new Solution27().solution(nums);
		
		System.out.println("answer : " + String.valueOf(answer));
	}
}


