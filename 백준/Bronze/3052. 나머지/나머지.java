import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		int count = 0;
		
		for (int k = 0; k < arr.length; k++) {
			arr[k] = sc.nextInt() % 42;

		}
		
		for (int i = 0; i <arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (i < j && arr[i] == arr[j]) {
					count++;
					break;
				}
			}
		}
		
		System.out.println(10-count);
		

	}

}