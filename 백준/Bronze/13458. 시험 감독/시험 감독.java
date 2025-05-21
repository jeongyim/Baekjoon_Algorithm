import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		long count = 0;
		for(int i = 0; i < N; i++) {
			A[i] = A[i] - B;
			count++;
			if(A[i] > 0) {
				int nanu = A[i]/C;
				int namo = A[i]%C;
				count += nanu;
				if(namo > 0) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}