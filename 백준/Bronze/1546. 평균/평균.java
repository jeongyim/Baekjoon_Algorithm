import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		Double[] score = new Double[N];
		Double M = 0.0;
		Double sum = 0.0;
		
		for(int i = 0; i < N; i++) {
			score[i] = sc.nextDouble();
			if(M < score[i]) {
				M = score[i];
			}
		}
		
		for(int j = 0; j < N; j++) {
			sum += score[j]/M*100;
		}

		System.out.println(sum / N);

	}

}