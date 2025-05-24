import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] A = new int[N+1];
		int[] S = new int[N+1];
		int max = 0;
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
			S[i] = S[i-1] + A[i];
			max = S[K];
		}

		int end = K;
		while(end <= N) {
			int sum = S[end] - S[end-K];
			max = Math.max(sum, max);
			end++;
		}
		System.out.println(max);
	
	}

}
