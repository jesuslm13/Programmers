package Level01;

import java.util.HashMap;
import java.util.Map;

class Solution11 {
    boolean solution(String s) {
        
    	boolean answer = true;

        char [] list = s.toLowerCase().toCharArray();
        
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        
        for(char c : list) {
        	if(!map.containsKey(c)){
        		map.put(c, 1);
        	} else {
        		map.put(c, map.get(c)+1);
        	}
        }
        
        if(map.get('p') == map.get('y')) {
        	answer = true;
        } else {
        	answer = false;
        }

        return answer;
    }
}

public class Level01_Solution11 {

	public static void main(String[] args) {
		
		String s = "Pyy";
		boolean answer = new Solution11().solution(s);
		System.out.println(answer);
	}
}
