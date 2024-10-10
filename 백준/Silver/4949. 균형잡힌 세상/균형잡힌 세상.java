import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer output = new StringBuffer();
		
		while (true) {
			String str = br.readLine();
			if(str.equals(".")) {
				break;
			}
			
			Stack<String> stack = new Stack<>();
			boolean isVal = true;
			
			for(int t = 0; t < str.length(); t++) {
				switch(str.charAt(t)) {
				case '(':
					stack.push("(");
					break;
				
				case '[':
					stack.push("[");
					break;
				
				case ')':
				if (!stack.isEmpty() && stack.peek()== "(") {
						stack.pop();
					}else {
						isVal = false;
					}
					break;
					
				case ']':
					if (!stack.isEmpty() && stack.peek()== "[") {
						stack.pop();
						break;
					}else {
						isVal = false;
					}
					break;
 				}
			}
			if(isVal && stack.isEmpty()) {
				output.append("yes").append("\n");
			}
			else {
				output.append("no").append("\n");
				}
		}
		System.out.println(output);	
		
	}

}