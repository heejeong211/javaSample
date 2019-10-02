import java.util.Scanner;

class Sample {
	//Entry point
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int Korean, math, english;

		System.out.print("Input Korean; ");
		Korean = scanner.nextInt();
	

		System.out.print("Input math; ");
		math = scanner.nextInt();

		System.out.print("Input english; ");
		english = scanner.nextInt();

		int total = Korean + math + english;
		System.out.println("Total   : " + total);
		System.out.println("Average : " + total / 3.0);
		
		int avg = (int)(total / 3.0 * 100 + 0.5);
		System.out.println("Average2 : " + avg / 100.0);
		System.out.format("Average3 : %.2f\n", total / 3.0);

	
	}
}
