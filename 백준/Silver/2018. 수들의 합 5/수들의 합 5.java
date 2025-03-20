import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int start = 1;
		int end = 1;
		int count = 0;
		int sum=0;
		
		while (start <= N) {
			sum =0;
			end = start;
			
			while(sum < N) {
				sum += end;
				end++;
			}
			
			if(sum == N) {
				count++;
			}
			
			start++;
		}

		System.out.println(count);
		
	}

}