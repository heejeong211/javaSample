import java.util.Scanner;
public class Test2 {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int num;

		do {
			System.out.print("1과 9사이의 숫자를 입력하시오: ");
			num = scanner.nextInt();
			if (num < 1 || num > 9)
				continue;

			for (int i = 1; i <= 9; i++){
				System.out.format("%d x %d = %d\n", num, i, (num * i));
			}
			System.out.println("=====================");
		} while (true);
	}
}
/*
        System.out.print("1과 9사이의 숫자를 입력하시오: ");
		
		for (num = 1; num <= 9; num++){
		for (int i = 1; i <= 9; i++){




		int[] numbers = num int[100]
		int count = 0;
		
		int x = scanner.nextInt();
		boolean numbers = true;

		for (int n = 1; n < 10; n++){
			if (n * n) 

*/

