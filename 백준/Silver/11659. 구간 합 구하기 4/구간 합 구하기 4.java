import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();  //수의 개수
		int M = sc.nextInt();  //합을 구해야 하는 횟수
		int[] A = new int[N];  //배열
		int[] S = new int[N];  //합 배열
		
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		for(int i = 1; i < N; i++) {
			S[0] = A[0];
			S[i] = S[i-1] + A[i];
		}
		for(int k = 0; k < M; k++) {   
			int i = sc.nextInt();
			int j = sc.nextInt();
			if(i == 1) {
				System.out.println(S[j-1]);  //인덱스에 -1은 없음
			}
			else {
				System.out.println(S[j-1] - S[i-2]); //인덱스라서 1추가로 빼기
			}	
		}
	}
}
