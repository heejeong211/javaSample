
public class PalindromeNumber {
	public boolean isPalindrome(int x) {
        if (x < 0)
            return false;

        //���ڿ��� Ǯ���� ��        
//       String number = String.valuOf(x); //���ڸ� ���ڿ��� �ٲٴ� �κ�
        //String number = String.format("%d", x);
        //String number = "" + x;
        //String number = new Integer(x).toSring();
//       int length = number.length();
        //int lastIndex = length - 1//������ ���ڴ� ���ڿ����̿� -1�Ѱ�
        
//       for (int i = 0; i < length / 2; i++) {
//           if (number.charAt(i) != number.charAt(lastIndex - i)
//               return false;
//       }
//       return true;

        //���� ������        
//        if(x < 0 || (x % 10 == 0 && x != 0)) {
//            return false;
//        }

//        int revertedNumber = 0;
//        while(x > revertedNumber) {
//            revertedNumber = revertedNumber * 10 + x % 10;
//            x /= 10;
//        }
        
//        return x == revertedNumber || x == revertedNumber/10;
//    }
//}
        
        //���������� �������� �� 
        //���������� �����ϸ� int�� ������ �Ѿ �� �ִ�. �׷��� ���ڿ��� Ǫ�� ���� ������.
        Long reverse = 0L;//Integer�� ��ɾ� ����� ������ �ִµ� ���ڸ� �������� �� �� ������ ��� ��� Long���� ���.
        int temp = x;
        while (temp > 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }
        return reverse == (long) x;//x�� �ٷ� �־������ ���⼭ x�� 0�� �ɱ�� temp�� �ٲ��ذ���.
        
     }


}
