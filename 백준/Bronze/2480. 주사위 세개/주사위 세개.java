import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if (A == B && B== C) {
			System.out.println(10000+A*1000);
		}
		else if (A == B || B == C) {
			System.out.println(1000+B*100);
		}
		else if (A == C || C == B) {
			System.out.println(1000+C*100);
		}
		else
			if (A>B && A>C) {
				System.out.println(A*100);
			}
			else if (B>A && B>C) {
				System.out.println(B*100);
			}
			else if (C>A && C>B) {
				System.out.println(C*100);
			}
	}

}
