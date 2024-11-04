import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int count;

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			count = 1;
			String S = br.readLine();
			sb.append(isPalindrome(S)).append(" ").append(count).append("\n");
		}

		System.out.println(sb);
	}

	
	static int recursion(String s, int l, int r) {
		if(l >= r) return 1;
		else if(s.charAt(l) != s.charAt(r)) return 0;
		else {
			count++;
			return recursion(s, l+1, r-1);
		}
	}
	
	static int isPalindrome(String s) {
		return recursion(s, 0, s.length()-1);
	}
	
}