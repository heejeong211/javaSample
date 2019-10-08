import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {

	public static int hexToInt(char c) throws NumberFormatException {
		if(Character.isDisit(c)) {
			return c -'0';
		} else if (c == 'A' || c == 'a') {
			return 10;
		} else if (c == 'B' || c == 'b') {
			return 11;
		} else if (c == 'C' || c == 'c') {
			return 12;
		} else if (c == 'D' || c == 'd') {
			return 13;
		} else if (c == 'E' || c == 'e') {
			return 14;
		} else if (c == 'F' || c == 'f') {
			return 15;
		} else {
			throw new NumberFormatException(String.format("Invalid digit : %c",c));
		
		
		
		
	/*	assert 0 == hexToInt('0');


	public static int hexToInt(char c) throws NumberFormatException {
		switch (c) {
			case '0':
				retrne c - '0';



			*/
