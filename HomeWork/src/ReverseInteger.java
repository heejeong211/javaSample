
public class ReverseInteger {
	 public int reverse(int x) {
	        long sign = 1L;
	        long temp = x;//���⼭ int�� Long���� �ٲ���� ��. �ֳ��ϸ� ���� ���� ������ �������ϰ� �Ǹ�
	                      //���� ū ���� �ǹ����� Integer ������ �Ѿ���.
	        
	        if (temp < 0) {
	            temp *= -1;//����� ����� ����
	            sign = 1L;//x�� ������ ���� ������ 1�� ����, ���������� ������ ���ư��� ��.
	        }
	        
	        long reverse = 0;
	        while (temp > 0) {
	            reverse = reverse * 10 + temp % 10;//���ڸ��� �̾Ƴ��� ��
	            temp /= 10;//���ڸ��� ���������� ����
	        }
	        return (reverse > Integer.MAX_VALUE ? 0 : (int)(sign * reverse));

//	        if (reverse > Integer.MAX_VALUE) {
//	            reverse = 0;
//	       }
//	       return new Long(sign * reverse).intValue();
	    }
	}

	// ���� ������
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


