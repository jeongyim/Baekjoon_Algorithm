import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());  //수의 개수
		int M = Integer.parseInt(st.nextToken());  //합을 구해야 하는 횟수
		int[] A = new int[N];  //배열
		long[] S = new long[N];  //합 배열
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		S[0] = A[0];
		for(int i = 1; i < N; i++) {
			S[i] = S[i-1] + A[i];
		}
		for(int k = 0; k < M; k++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			if(i == 1) {
				System.out.println(S[j-1]);  //인덱스에 -1은 없음
			}
			else {
				System.out.println(S[j-1] - S[i-2]); //인덱스라서 1추가로 빼기
			}	
		}
	}
}
