package Level01;

class Solution23 {
	public long solution(long n) {
		long answer = 0;

		// put in int_array
		int[] i_array = new int[Long.toString(n).length()];
		String[] str_array = Long.toString(n).split("");
		int index_flag = 0;

		for (String str : str_array) {
			i_array[index_flag] = Integer.parseInt(str);
			index_flag++;
		}

		// sort
		for (int i = 0; i < i_array.length; i++) {
			for (int j = i + 1; j < i_array.length; j++) {
				if(i_array[i] < i_array[j]) {
					
					int temp = i_array[i];
					i_array[i] = i_array[j];
					i_array[j] = temp;
				}
			}
		}

		// output
		String line = "";

		for (int i : i_array) {
			line += i;
		}

		answer = Long.parseLong(line);

		return answer;
	}
}

public class Level01_Solution23 {

	public static void main(String[] args) {

		long n = 118372;
		long answer = new Solution23().solution(n);
		System.out.println(answer);

	}
}
