import java.util.*;

public class Main {
	private AddressBook<Address> addressBook;
	private Scanner scanner;

	public Main() {
		this.addressBook = new AddressBook<Address>();
		this.scanner = new Scanner(System.in);
	}

	private void drawMenu() {
		System.out.println("a) �߰�");
		System.out.println("p) ���");
		System.out.println("x) ����");
		System.out.print("�޴��� �����ϼ���: ");
	}

	private void printAddress() {
		addressBook.print();
	}

	private void processField(Address address) {
		String fieldName = "";
		String value = "";

		while (true) {
			System.out.print("�ʵ� �̸�: " + fieldName);
			fieldName = this.scanner.next();

			System.out.print("�ʵ� ����: " + value);
			value = this.scanner.next();
			
			System.out.println("s) ����");
			System.out.println("c) ���");
			System.out.print("�Է�: ");

			String cmd = this.scanner.next();
			cmd.trim();

			if (cmd.equalsIgnoreCase("s")) {
				address.addField(fieldName, value);
				return;
			} else if (cmd.equalsIgnoreCase("c")) {
				return;
			}
		}
	}

	private void processFields(Address address) {
		while (true) {
			Set<String> fields = address.getFieldNames();
			int i = 0;
			for (String field : fields) {
				System.out.format("%d) %s\n", i++, field);
			}
			System.out.println("a) �߰�");
			System.out.println("c) ���");
			System.out.print("������ ���: ");
			
			String cmd = this.scanner.next();
			if (cmd.equalsIgnoreCase("a")) {
				processField(address);
			} else if (cmd.equalsIgnoreCase("c")) {
				return;
			}
		}
	}

	private void processAdd() {
		Address address = new AddressImpl();

		try {
			while (true) {
				System.out.format("1) �̸� : %s\n", address.getFirstName());
				System.out.format("2) �� : %s\n", address.getLastName());
				System.out.println("3) �ʵ� �߰�");
				System.out.println("s) ����");
				System.out.println("c) ���");
				System.out.print("������ �ʵ�: ");
				
				String cmd = this.scanner.next();
				cmd.trim();
				if (cmd.equalsIgnoreCase("1")) {
					
				} else if (cmd.equalsIgnoreCase("2")) {

				} else if (cmd.equalsIgnoreCase("3")) {
					processFields(address);
				} else if (cmd.equalsIgnoreCase("s")) {
					return;
				} else if (cmd.equalsIgnoreCase("c")) {
					return;
				}
			}
		} finally {
		}
	}

	private void processInput() {
		try {
			String cmd = this.scanner.next();
			cmd.trim();

			if (cmd.equalsIgnoreCase("a")) {
				processAdd();
			} else if (cmd.equalsIgnoreCase("p")) {
				printAddress();
			} else if (cmd.equalsIgnoreCase("x")) {
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
			} else {
			}
		} finally {
		}
	}

	public void run() {
		while (true) {
			drawMenu();
			processInput();
		}
	}

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

}
