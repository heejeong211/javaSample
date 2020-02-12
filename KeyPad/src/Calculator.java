import java.util.*;

enum KeyPad { //�������� �� ����. String�̳� �ٸ� �ֵ� �͵� �Ǳ� �ϴµ�.. Ÿ���� ���� �ϱ� ���ؼ�, ���� ������ ���� �ϱ� ���ؼ�
	KEYPAD_0('0'),
	KEYPAD_1('1'),
	KEYPAD_2('2'),
	KEYPAD_3('3'),
	KEYPAD_4('4'),
	KEYPAD_5('5'),
	KEYPAD_6('6'),
	KEYPAD_7('7'),
	KEYPAD_8('8'),
	KEYPAD_9('9'),
	
	KEYPAD_DOT('.'),
	
	KEYPAD_PULS('+'),
	KEYPAD_MINUS('-'),
	KEYPAD_MULTI('*'),
	KEYPAD_DIVIDE('/'),
	KEYPAD_ASSIGN('='),
	
	KEYPAD_CLR('C');
 
	private char value;
	
	private KeyPad(char value) {
		this.value = value;
	}
	
	public char value() {
		return value;
		
	}
}

enum InputMode {
	Digit, Operator
}

public class Calculator {
	private int number = 0;
	private int exp = -1;
	
	private Integer rightNumber = null;
	private KeyPad lastOp = null; //�������� �Է��� ������ ����
	private InputMode lastInput = InputMode.Digit;

	List<Integer> operands = new ArrayList<Integer>();
	List<Character> operators = new ArrayList<Character>();
	
	private int number() {
//		double number = this.number;
//		if (exp >= 0) {
//			number /= Math.pow(10, exp);
//		}
			return this.number;
	}
	
	String displayNumber() {
//		double displayNumber = number; //double�� �ε��Ҽ���. �׷��� �� ����� �� ����.
//		String format = "%.f";//�Ҽ��� ������� ����� �ǹ�
//		if (exp >= 0) {//�ڿ������ �ǹ�
//			   displayNumber /= Math.pow(10, exp);
//			   format = String.format("%%.%df", exp); //%%�� %, %d�� ���� 
//		}
//	    return String.format("%.5f", displayNumber);//�׷��� 5�ڸ��� ����� ��� �Ѵ�.
	    return "" + this.number;
	}
	
	private void number(KeyPad key) {
		int disit = key.value() - 0;
		
		if(lastInput == InputMode.Operator) { // ������ �Է��� ������ ���ٸ� 
			   number = disit;
		} else { 
			   number = number * 10 + disit; //���ڿ��� �״ϱ� �׳� ���ϱ���.
		       if (exp >= 0) {
			   exp++;
		       }
		}
		lastInput = InputMode.Digit;
	}
	
	private int processCalc(int left, int right, char operator) {
		if (operator == '+') {
			return (left + right);
		} else if (operator == '-') {
			return (left - right);
		} else if (operator == '*') {
			return (left * right);
		} else if (operator == '/') {
			return (left / right);
		}
		return 0;
	}
	
	  private void operator(KeyPad op) {
		  //���� �Է»��°� Digit���
		  if (lastInput == InputMode.Digit) {
			  //������ �Է����� �������̴� ���ڸ� ���ÿ� �����Ѵ�.
			  this.operands.add(0, number()); //ù��°���� �ְ� ù��°���� ������
		  
		  }
		  
		  int number = operands.size();
		  if (number == 2) {
			  this.rightNumber = this.operands.remove(0);
			  int leftNumber = this.operands.remove(0);
			  Character operator = this.operators.remove(0);
			  // ����� ȭ�鿡 ����ϰ�, ���ÿ� ����.
			  this.operands.add(0, processCalc(leftNumber, rightNumber, operator));
		  } else if (number == 1) { // ���۷����Ͱ� �̹� �ִ��� Ȯ��
			  if (this.operators.size() == 0) {
				  if (op == KeyPad.KEYPAD_ASSIGN && this.lastOp != null) { //�ֱٿ� �������� ������ �̰� �ض�
					  int leftNumber = this.operands.remove(0);
					  Character operator = this.operators.remove(0);
					  this.operands.add(0, processCalc(leftNumber, rightNumber, operator));
				  } else if (op != KeyPad.KEYPAD_ASSIGN) {//���Կ����ڰ� �ƴϰų� �ֱٿ� �������� ������
					  this.operators.add(0, op.value());//�ֱٿ� �������� ������
				  }
				  this.operators.add(0, op.value());
			  } else if(this.lastOp != null && op == KeyPad.KEYPAD_ASSIGN) {//0 or 1
				  int leftNumber = this.operands.remove(0);
				  Character operator = this.operators.remove(0);
				  this.operands.add(0, processCalc(leftNumber, rightNumber, operator));

			  }
		  }
	  }
	
	
	
/*	private void operator(KeyPad op) {
		//1. ���� ������ or ���� ������ ������ ��. ���۷��� ������ �޶� �۵��ϴ°� �ٸ�
		//2. ���� �����ڶ��, ���۷��� �Է��� �� �� ���� Ȯ���Ѵ�.
		//2-0. ���۷��尡 �ϳ��̰�, ���� �Է��� OP�� �ƴ϶��(���ڿ��ٸ�), ���ο� OP ���ÿ� ����
		//2-1. ���۷��尡 �Է��� �� ���� �����Ѵٸ�, (���� �����ڰ� ���� �������̱� ����) ���� OP�� ����
		//2-2. ���۷��� �Է��� �Ѱ��̰�, ���� OP�� ���� �������� ���, ���ο� OP ��ŵ
	//	lastOp = op; //�ι�° �����ڸ� Ȯ���ϴ� �ڵ�. �ֳ��ϸ� �갡 ó���� null�̶�
	//	lastInput = InputMode.Operator; 
		if (lastInput == InputMode.Digit) {
			//������ �Է����� ���� �Է�
			int number = number;
			operands.add(0, number);
		}
		int number = number(); //�׻� top�� �ִ� ��
		operands.add(0, number); // ���� ���ڸ� �־���
		lastOp = op;
	} else if (op == KeyPad.KEYPAD_ASSIGN){//���Կ����ڸ� �Է��� ���
		
	} else {
	  
	  }	
	  lastOp = op;
	  
	  private int processCalc(int left, int right, char operator) {
		  return 0;
	  }
	  
	  private void operator(KeyPad op) {
		  //���� �Է»��°� Digit���
		  if (lastInput == InputMode.Digit) {
			  //������ �Է����� �������̴� ���ڸ� ���ÿ� �����Ѵ�.
			  this.operands.add(0, number();); //ù��°���� �ְ� ù��°���� ������
		  
		  }
          */
		
	public void number0() { //OOP(��ü�� ��ü)�Լ��� ���ؼ� �̺�Ʈ�� �߻��� ex)�극��ũ/�����ϴ� �̺�Ʈ (���� �Լ�=�̺�Ʈ)
		number(KeyPad.KEYPAD_0); //�ȿ� �ִ� ���� �޼��� Ÿ��
	}
	
	public void number1() {
		number(KeyPad.KEYPAD_1);
	}
	
	public void number2() {
		number(KeyPad.KEYPAD_2);
	}
	
	public void number3() {
		number(KeyPad.KEYPAD_3);
	}
	
	public void number4() {
		number(KeyPad.KEYPAD_4);
	}
	
	public void number5() {
		number(KeyPad.KEYPAD_5);
	}
	
	public void number6() {
		number(KeyPad.KEYPAD_6);
	}
	
	public void number7() {
		number(KeyPad.KEYPAD_7);
	}
	
	public void number8() {
		number(KeyPad.KEYPAD_8);
	}
	
	public void number9() {
		number(KeyPad.KEYPAD_9); //���ͷ� ����� ���� �� ���� �ٲ�����ؼ�. ��� ��� �ѱ������� ��ġ�� ���� ������ ������.
	}
	
	public void dot() {
		if(lastInput == InputMode.Operator || exp < 0) { // lastInput�� 0�� ��츸 exp�� 0�� �Ǿ���
			if(lastInput == InputMode.Operator)
			   number = 0;
			exp = 0;
		} 
		lastInput = InputMode.Digit;
	}
		
	public void puls() {
		operator(KeyPad.KEYPAD_PULS);
	}
    
	public void minus() {
		operator(KeyPad.KEYPAD_MINUS);
	}
	
    public void divide() {
    	operator(KeyPad.KEYPAD_DIVIDE);
	}
    
    public void multi() {
    	operator(KeyPad.KEYPAD_MULTI);
	}
    
    public void assign() {
    	operator(KeyPad.KEYPAD_ASSIGN);
	
	}
}
