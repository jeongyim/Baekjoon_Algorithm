import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		int count = 0;
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		for(int max = N-1; max >= 0; max--) {
			int i = 0;
			int j = N-1;
			while(i < j) {
				if(i == max) {
					i++;
					continue;
				}
				if(j == max) {
					j--;
					continue;
				}
				if(arr[i] + arr[j] == arr[max]) {
					count++;//한번만 증가.. 
					break;
				}
				else if(arr[i] + arr[j] > arr[max]) {
					j--;
				}
				else if(arr[i] + arr[j] < arr[max]) {
					i++;
				}
			}
		}
		
		System.out.println(count);
	}

}
