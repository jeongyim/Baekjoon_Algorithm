import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		Double[] arry = new Double[n];
		int max = 0;
		Double sum = 0.0;
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		for(int i = 0; i < n; i++) {
			arry[i] = (double)arr[i];
			arry[i] = arry[i] / max * 100;
			sum += arry[i];
		}
			System.out.println(sum/n);
	}

}
