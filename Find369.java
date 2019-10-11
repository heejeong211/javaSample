import java.util.Scanner;

public class Find369 {
	// number 123
	public static int find369(int number){
	    int count = 0;
		// 더이상 비교할 자리수가 없다
		while (number > 0) {
			//맨 마지막 자리수에 3,6,9가 들어있는 지 확인하는 거 
			int temp = number % 10;
			if (temp == 3 || temp == 6 || temp == 9) 
				count++;
				//한 자리씩 줄이는 거
			number /= 10;
		}
			return count;
	}	

	public static void main(String[] args) {
	    for (Integer i = 1; i <= 100; i++) {
		    int count = find369(i);
		    System.out.format("%d :", i);
		    for (int j = 0; j < count; j++) {
			    System.out.print("짝");
		}
		System.out.println("");
	  }
   }   
}
