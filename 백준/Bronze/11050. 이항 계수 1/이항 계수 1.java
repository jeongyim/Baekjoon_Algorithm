import java.util.Scanner;

public class Main {

	static int[][] arr;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		arr = new int[N+1][N+1];
		
		for(int i = 0; i <= N; i++) {
			for(int j = 0; j <=N; j++) {
				if(j > i) {
					arr[i][j] = 0;
				}else if(i == j) {
					arr[i][j] = 1;
				}else {
					if(j==0) {
						arr[i][j] = 1;
					}else if(j == 1) {
						arr[i][1] = i;
					}else {
						arr[i][j] = combination(i, j);
					}
				}
				//System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
			}
		}
		System.out.println(arr[N][K]);
	}

	private static int combination(int i, int j) {
		// TODO Auto-generated method stub
		return arr[i-1][j] + arr[i-1][j-1];
		
	}
}
