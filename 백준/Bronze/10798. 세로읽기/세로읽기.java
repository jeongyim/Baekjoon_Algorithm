import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] str = new String[5];
		
		for(int i = 0; i < 5; i++) {
			str[i] = sc.next();
		}
		for(int j = 0; j < 15; j++) {
			for(int i = 0; i < 5; i++) {
				if(j < str[i].length()) {
					System.out.print(str[i].charAt(j));
				}
			}
		}

	}

}
