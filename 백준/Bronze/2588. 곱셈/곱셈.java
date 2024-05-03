import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int a = B%10;
		int b = B%100;
		int c = B%1000;
		
		int d = b-a;
		int e = c-b;
		
		System.out.println(A*a);
		System.out.println(A*d/10);
		System.out.println(A*e/100);
		System.out.println(A*a + A*d+ A*e);

	}

}