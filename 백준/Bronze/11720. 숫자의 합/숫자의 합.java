import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int sum = 0;
		String str = br.readLine();
		for(int i = 0; i < N; i++) {
			arr[i] = str.charAt(i) - '0';
			sum += arr[i];
		}
		System.out.println(sum);
	}

}
