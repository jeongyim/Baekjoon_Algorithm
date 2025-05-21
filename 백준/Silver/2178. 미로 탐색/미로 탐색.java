
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int[] dx = {0, 1, 0, -1};
	static int[] dy = {1, 0, -1, 0};
	static boolean[][] visited;
	static int[][] A;
	static int N, M;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		visited = new boolean[N][M];
		A = new int[N][M];
		for(int i = 0; i < N; i++) {
			String str = br.readLine();
			for(int j = 0; j < M; j++) {
				A[i][j] = str.charAt(j)-'0';
			}
		}
		BFS(0,0);
		System.out.println(A[N-1][M-1]);

	}
	private static void BFS(int i, int j) {
		Queue<int[]> que = new LinkedList<>();
		que.offer(new int[] {i,j});
		visited[i][j] = true;
		while(!que.isEmpty()) {
			int now[] = que.poll();
			for(int k = 0; k < 4; k++) {
				int x = now[0] + dx[k];
				int y = now[1] + dy[k];
				if(x >= 0 && y >= 0 && x < N && y < M) {
					if(A[x][y] != 0 && !visited[x][y]) {
						visited[x][y] = true;
						A[x][y] = A[now[0]][now[1]]+1;
						que.add(new int[] {x,y});
					}
				}
			}
		}
	}

}
