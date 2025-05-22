
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	
	static int[][] A;
	static boolean[][] visited;
	static int[] dx = {-1, 1, 0, 0};//상하좌우
	static int[] dy = {0, 0, -1, 1};
	static int result;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int T = 1; T <= 10; T++) {
			int N = Integer.parseInt(br.readLine());
			A = new int[16][16];
			visited = new boolean[16][16];
			int startX = 0;
			int startY = 0;
			
			for(int i = 0; i < 16; i++) {
				String str = br.readLine();
				for(int j = 0; j < 16; j++) {
					A[i][j] = str.charAt(j) - '0';
					if(A[i][j] == 2) {
						startX = i;
						startY = j;
					}
				}
			}
			result = 0;
			BFS(startX, startY);
			System.out.println("#" + T + " " + result);
			
		}

	}

	private static void BFS(int x, int y) {
		Queue<int[]> que = new LinkedList<>();
		que.offer(new int[] {x,y});
		visited[x][y] = true;
		
		while(!que.isEmpty()) {
			int[] now = que.poll();
			int cx = now[0];
			int cy = now[1];
			
			for(int d = 0; d < 4; d++) {
				int nx = cx + dx[d];
				int ny = cy + dy[d];
				
				//범위 체크
				if(nx >= 0 && nx < 16 && ny >=0 && ny <16) {
					if(A[nx][ny] != 1 && !visited[nx][ny]) {
						if(A[nx][ny] == 3) {
							result = 1;
							return;
						}
						visited[nx][ny] = true;
						que.offer(new int[] {nx, ny});
					}
				}
			}
		}
	}	

}
