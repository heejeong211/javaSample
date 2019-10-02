import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력하시오; ");
        int number = scanner.nextInt();
		if (number % 2 == 0) {
			System.out.println("짝수");
		} else if (number % 2 == 1) {
			System.out.println("홀수");
		}
	 }
}

