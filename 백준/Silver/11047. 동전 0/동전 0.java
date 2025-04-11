
import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int result = 0;
		int[] A = new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		
		Arrays.sort(A);
		for(int i = N - 1; i >=0; i--) {
			if(K == 0 ) {
				break;
			}
			int now = A[i];
			if(K >= now) {
				result += K / now;
				K %= now;
			}
		}
		System.out.println(result);
	}

}
