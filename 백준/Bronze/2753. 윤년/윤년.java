import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		if (month % 4 == 0 && month % 100 != 0) {
			System.out.println(1);
		}
		else if (month % 400 ==0) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}

	}

}