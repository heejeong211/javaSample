import java.util.Scanner;

public class Control {
	public static void main(String[] args) throws Exception {

		//정수를 입력받아
		//양의 정수면 양의 정수로
		//음의 정수면 음의 정수로 출력 
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("정수를 입력하시오; ");
		int number = scanner.nextInt();
		if (number > 0){
			System.out.println("양수");
		} else if (number < 0) {
			System.out.println("음수");

		}




        //성별을 입력 받아 
        //M이면 남성이라 출력
        //F이면 여성이라 출력
        Scanner scanner = new Scanner(System.in);

		System.out.print("성별을 입력하시오; ");
		if (gender.equalsIgnoreCase("M")) {
			System.out.println("남성");
		} else if (gender.equalsIgnoreCase("F")) {
			System.out.println("여성");
		}
	}
}



        //1부터 100사이의 정수중에 Prime Number(소수)를 구하시오
        //소수는 0과 1을 제외한 오로지 자기 자신만으로 나워지는 수
        //어떤수 a에 다른 소수로 나누어 지지 않는 다면 소수다.

         int[] numbers = new int[100];
		 int count = 0;
		 boolean isPrime;

		 for (int n = 2; n <= 100; n++) {
            isPrime = true;
             for (int i = 0; i < count; i++) {
				 if (n % numbers[i] == 0) {
					 isPrime = false;
					 break;
				 }
			 }
			 if (isPrime) {
				 numbers[count] = n;
				 count++;

		 for (int i = 0; i < count; i++) {
			 System.out.format("%d is a prime number\n". number[i]);

			 }
		 }
		 //1부터 100까지 출력한 다음
		 //짝수는 짝수 홀수는 홀수라고 출력
       
		 for (int i = 0; i < count; i++) {
			 if (







