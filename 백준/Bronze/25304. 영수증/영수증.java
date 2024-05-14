import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int N = sc.nextInt();
		int sum = 0;
		
		int arr[] = new int[N];
		
		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[i] = a*b;
		}
		for (int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		if (X == sum) {
			System.out.println("Yes");
		}
		else
			System.out.println("No");
	}
}