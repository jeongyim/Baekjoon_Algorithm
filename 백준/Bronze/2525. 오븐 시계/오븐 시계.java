import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int D = C/60;
		int E = C%60;
		
		if (B+E < 60 && A+D <= 23) {
			System.out.println((A+D) + " " + (B+E));
		}
		else if (B+E >= 60 && A+D == 23) {
			System.out.println(0 + " " + (B+E-60));
		}
		else if (B+E >= 60 && A+D < 23) {
			System.out.println((A+D+1) + " " + (B+E-60));
		}
		else if (B+E >= 60 && A+D > 23) {
			System.out.println((A+D-23) + " " + (B+E-60));
		}
		else if (B+E < 60 &&  A+D > 23) {
			System.out.println((A+D-24) + " " + (B+E));
		}
	}
}