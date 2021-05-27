// Hash
// ¿ß¿Â
// https://programmers.co.kr/learn/courses/30/lessons/42578

package HighScoreKit;

import java.util.Map;
import java.util.HashMap;

public class hskSolution03 {

	public int solution(String[][] clothes) {
    	
		int answer = 1;
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(String[] strArray : clothes) {
			if(!map.containsKey(strArray[1])) {
				map.put(strArray[1], 1);
			} else {
				map.put(strArray[1], map.get(strArray[1])+1);
			}
		}

		for(Integer i : map.values()) {
			answer *= i+1;
		}
		
        return answer-1;
    }
	
	
	public static void main(String[] args) {
		
		String[][] clothes = {
				{"yellowhat", "headgear"},
				{"bluesunglasses", "eyewear"},
				{"green_turban", "headgear"}
		};
		
//		String[][] clothes = {
//				{"crowmask", "face"},
//				{"bluesunglasses", "face"},
//				{"smoky_makeup", "face"}
//		};
		
		int answer = new hskSolution03().solution(clothes);
		System.out.println("answer : " + answer);
	}

}
