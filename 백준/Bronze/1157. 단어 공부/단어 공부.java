import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		String uppercase = str.toUpperCase();
		int[] arr = new int[26];
		
		for (int i = 0; i < uppercase.length(); i++) {
			int num = uppercase.charAt(i)-'A';
			arr[num]++;
		}
		
		int max = 0;
		char result = '?';
		
		for (int i = 0; i < arr.length; i++) {
			if ( max < arr[i]) {
				max = arr[i];
				result = (char)(i + 'A');
			}else if (max == arr[i]) {
				result = '?';
			}
		}
		System.out.println(result);
		

	}

}