package Level01;

import java.util.ArrayList;
import java.util.List;

class Solution28 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> list = new ArrayList<Integer>();
        
        for(int input : moves) {
        	// 인형이 뽑히면 loop 제어
        	boolean flag = true;
        	
        	int index = 0;
        	int max_index = board.length-1;
        	
        	while(flag) {
//        		System.out.println("board[index][input-1] :: " + board[index][input-1]);
        		if(board[index][input-1] != 0) {
        			list.add(board[index][input-1]);
        			board[index][input-1] = 0;
        			
        			if(list.size() >=2) {
        				int item_1st = list.get(list.size()-1);
        				int item_2nd = list.get(list.size()-2);
        				
        				if(item_1st == item_2nd) {
        					answer += 2;
        					list.remove(list.size()-1);
        					list.remove(list.size()-1);
        				}
        			}
        			
        			flag = false;
        		} else {
        			if(index == max_index) {
        				flag = false;
        			} else {
        				index ++;
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
