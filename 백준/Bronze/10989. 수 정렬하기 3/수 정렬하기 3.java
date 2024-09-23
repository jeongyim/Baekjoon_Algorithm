import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

import javax.sound.midi.SysexMessage;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		for(int k = 0; k < N; k++) {
			arr[k] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		for(int i = 0; i < N; i++) {
			bw.write(arr[i] + "\n");
		}

		br.close();
		//bw.flush();
		bw.close();
	}

}