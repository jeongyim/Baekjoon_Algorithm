import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int [N];
		
		for(int k = 0; k < N; k++) {
			arr[k] = sc.nextInt();
		}
		for(int i = 0; i < N-1; i++) {
			for(int j = i+1; j < N; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int arry : arr) {
			System.out.println(arry);
		}

	}

}
