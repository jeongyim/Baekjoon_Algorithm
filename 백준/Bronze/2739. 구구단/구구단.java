import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		for (int i=sc.nextInt(); i<10; i++) {
			for (int j=1; j<10;j++) {
				System.out.println(i + " * " + j + " = "+ i*j);
			}
			break;
		}
	}
}