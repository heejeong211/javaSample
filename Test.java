import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		int[] number = new int[100];
		int count = 0;

		for (int i = 1; i <= 100; i++) {
			
			if (i % 2 == 0) {
				System.out.println("짝수");
			} else if (i % 2 == 1) {
				System.out.println("홀수");
			}
	 }
  }
}
