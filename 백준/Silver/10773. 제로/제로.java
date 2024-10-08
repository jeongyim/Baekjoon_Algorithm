import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());
		int[] arr = new int[k];
		int top = -1;
		int sum = 0;
		
		for(int t = 0; t < k; t++) {
			int num = Integer.parseInt(br.readLine());
			switch (num) {
			case 0:
				top--;
				break;
			
			default:
				arr[++top] = num;
			}
		}
		for(int i = 0; i <= top; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}

}