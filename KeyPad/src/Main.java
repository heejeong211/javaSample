
public class Main {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.number1();//난 함수를 호출했지만 OOP에서는 7이라는 버튼을 누른것임.
		c.number2();
		c.multi();
		c.number2();
		c.assign();
		
		System.out.println("expected: 24, actual: " + c.displayNumber());
	}

}
