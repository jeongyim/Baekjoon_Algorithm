import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			int H = sc.nextInt();
			int M = sc.nextInt();
					
			if (H > 0 && M >= 45) {
				System.out.println(H + " " + (M-45));
			}
			else if (H > 0 && M < 45) {
				System.out.println((H-1) + " " + (60-45+M));
			}
			else if (H == 0 && M >= 45) {
				System.out.println(H + " " + (M-45));
			}
			else if (H == 0 && M < 45) {
				System.out.println(23 + " " + (60-45+M));
			}
		}
	}
}
