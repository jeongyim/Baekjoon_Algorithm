import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[N][2];
		
		for(int k = 0; k < N; k++) {
			arr[k][0] = sc.nextInt();
			arr[k][1] = sc.nextInt();
		}
		Arrays.sort(arr, (e1, e2) -> {
			if(e1[1] == e2[1]) {
				return e1[0] - e2[0];
				}
			else {
				return e1[1] - e2[1];
				}
		});
		for(int k = 0; k < N; k++) {
			System.out.println(arr[k][0] + " " + arr[k][1]);
		}

	}

}
