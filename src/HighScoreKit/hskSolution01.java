// Hash
// 완주하지 못한 선수
// https://programmers.co.kr/learn/courses/30/lessons/42576

package HighScoreKit;

import java.util.Map;
import java.util.HashMap;

public class hskSolution01 {

	public String solution(String[] participant, String[] completion) {
    	
    	String answer = ""; // 완주하지 못한 선수
    	
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        for(String str : participant){
            if(map.containsKey(str)){
                map.put(str, map.get(str)+1);
            } else{
                map.put(str, 1);
            }
        }
        
        for(String str : completion){
            if(map.containsKey(str)){
                if(map.get(str) == 1){
                    map.remove(str);
                } else{
                    map.put(str, map.get(str)-1);
                }
            } else{
                answer = str;
                break;
            }
        }
        
        answer = map.keySet().iterator().next();

        return answer;
    }
	
	public static void main(String[] args) {
		
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		
		String answer = new hskSolution01().solution(participant, completion);
		System.out.println(answer);
	}
}
