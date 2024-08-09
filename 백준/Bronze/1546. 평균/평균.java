import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double[] arr = new double[N];
		double max = 0;
		double sum = 0;
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextDouble();
		}
		
		for (int j = 0; j < arr.length; j++) {
			if(max < arr[j]) {
				max = arr[j];
			}
		}
		
		for(int z = 0; z < arr.length; z++) {
			arr[z] = (arr[z] / max) * 100;
			sum += arr[z];
		}
		
		System.out.println(sum / N);

	}

}