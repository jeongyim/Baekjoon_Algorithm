import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int num = 0;
		int count = 0;
		
		while(count < N) {
			num++;
			String str = String.valueOf(num);
			if(str.contains("666")) {
				count++;
			}
		}
		System.out.println(num);

	}

}
