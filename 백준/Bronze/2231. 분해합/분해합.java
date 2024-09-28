import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		int N = sc.nextInt(); // 입력 
		int M = 0; //결과값
		
		for(int t = 1; t <= N; t++) {
			int num = t;
			int sum = 0;
			while(num > 0) {    //num = 0
				sum += num % 10;
				num /= 10;
			}
			if(sum + t == N) {
				M = t;
				break;
			}
		}
		System.out.println(M);
		
	}

}
