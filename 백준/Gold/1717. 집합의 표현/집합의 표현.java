import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int[] A;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		A = new int[N+1];
		for(int i = 0; i <= N; i++) {
			A[i] = i;
		}
		
		for(int i = 0; i< M; i ++) {
			st = new StringTokenizer(br.readLine());
			int k = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(k == 0) {
				UNION(a, b);
			}
			else if (k == 1) {
				if(FIND(a)==FIND(b)) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			}
		}

	}

	private static void UNION(int a, int b) {
		// TODO Auto-generated method stub
		a = FIND(a);
		b = FIND(b);
		if(a != b) {
			A[a] = b;
		}

	}
	
	private static int FIND(int a) {
		if( a == A[a]) {
			return a;
		}
		A[a] = FIND(A[a]);
		return  A[a];
					
	}

}
