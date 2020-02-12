import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
//		reader("C:\\Users\\user\\Downloads\\sample\\sample.csv");
		reader("sample.csv");
	}

	public static void reader(String fileName) {
		List<String[]> rows = new ArrayList<String[]>();

		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader reader = new BufferedReader(fileReader);
			String line;

			while ((line = reader.readLine()) != null) {
				String[] cols = line.split(",");
				rows.add(cols);
			}
			reader.close();
			fileReader.close();

			for (String[] cols : rows) {
				System.out.format("cols: %d, First: %s\n", cols.length, cols[0]);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
