import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[N];
		int[] arry = new int[k];
		
		for(int t = 0; t < N; t++) {
			int x = sc.nextInt();
			arr[t] = x;
		}
		Arrays.sort(arr);

		for(int i = N-1; i > N-k; i--) {
			for(int j = 0; j < k; j++) {
				arry[j] = arr[i];
			}
		}
		System.out.println(arr[N-k]);

	}

}