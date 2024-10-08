import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for (int i=1; i<=T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			String A = st.nextToken();
			String B = st.nextToken();
			bw.write("Case #" + i + ": ");
			bw.write(A + " + " + B + " = ");
			bw.write(Integer.parseInt(A) + Integer.parseInt(B) + "\n");
			
		}
		br.close();
		bw.flush();
		bw.close();
		
		

	}

}