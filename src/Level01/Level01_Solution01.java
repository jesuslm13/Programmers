package Level01;

import java.util.HashMap;

class Solution01 {
    public String solution(String[] participant, String[] completion) {
    	
    	String answer = "";
    	HashMap<String, Integer> p_map = new HashMap<String, Integer>();
    	
    	for(String list : participant) {
    		if(p_map.containsKey(list)) {
    			p_map.replace(list, p_map.get(list)+1);
    		} else {
    			p_map.put(list, 1);
    		}
    	}
    	
    	for(String list : completion) {
    		if(p_map.containsKey(list)){
    			if(p_map.get(list) != 1) {
    				p_map.replace(list, p_map.get(list)-1);
    			} else {
    				p_map.remove(list);
    			}
    		}
    	}
    	
    	answer = p_map.entrySet().iterator().next().getKey();
    	
        return answer;
    }
}

public class Level01_Solution01 {

	public static void main(String[] args) {
		
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"kiki", "eden"};
		String res = new Solution01().solution(participant, completion);
		System.out.println(res);
	}
}
