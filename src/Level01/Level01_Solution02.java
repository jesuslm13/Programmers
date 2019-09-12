package Level01;

class Solution02 {
    public int[] solution(int[] answers) {
        
    	int [] answer;
    	int [] temp_answer = {1, 2, 3};
    	int [] count = new int[3];
        int temp=0;
        
        int [] p1 = {1, 2, 3, 4, 5};					// 분모 5
        int [] p2 = {2, 1, 2, 3, 2, 4, 2, 5};			// 분모 8
        int [] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};		// 분모 10
        
        for(int i=0; i<answers.length; i++) {
        	if(p1[i%5] == answers[i]) {
        		count[0]++;
        	}
        	if(p2[i%8] == answers[i]) {
        		count[1]++;
        	}
        	if(p3[i%10] == answers[i]) {
        		count[2]++;
        	}
        }
        
        for(int i=0; i<count.length; i++) {
        	for(int j=i+1; j<count.length; j++) {
        		if(count[i] < count[j]) {
        			temp = count[i];
        			count[i] = count[j];
        			count[j] = temp;
        			
        			temp = temp_answer[i];
        			temp_answer[i] = temp_answer[j];
        			temp_answer[j] = temp;
        		}
        	}
        }
        
        if(count[0] == count[2]) {
        	answer = temp_answer;
        } else if(count[0] == count[1]) {
        	answer = new int[2];
        	answer[0] = temp_answer[0];
        	answer[1] = temp_answer[1];
        } else {
        	answer = new int[1];
        	answer[0] = temp_answer[0];
        }
        
        return answer;
    }
}

public class Level01_Solution02 {

	public static void main(String[] args) {
		
		int [] answers = {1, 3, 2, 4, 2};
		int [] answer = new Solution02().solution(answers);
		
		for(int i : answer) {
			System.out.print(i);
		}
	}
}
