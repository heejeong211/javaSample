import java.util.Scanner;

class RomanToNumber {
	//Entry point
	public static void main(String[] args) throws Exception {
		Scanner scanner = new scanner(System.in);
		String roma = scanner.next();
		
		System.out.print("Input roman number; ");
		String roman = scanner.next();

		if (roman.equalsIgnorCase("I")) {
			System.out.println("number 1");
		} else if (roman.equalsIgnorCase("II")) {
			System.out.println("number 2");
        } else if (roman.equalsIgnorCase("III")) {
			System.out.println("number 3");
		} else if (roman.equalsIgnorCase("IV")) {
			System.out.println("number 4");
		} else if (roman.equalsIgnorCase("V")) {
			System.out.println("number 5");
		} else if (roman.equalsIgnorCase("VI")) {
			System.out.println("number 6");
		} else if (roman.equalsIgnorCase("VII")) {
			System.out.println("number 7");
		} else if (roman.equalsIgnorCase("VIII")) {
			System.out.println("number 8");
		} else if (roman.equalsIgnorCase("IX")) {
			System.out.println("number 9");
		} else if (roman.equalsIgnorCase("X")) {
			System.out.println("number 10");
		} else {
			System.out.println("Invalid roman number");

		}
	}
}





/*

		System.out.println("Roman nuber ; " + roman);
		System.out.println("toLowerCase ; " + roman.toLowerCase);
		System.out.println("toUpperCase ; " + roman.toUpperCase);
		System.out.println("compareTo(\"I\") ; " + roman.toUpperCase);
		System.out.println("compareTo(\"I\") ; " + roman.toUpperCase);
		System.out.println("compareTo(\"I\") ; " + roman.toUpperCase);

	}
}

		/*
		if (roman == "I") {
			System.out.println("number = 1");
		} else if (roma == "II") {
			System.out.println("number = 2");
		} else if (roma == "III") {
			System.out.println("number = 3");
		} else if (roma == "IV") {
			System.out.println("number = 4");
		} else if (roma == "V") {
			System.out.println("number = 5");
		} else if (roma == "VI") {
			System.out.println("number = 6");
		} else if (roma == "VII") {
			System.out.println("number = 7");
		} else if (roma == "VIII") {
			System.out.println("number = 8");
		} else if (roma == "IX") {
			System.out.println("number = 9");
		} else if (roma == "X") {
			System.out.println("number = 10");

		}
	}
}
