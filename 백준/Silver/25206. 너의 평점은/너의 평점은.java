import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double score = 0; //전공과목별(학점*과목평점)의 합
		double count = 0; //학점의 총 합
		
		for (int i = 0; i < 20; i++) {
			String subject = sc.next(); //과목
			double grade = sc.nextDouble(); //학점
			String level = sc.next(); //등급

			if(level.equals("P")) {
				grade = 0.0;
			} else {
				count += grade;
			}
			
			switch (level) {
			case "A+":
				score += 4.5 * grade;
				break;
			case "A0":
				score += 4.0 * grade;
				break;
			case "B+":
				score += 3.5 * grade;
				break;
			case "B0":
				score += 3.0 * grade;
				break;
			case "C+":
				score += 2.5 * grade;
				break;
			case "C0":
				score += 2.0 * grade;
				break;
			case "D+":
				score += 1.5 * grade;
				break;
			case "D0":
				score += 1.0 * grade;
				break;
			case "F":
				score += 0.0 * grade;
				break;
			}
		}
		System.out.println(score/count);

	}

}