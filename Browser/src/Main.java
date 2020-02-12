import java.io.*;

public class Main {
	public static void main(String[] args) {
		File file;
		
		try {
			file = new File("C:\\사용자\\user");
			System.out.println("exists : " + file.exists());
			System.out.println("isDirectory : " + file.isDirectory());
			System.out.println("isFile : " + file.isFile());
			
			String[] files = file.list(); //파일 리스트를 파일에 리턴
			for(String child : files) {
				System.out.println(child);
				
				//해당 경로의 파일들과 폴더의 파일을 배열로 반환한다.
			/*File[] files = file.listFiles();
			 * for (File child : files) {
			 *      System.out.format("%s, isDiractory: %b\n", child.getName(), child.isDiractory());*/
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
