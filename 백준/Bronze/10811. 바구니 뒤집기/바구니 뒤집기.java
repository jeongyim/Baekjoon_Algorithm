import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N];
		
		for(int x = 0; x < N; x++) {
			arr[x] = x+1;
		}
		
		for(int y = 0; y < M; y++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int start = i - 1;
			int end = j - 1;
			
			while (start < end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
		}
		
		for(int num = 0; num < arr.length; num++) {
			System.out.print(arr[num] + " ");
		}

	}

}