import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int sum = 0;
		int avg = 0;
		int center = 0;
		
		for(int k = 0; k < arr.length; k++) {
			arr[k] = sc.nextInt();
		}
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		avg = sum/arr.length;
		
		Arrays.sort(arr);
		
		center = (arr.length / 2);
		
		System.out.println(avg);
		System.out.println(arr[center]);

	}

}