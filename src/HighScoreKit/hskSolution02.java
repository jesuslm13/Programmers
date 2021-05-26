package HighScoreKit;

import java.util.Map;
import java.util.HashMap;

public class hskSolution02 {

	public boolean solution(String[] phone_book) {
    	
//		boolean answer = true;
		
        Map<String, String> map = new HashMap<String, String>();
        
        for(String str : phone_book){
            map.put(str, str);
        }
        
        for(String str : phone_book){
        	map.remove(str);
            for(int index = 1; index <= str.length(); index++){
                String temp = str.substring(0, index);       
                if(map.containsKey(temp)){
                    return false;
                }
            }
            
            map.put(str, str);
        }
        
        return true;
    }
	
	public static void main(String[] args) {
		
		
		
		String[] phone_book = {"111113","1112","12", "567","88"};
//		String[] phone_book = {"119", "97674223", "1195524421"};
//		String[] phone_book = {"113333","115555","345555","555555", "345444"};
		
		boolean answer = new hskSolution02().solution(phone_book);
		System.out.println(answer);

	}

}
