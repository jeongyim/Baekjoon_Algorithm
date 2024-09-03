import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[6];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			switch(i) {
			case 0: case 1:
				arr[i] = 1 - arr[i];
				break;
				
			case 2: case 3: case 4:
				arr[i] = 2 - arr[i];
				break;
				
			case 5:
				arr[i] = 8 - arr[i];
				break;
			}
		}
		for (int arry : arr) {
			System.out.print(arry + " ");
		}

	}

}