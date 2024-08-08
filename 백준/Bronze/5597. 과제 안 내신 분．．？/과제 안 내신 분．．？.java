import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[30];
		
		for(int i = 0; i < 28; i++) {
			int N = sc.nextInt();
			arr[N-1] = 1;
		}
		
		for(int j = 0; j < arr.length; j++) {
			if(arr[j] != 1) {
				System.out.println(j+1);
			}
		}
		
	}

}