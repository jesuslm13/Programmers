package Level01;

class Solution24 {
	public long solution(long n) {
		long answer = -1;
		boolean flag = true;
		long temp = n;
		long temp2 = n*n;
		
		while(flag) {
			temp = temp / 2;
			temp2 = temp*temp;
			
			if(temp2<0) {
				continue;
			} else {
				if(temp2!=n && temp2>n) {
					continue;
				} else {
					while(flag) {
						temp = temp+1;
						temp2 = temp*temp;
						if(temp2 !=n && temp2<n) {
							continue;
						} else if(temp2 == n) {
							answer = (temp+1)*(temp+1);
							flag = false;
						} else {
							flag = false;
						}
					}
				}
			}
		}

		return answer;

	}
}

public class Level01_Solution24 {

	public static void main(String[] args) {

		long n = 121;
		long answer = new Solution24().solution(n);
		System.out.println(answer);
	}
}
