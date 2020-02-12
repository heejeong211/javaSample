import java.util.*;

enum KeyPad { //열거형을 쓴 이유. String이나 다른 애도 와도 되긴 하는데.. 타입을 제한 하기 위해서, 값의 범위를 제한 하기 위해서
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
	private KeyPad lastOp = null; //마지막에 입력한 연산자 저장
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
//		double displayNumber = number; //double은 부동소수점. 그래서 이 방법이 안 좋음.
//		String format = "%.f";//소수점 출력하지 말라는 의미
//		if (exp >= 0) {//자연수라는 의미
//			   displayNumber /= Math.pow(10, exp);
//			   format = String.format("%%.%df", exp); //%%는 %, %d는 정수 
//		}
//	    return String.format("%.5f", displayNumber);//그래서 5자리만 만들어 줘야 한다.
	    return "" + this.number;
	}
	
	private void number(KeyPad key) {
		int disit = key.value() - 0;
		
		if(lastInput == InputMode.Operator) { // 마지막 입력이 연산자 였다면 
			   number = disit;
		} else { 
			   number = number * 10 + disit; //숫자였을 테니까 그냥 더하기함.
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
		  //이전 입력상태가 Digit라면
		  if (lastInput == InputMode.Digit) {
			  //연산자 입력전에 편집중이던 숫자를 스택에 저장한다.
			  this.operands.add(0, number()); //첫번째에서 넣고 첫번째에서 빼내라
		  
		  }
		  
		  int number = operands.size();
		  if (number == 2) {
			  this.rightNumber = this.operands.remove(0);
			  int leftNumber = this.operands.remove(0);
			  Character operator = this.operators.remove(0);
			  // 결과를 화면에 출력하고, 스택에 저장.
			  this.operands.add(0, processCalc(leftNumber, rightNumber, operator));
		  } else if (number == 1) { // 오퍼레이터가 이미 있는지 확인
			  if (this.operators.size() == 0) {
				  if (op == KeyPad.KEYPAD_ASSIGN && this.lastOp != null) { //최근에 연산한적 있으면 이걸 해라
					  int leftNumber = this.operands.remove(0);
					  Character operator = this.operators.remove(0);
					  this.operands.add(0, processCalc(leftNumber, rightNumber, operator));
				  } else if (op != KeyPad.KEYPAD_ASSIGN) {//대입연산자가 아니거나 최근에 연산한적 없으면
					  this.operators.add(0, op.value());//최근에 연산한적 없으면
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
		//1. 단항 연산자 or 이항 연산자 따져야 함. 오퍼랜드 개수가 달라서 작동하는게 다름
		//2. 이항 연산자라면, 오퍼랜드 입력이 두 개 인지 확인한다.
		//2-0. 오퍼랜드가 하나이고, 이전 입력이 OP가 아니라면(숫자였다면), 새로운 OP 스택에 저장
		//2-1. 오퍼랜드가 입력이 두 개가 존재한다면, (이전 연산자가 이항 연산자이기 때문) 이전 OP를 실행
		//2-2. 오퍼랜드 입력이 한개이고, 이전 OP가 이항 연산자인 경우, 새로운 OP 스킵
	//	lastOp = op; //두번째 연산자를 확인하는 코드. 왜냐하면 얘가 처음엔 null이라서
	//	lastInput = InputMode.Operator; 
		if (lastInput == InputMode.Digit) {
			//연산자 입력전에 숫자 입력
			int number = number;
			operands.add(0, number);
		}
		int number = number(); //항상 top에 넣는 것
		operands.add(0, number); // 현재 숫자를 넣어줌
		lastOp = op;
	} else if (op == KeyPad.KEYPAD_ASSIGN){//대입연산자를 입력한 경우
		
	} else {
	  
	  }	
	  lastOp = op;
	  
	  private int processCalc(int left, int right, char operator) {
		  return 0;
	  }
	  
	  private void operator(KeyPad op) {
		  //이전 입력상태가 Digit라면
		  if (lastInput == InputMode.Digit) {
			  //연산자 입력전에 편집중이던 숫자를 스택에 저장한다.
			  this.operands.add(0, number();); //첫번째에서 넣고 첫번째에서 빼내라
		  
		  }
          */
		
	public void number0() { //OOP(객체와 객체)함수를 통해서 이벤트가 발생됨 ex)브레이크/정지하는 이벤트 (거의 함수=이벤트)
		number(KeyPad.KEYPAD_0); //안에 있는 값이 메세지 타입
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
		number(KeyPad.KEYPAD_9); //리터럴 상수를 많이 쓸 수록 바꿔줘야해서. 멤버 상수 한군데에서 고치면 여러 군데도 고쳐짐.
	}
	
	public void dot() {
		if(lastInput == InputMode.Operator || exp < 0) { // lastInput이 0일 경우만 exp가 0이 되야함
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
