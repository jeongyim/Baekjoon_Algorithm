import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N];
		int sum = 0;
		int max = 0;
		
		for(int t = 0; t < N; t++) {
			arr[t] = sc.nextInt();
		}
		
		for(int i = 0; i < N-2; i++) {
			for(int j = i+1; j < N-1; j++) {
				for(int k = j+1; k < N; k++) {
					sum = arr[i] + arr[j] + arr[k];
					if(sum <= M) {
						max = Math.max(max, sum);
					}
				}
			}
		}
		System.out.println(max);
	}

}