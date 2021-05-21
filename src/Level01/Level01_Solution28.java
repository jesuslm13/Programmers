package Level01;

import java.util.ArrayList;
import java.util.List;

class Solution28 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> list = new ArrayList<Integer>();
        
        for(int input : moves) {
        	for(int item = board[input-1].length-1; item >= 0; item--) {
        		if(board[input-1][item] != 0) {
        			list.add(board[input-1][item]);
        			board[input-1][item] = 0;
        			
        			if(list.size() >=2) {
        				int item_1st = list.get(list.size()-1);
        				int item_2nd = list.get(list.size()-2);
        				
        				if(item_1st == item_2nd) {
        					answer += 2;
        					list.remove(list.size()-1);
        					list.remove(list.size()-1);
        				}
        			}
        		}
        	}
        }
        
        return answer;
    }
}

public class Level01_Solution28 {

	public static void main(String[] args) {
		
		int [][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int [] moves = {1,5,3,5,1,2,1,4};
		
		int answer = new Solution28().solution(board, moves);
		
		System.out.println("answer : " + answer);
	}
}
