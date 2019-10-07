import java.util.Scanner;

public class Solution1 {
	public static void main(String[] args);

	int[] primeNumber = num int[100]
	int count = 0;

	int x = scanner.nextInt();

	for (int x = 1; x <= 100; x++){
	boolean isPrime = true;

	//for (int i = 2; i < x; i++){
	  for (int i = 0; i < count; i++){
		  //if (x % i == 0) {
		    if (x % primeNumbers[i] == 0){
		isPrime = false;
			break;
		}
	}

	if (isPrime){
		primeNumbers[count] = x;
		count++; //count += 1;
		
		System.out.println(x + "는" + (isPrime? "소수이다" : "소수가 아니다"));

	}
}
