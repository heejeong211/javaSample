
public class Main {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.number1();//�� �Լ��� ȣ�������� OOP������ 7�̶�� ��ư�� ��������.
		c.number2();
		c.multi();
		c.number2();
		c.assign();
		
		System.out.println("expected: 24, actual: " + c.displayNumber());
	}

}
