import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer output = new StringBuffer();
		
		int N = Integer.parseInt(br.readLine());
		int[] arry = new int[N];
		int front = 0;
		int back = -1;
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String order = st.nextToken();
			switch(order) {
			case "push":
				arry[++back] = Integer.parseInt(st.nextToken());
				break;
			case "pop":
				if(front <= back) {
					output.append(arry[front++]).append("\n");
				} else {
					output.append(-1).append("\n");
				}
				break;
			case "size":
				output.append(back - front + 1).append("\n");
				break;
			case "empty":
				if(front > back) {
					output.append(1).append("\n");
				}else {
					output.append(0).append("\n");
				}
				break;
			case "front":
				if(front <= back) {
					output.append(arry[front]).append("\n");
				}else {
					output.append(-1).append("\n");
				}
				break;
			case "back":
				if(front <= back) {
					output.append(arry[back]).append("\n");
				}else {
					output.append(-1).append("\n");
				}
				break;
			}	
		}
		System.out.print(output);
		

	}

}
