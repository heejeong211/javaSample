
public class ReverseInteger {
	 public int reverse(int x) {
	        long sign = 1L;
	        long temp = x;//여기서 int를 Long으로 바꿔줘야 함. 왜냐하면 제일 작은 음수가 리버스하게 되면
	                      //제일 큰 수가 되버려서 Integer 범위를 넘어갈까봐.
	        
	        if (temp < 0) {
	            temp *= -1;//양수를 만들기 위해
	            sign = 1L;//x가 음수일 때는 사인을 1로 저장, 음수였으면 음수로 돌아가는 것.
	        }
	        
	        long reverse = 0;
	        while (temp > 0) {
	            reverse = reverse * 10 + temp % 10;//한자리씩 뽑아내는 것
	            temp /= 10;//한자리씩 오른쪽으로 정렬
	        }
	        return (reverse > Integer.MAX_VALUE ? 0 : (int)(sign * reverse));

//	        if (reverse > Integer.MAX_VALUE) {
//	            reverse = 0;
//	       }
//	       return new Long(sign * reverse).intValue();
	    }
	}

	// 여기 정답지
	/* int rev = 0;
	        while (x != 0) {
	            int pop = x % 10;
	            x /= 10;
	            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
	            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
	            rev = rev * 10 + pop;
	        }
	        return rev;
	    }
	}
	*/


