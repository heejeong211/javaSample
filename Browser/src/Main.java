import java.io.*;

public class Main {
	public static void main(String[] args) {
		File file;
		
		try {
			file = new File("C:\\�����\\user");
			System.out.println("exists : " + file.exists());
			System.out.println("isDirectory : " + file.isDirectory());
			System.out.println("isFile : " + file.isFile());
			
			String[] files = file.list(); //���� ����Ʈ�� ���Ͽ� ����
			for(String child : files) {
				System.out.println(child);
				
				//�ش� ����� ���ϵ�� ������ ������ �迭�� ��ȯ�Ѵ�.
			/*File[] files = file.listFiles();
			 * for (File child : files) {
			 *      System.out.format("%s, isDiractory: %b\n", child.getName(), child.isDiractory());*/
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
