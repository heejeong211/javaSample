
public class PalindromeNumber {
	public boolean isPalindrome(int x) {
        if (x < 0)
            return false;

        //문자열로 풀었을 때        
//       String number = String.valuOf(x); //숫자를 문자열로 바꾸는 부분
        //String number = String.format("%d", x);
        //String number = "" + x;
        //String number = new Integer(x).toSring();
//       int length = number.length();
        //int lastIndex = length - 1//마지막 문자는 문자열길이에 -1한거
        
//       for (int i = 0; i < length / 2; i++) {
//           if (number.charAt(i) != number.charAt(lastIndex - i)
//               return false;
//       }
//       return true;

        //여기 정답지        
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
        
        //수학적으로 접근했을 때 
        //수학적으로 접근하면 int의 범위를 넘어갈 수 있다. 그래서 문자열로 푸는 것이 안전함.
        Long reverse = 0L;//Integer는 멤심엄 사이즈가 정해져 있는데 문자를 뒤집었을 때 그 범위를 벗어날 까봐 Long형을 사용.
        int temp = x;
        while (temp > 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }
        return reverse == (long) x;//x를 바로 넣어버리면 여기서 x가 0이 될까봐 temp로 바꿔준것임.
        
     }


}
