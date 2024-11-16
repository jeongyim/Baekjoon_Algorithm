import java.io.BufferedReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		int[] alpha = new int[26];
		String str = br.readLine();
		
		for(int i = 0; i < str.length(); i++) {
			alpha[str.charAt(i) - 'A']++; 
		}

		int holsu = 0;
		String result = "";
		String revresult = "";
		for(int i = 0; i < alpha.length; i++) {
			if(alpha[i]%2 != 0) {
				holsu++;
			}	
		}
		
		if(holsu > 1) {
			sb.append("I'm Sorry Hansoo");
			result = sb.toString();
		}
		else {
			for(int j = 0; j < alpha.length; j++) {
				for(int k = 0; k < alpha[j]/2; k++) {
					sb.append((char)(j+65));
				}
			}
			result = sb.toString();
			revresult = sb.reverse().toString();

			sb = new StringBuffer();
			for(int j = 0; j < alpha.length; j++) {
				if(alpha[j] % 2 == 1) {
					sb.append((char)(j+65));
				}	
			}
			
			result += sb.toString() + revresult;
		}
		System.out.println(result);
	}

}