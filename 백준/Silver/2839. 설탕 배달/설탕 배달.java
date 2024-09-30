import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result = -1;
		
		for(int i = 0; i < 5000; i++) {
			for(int j = 0; j < 5000; j++) {
				if((5*i) + (3*j) == N) {
					result = i + j;
				}
			}
		}
		System.out.println(result);
	}
}
