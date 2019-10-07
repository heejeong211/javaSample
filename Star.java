import java.util.Scanner;
public class Star {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String pattern = "*";
		int n = scanner.nextInt();
		for (int i = 1; i <= n; i++){
			System.out.format(String.format("%%%ds\n", n), pattern);
			pattern += "*";
		}
	}
}

			/*
		     for (int j = 9; j >= i; j--){
				  System.out.print(" ");
			 }
			 for(int k = 0; k < i; k++){
				 System.out.print("*");
			 }
			 System.out.println("");
		}
	}
}
*/

        

