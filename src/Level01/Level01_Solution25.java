package Level01;

class Solution25 {
	public int[] solution(int[] arr) {
		int [] answer = {};
		int min = 0;
		int array_index = 0;
		
		if(arr.length==1) {
			answer = new int[arr.length];
			answer[0] = -1;
		} else {
			
			// array length
			answer = new int[arr.length-1];
			
			// 최소값 구하기
			for(int i=0; i<arr.length; i++) {
				if(i==0) {
					min = arr[i];
				} else {
					if(min>arr[i]) {
						min = arr[i];
					}
				}
			}
			
			for(int i : arr) {
				if(min != i) {
					answer[array_index] = i;
					array_index++;
				}
			}
			
		}
		
		return answer;
	}
}

public class Level01_Solution25 {

	public static void main(String[] args) {

		int[] arr = { 4,3,2,1 };
		int[] answer = new Solution25().solution(arr);

		for (int i : answer) {
			System.out.println(i);
		}
	}
}
