import java.util.Scanner;
public class Test3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String temp;
		boolean isDisit = true;
		
		/* temp = scanner.next();
		try {
			int value = Integer.parseInt(temp);
		} catch (Exception ex){
		} */

		temp.trim();

		for (int i = 0; i < temp.length(); i++){
			char ch = temp.charAt(i);
			System.out.format("%c %b\n", ch, Character.isDigit(ch));

			if(!Character.isDisit(ch)) {
				isDisit = false;
				break;
			}
		}
	}
}
		


