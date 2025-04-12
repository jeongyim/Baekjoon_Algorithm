import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[M+1];
		
		for(int i = 2; i <= M; i++) {
			arr[i] = i;
		}
		
		for(int i = 2; i*i <= M; i++) {
			if(arr[i] !=0) {
				for(int j = i*i; j <= M; j+=i) {
					arr[j] = 0;
				}
			}
			
		}
		for(int i = N; i <= M; i++) {
			if(arr[i] != 0) {
				System.out.println(arr[i]);
			}
		}
		
		
	}

}
