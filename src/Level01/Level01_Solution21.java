package Level01;

class Solution21 {
    public int solution(int n) {
        int answer = 0;
        
        String [] str_array = String.valueOf(n).split("");
        
        for(String str : str_array) {
        	answer += Integer.parseInt(str);
        }

        return answer;
    }
}

public class Level01_Solution21 {

	public static void main(String[] args) {
		
		int n = 987;
		int answer = new Solution21().solution(n);
		System.out.println(answer);
	}
}
