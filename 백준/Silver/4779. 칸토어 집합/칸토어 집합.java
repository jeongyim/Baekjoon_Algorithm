import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	static int N;
	static char[] ch;
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		String str;
		while((str = br.readLine()) != null) {
			N = Integer.parseInt(str);
			int cnt = (int)Math.pow(3, N);
			ch = new char[cnt];
			
			for(int i = 0; i < cnt; i++) {
				ch[i] = '-';
			}
			cut(0,cnt);
			
			System.out.println(ch);
//			for(int j = 0; j < cnt; j++) {
//				System.out.print(ch[j]);
//				
//			}
		}
	}
	
	static void cut(int start, int length) {
		
		if (length < 3) {
			return ;
		}
		
		int cutLen = length / 3;
		for(int i = start + cutLen; i < start + cutLen*2; i++) {
			ch[i] = ' ';
		}
		
		cut(start, cutLen);
		cut(start + cutLen*2, cutLen);
		
	}
}