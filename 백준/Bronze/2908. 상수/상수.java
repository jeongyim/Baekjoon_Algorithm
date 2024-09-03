import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String A = sc.next();
		String B = sc.next();
		String reverseA = "";
		String reverseB = "";
		
		for(int j = (A.length() - 1); j >= 0; j--) {
			reverseA = reverseA + A.charAt(j);
		}
		
		for(int j = (B.length() - 1); j >= 0; j--) {
			reverseB = reverseB + B.charAt(j);
			}
		
		int first = Integer.parseInt(reverseA);
		int second = Integer.parseInt(reverseB);
		
		if (first > second) {
			System.out.println(first);
		} else {
			System.out.println(second);
		}

	}

}