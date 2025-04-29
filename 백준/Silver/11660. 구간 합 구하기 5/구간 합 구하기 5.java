import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] arr = new int[N+1][N+1];
		int[][] arry = new int[N+1][N+1];
		
		
		for(int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				arry[i][j] = arry[i-1][j] + arry[i][j-1] - arry[i-1][j-1] + arr[i][j];
			}
		}
	
		
		for(int t = 0; t < M; t++) {
			st = new StringTokenizer(br.readLine());
			int sx = Integer.parseInt(st.nextToken());
			int sy = Integer.parseInt(st.nextToken());
			int ex = Integer.parseInt(st.nextToken());
			int ey = Integer.parseInt(st.nextToken());
			int sum = arry[ex][ey] - arry[sx-1][ey] - arry[ex][sy-1] + arry[sx-1][sy-1];
			
			sb.append(sum + "\n");
		}

		System.out.println(sb);
	}

}
