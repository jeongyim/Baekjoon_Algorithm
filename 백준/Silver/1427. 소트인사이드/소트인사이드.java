import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		int[] arr = new int[str.length()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i) - '0';
		}

		Arrays.sort(arr);
		
		for(int i = arr.length-1; i >=0; i--) {
			//System.out.print(arr[i]);
			bw.write(Integer.toString(arr[i]));
		}
		br.close();
		bw.flush();
		bw.close();
	}

}