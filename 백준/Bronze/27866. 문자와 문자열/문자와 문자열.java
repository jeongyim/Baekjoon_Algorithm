import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String S = sc.nextLine();
		int i = sc.nextInt();
		
		char[] arr = S.toCharArray();
		
		System.out.println(arr[i-1]);
		
	}

}