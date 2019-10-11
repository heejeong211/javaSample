public class Fibonacci {
	public static void main(String[] args) {
		for (int i = 0; i < 40 ; i++)
	        System.out.format("fibonacci(%d) = %d\n", i, fibonacci(i));
	}
	//재귀호출이란? 어떤 함수가 자기 자신을 호출하는 것이다.
    //재귀호출 함수 작성시 주의할 점은? 무조건 종료 조건이 있어야 한다.
     public static long fibonacci(int n) throws IndexOutOfBoundsException {
		if (n < 0)
			 throw new IndexOutOfBoundsException(String.format("Out of bounds : %d", n));

		if (n == 0 || n == 1)
			return 1;
		return fibonacci(n - 2) + fibonacci(n - 1);

		/*

		   switch (n) {
		    case 0:
			case 1:
			   return 1;
			default:
			   return fibonacci(n-2) + fibonacci(n-1);
		   }
				 */
	   }
}


