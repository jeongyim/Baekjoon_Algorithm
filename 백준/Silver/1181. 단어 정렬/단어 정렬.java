import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		String[] str = new String[N];
		for(int t = 0; t < N; t++) {
			str[t] = br.readLine();
		}
		Arrays.sort(str, new Comparator<String>() {
			public int compare (String s1, String s2) {
				if(s1.length() == s2.length()) {
					return s1.compareTo(s2);
				}
				else {
					return s1.length()-s2.length();
				}
			}
			});
		
		bw.write(str[0] + "\n");
		
		for(int t = 1; t < N; t++) {
			if(!str[t].equals(str[t-1]))
			bw.write(str[t] + "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
		
	}
}