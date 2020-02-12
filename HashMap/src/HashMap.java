import java.util.*;

public class HashMap {
	//맵에서 키를 모를 때
	//모든 값을 출력하는 방법
	public class HashMap {
		public static void main(String[] args) {
			HashMap<Integer, String> errorCodeMap = new HashMap<>();
			errorCodeMap.put(400, "Internal Error");
			errorCodeMap.put(404, "Page Nor Found");
			errorCodeMap.put(500, "Server error");
			for(Integer i : errorCodeMap.keySet()) {
				System.out.println("key: "+i);
				System.out.println("value: "errorCodeMap.get(i));
			}
		}

	}


}
