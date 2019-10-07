import java.util.Scanner;

public class Solution3 {
  public static void main(String[] args) throws Exception {
    /**
	 * 1부터 100사이의 정수중에 Prime Number(소수)를 구하시오.
	 * 소수는 0과 1을 제외한 오로지 자기 자신만으로 나뉘어 지는 수.
	 * 어떤수 n이 다른 소수로 나뉘어 지지 않는 다면 소수다.
	 */
	 int[] numbers = new int[100];
	 int count = 0;
	 // 1부터 100까지의 숫자, count는 0
	 boolean isPrime;
	 //소수가 참이냐 거짓이냐

     for (int n = 2; n <= 100; n++) {
		 //n은 2이고 n은 100 보다 작고 n은 하나씩 증가함
		 isPrime = true;
		 for (int i = 0; i < count; i++) {
			 //i는 0이고 i가 count보다 작고 i는 하나씩 증가함
		     if (n % numbers[i] == 0) {
				 //n을 numbers[i]로 나누고 그 값이 0임 
		         isPrime = false;
				 //그 소수는 거짓임
		         break;
				 //마침 
				  
		     }
		}

		if (isPrime) {
			//isPrime은 참이냐 거짓이냐
			numbers[count] = n;
			//numbers[count]에서 count에 i값을 넣고 그게 n임
		    count++;
			//count가 하나씩 증가함
		}
}

/*
for (int i = 1; i <= 100; i++) {
    System.out.format("%d : %s\n", i, (i % 2 == 0 ? "짝수" : "홀수"));
}
*/

for (int i = 0; i < count; i++) {
	System.out.format("%d is a prime number\n", numbers[i]);
	}
  }
}

