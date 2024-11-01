import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		long num = 1;
		
		for(int i = N; i > 0; i--) {
			num *= i;
		}
		System.out.println(num);
	}

}