import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String strrev = "";
		
		for (int i = str.length()-1; i >= 0; i--) {
			strrev = strrev + str.charAt(i);
		}
		if (str.equals(strrev)) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}

	}

}