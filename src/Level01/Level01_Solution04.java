package Level01;

	import java.util.ArrayList;
	import java.util.List;
	
	class Solution04 {
		
		public int solution(int n, int[] lost, int[] reserve) {
		
			int answer = n-lost.length;
			
			List<Integer> lost_list = new ArrayList<Integer>();
			List<Integer> reserve_list = new ArrayList<Integer>();
			
			for(int r : reserve) {
				reserve_list.add(r);
			}
			 
			for(int l : lost) {
				lost_list.add(l);
			}
			
			for(int l : lost) {
				if(reserve_list.contains(l)) {
					reserve_list.remove(reserve_list.indexOf(l));
					lost_list.remove(lost_list.indexOf(l));
					answer++;
				}
			}
			
			for(int l : lost_list) {
				
				System.out.println("reserve_list : "+reserve_list);
	        	System.out.println("int : "+l);
	        	
	        	if(reserve_list.contains(l-1)) {
	        		reserve_list.remove(reserve_list.indexOf(l-1));
	        		answer++;
	        	} else if(reserve_list.contains(l+1)){
	        		reserve_list.remove(reserve_list.indexOf(l+1));
	        		answer++;
	        	} else {
	        		continue;
	        	}
	        	
	        	System.out.println("reserve_list : "+reserve_list);
			}
				
			return answer;
		}
	}

public class Level01_Solution04 {

	public static void main(String[] args) {
		
		int n = 5;
		int [] lost =  {1, 2, 3};
		int [] reserve = {2, 3};
		
		int answer = new Solution04().solution(n, lost, reserve);
		System.out.println(answer);
		
	}
}
