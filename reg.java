import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.PrintWriter;
import java.util.Scanner;

public class reg {
	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out,true);
		Scanner s = new Scanner(System.in);
		pw.println("������� ����������� ������");
		String str = s.nextLine();
		while (!str.equals("n")) {
		if (isCorrect(str)) {
			pw.println("String is correct!");
		}
		else {
			pw.println("String is incorrect!");
		}
		pw.println("����������? y/n");
		str = s.nextLine();
		if (str.equals("y")) {
			pw.println("������� ����������� ������");
			str = s.nextLine();
		}
		}
		s.close();
	}
	
	public static boolean isCorrect(String str) {
		boolean correct = false;
		Pattern pattern = Pattern.compile("([�-�][�-�]*\\s?){3}, (0[1-9]|[12][0-9])\\.(0[1-9]|[1][0-2])\\.(19|20)?\\d\\d, ([�-�][�-�]*)");
		Matcher matcher = pattern.matcher(str);
		if (matcher.find()) {
			correct = true;
		}
		return correct;
	}

}
