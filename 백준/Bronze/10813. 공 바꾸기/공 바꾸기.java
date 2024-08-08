import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int temp;
		
		int[] arr = new int[N];
		
		for(int x = 0 ; x < N; x++) {
			arr[x] = (x + 1);
		}
		
		for(int y = 1; y <= M; y++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			
			temp = arr[j-1];
			arr[j-1] = arr[i-1];
			arr[i-1] = temp;
			
		}
		
		for(int x = 0; x < N; x++) {
			System.out.print(arr[x] + " ");
		}
		
	}

}