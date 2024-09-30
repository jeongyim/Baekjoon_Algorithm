import java.util.Scanner;

public class Main {
	
	static boolean[][] arr;
	static int min = 64;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		arr = new boolean[M][N];
		
		for(int i = 0; i < M; i++) {
			String WB = sc.next();
			for(int j = 0; j < N; j++) {
				if(WB.charAt(j) == 'W') {
					arr[i][j] = true;
				}else {
					arr[i][j] = false;
				}
			}
		}
		
		for(int i = 0; i <= M-8; i++) {
			for(int j = 0; j <= N-8; j++) {
				find(i,j);
			}
		}
		System.out.println(min);

	}

	public static void find(int x, int y) {
		// TODO Auto-generated method stub
		int count = 0;
		boolean TF = arr[x][y];
		
		for(int i = x; i < x + 8; i++) {
			for(int j = y; j < y + 8; j++) {
				if(TF != arr[i][j]) {
					count++;
				}
				TF = !TF;
			}
			TF = !TF;
		}
		count = Math.min(count, 64-count);
		min = Math.min(min, count);
	}

}