import java.io.*;
import java.util.*;

public class PrintWriter {
	public static void main(String[] args) {
		writeScores();
	}
	public static void writeScores() {
		Scanner scanner = new Scanner(System.in);
		PrintWriter file = null;
		
		try {
			file = new PrintWriter("scores.csv");
			file.println("�̸�, ����, ����, ����, ����, ����");
			
			while (ture) {
				System.out.print("�̸�: ");
				String name = scanner.next();
				
				System.out.print("����: ");
				int korean = scanner.nextInt();
				
				System.out.print("����: ");
				int math = scanner.nextInt();
				
				System.out.print("����: ");
				int english = scanner.nextInt();
				
				// TO-DO: �����ϴ� �ڵ� �ۼ�.
				file.format("%s, %d, %d, %d, %d, %.2f\n", name, korean, math, english, 0, 0.0);
				
				System.out.print("�ߴ��� q, ��� �Է��� �ƹ�Ű(any)�� �����ּ���:");
				String key = scanner.next();
				
				// TO-DO: �б��ϴ� �ڵ� �ۼ�.
				if ("q".equalsIgnoreCase(key)) { // ����� ������ ���� �� ����� �������� ��.�����̸����� ������ �ܺο��� �ҷ��� ������� null���� ����.
					break;
				}
				
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("���� �Է��� �Ϸ��մϴ�.");

			scanner.close();
			try {
				if (file != null) {
					file.flush(); // ���ۿ� ���� �����͸� ���Ͽ� ����.
					file.close();
				}
			} finally {
			}
		}
	}
	
	