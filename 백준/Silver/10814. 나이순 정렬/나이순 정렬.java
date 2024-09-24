import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[][] member = new String[N][2];
		
		for(int t = 0; t < N; t++) {
			member[t][0] = sc.next();
			member[t][1] = sc.next();
		}
		
		Arrays.sort(member, new Comparator<String[]>() {
			@Override
			public boolean equals(Object obj) {
				// TODO Auto-generated method stub
				return super.equals(obj);
			}
			public int compare(String[] m1, String[] m2) {
				
				return Integer.valueOf(m1[0]).compareTo(Integer.valueOf(m2[0]));
			}
			
		});
		
		for(int t = 0; t < N; t++) {
			System.out.println(member[t][0] + " " + member[t][1]);
		}
	}
}
