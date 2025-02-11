import java.util.*;

public class Menu {
	private String firstName;
	private String lastName;
	private Scanner scanner;
	
	public Menu() {
		this.scanner = new Scanner(System.in);
		this.firstName = "";
		this.lastName = "";
	}
	
	public void processMain() {
		String cmd = scanner.next();
		cmd.trim();

		if (cmd.equalsIgnoreCase("1")) {
			editScreen(1);
		} else if (cmd.equalsIgnoreCase("2")) {
			editScreen(2);
		} else if (cmd.equalsIgnoreCase("x")) {
			System.out.println("Program exit(0)");
			System.exit(0);
		}
	}
	
	public void mainScreen( ) {
		while (true) {
	        System.out.println("************************************");
            System.out.format("\tFirst Name: %s\n", firstName); // \t 는 tab
		    System.out.format("\tLast Name: %s\n", lastName);
		    System.out.println("************************************");
		
		    System.out.println("\n\t1) First Name");
		    System.out.println("\t2) Last Name");
		    System.out.println("\tx) Exit");
		    System.out.print("\nInput> ");
		
		    processMain();
	    }
   }
		
public void editScreen(int screenId) {
	while(true) {
//	   if (screenId == 100) {
//		   System.out.format("\t현재: %s\n", firstName);
//	    } else {
//		   System.out.format("\t현재: %s\n", firstName);
//	    }
	    System.out.format("\t현재: %s\n", (screenId == 1 ? firstName : lastName));
	    System.out.println("\t수정: ");
	
	    String newValue = scanner.next();
	    System.out.println("\ts) Save");
	    System.out.println("\tc) Cancle");
	    System.out.print("Input> ");

		String cmd = scanner.next();
		cmd.trim(); //문자열로 들어오면 공백 생길 수 있으니까 trim으로 공백 제거해야함
		
		if ( cmd.equalsIgnoreCase("c")) {
			return;
		} else if (cmd.equalsIgnoreCase("s")) {
			if (screenId == 1)
				this.firstName = newValue;
			else
				this.lastName = newValue;
			return;
		}
	  }
   }
}
