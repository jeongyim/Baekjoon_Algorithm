import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = N;
		
		for (int i = 0; i < N; i++) {
			String str = sc.next();
			boolean[] st = new boolean[26];
			
			for (int j = 0; j < str.length()-1; j++) {
				if (str.charAt(j) != str.charAt(j+1)) {
					if (st[str.charAt(j+1)-'a']) {
						count--;
						break;
					}
				}
				st[str.charAt(j)-'a'] = true;
			}
		}

		System.out.println(count);
	}

}