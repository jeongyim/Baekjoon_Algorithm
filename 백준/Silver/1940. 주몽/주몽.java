import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int count = 0;
		
		int[] num = new int[N];
		for(int i = 0; i < N; i++) {
			num[i] = sc.nextInt();	
		}		
		
		Arrays.sort(num);
		
		int start = 0;
		int end = N - 1;
		
		while (start < end) {
			int sum = num[start] + num[end];
			if(sum == M) {
				count++;
				start++;
				end--;
			}
			else if(sum < M) {
				start++;
			}
			else {
				end--;
			}
		}
		System.out.println(count);
	}

}
