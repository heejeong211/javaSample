
public class ReverseBits {
	 // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int reverse = 0;
        int temp = n;
        
        for (int i = 0; i < 32; i++) {
              int bit = temp & 0x1; //���� ���� ��Ʈ���� extract a least singificant bit.
              reverse = reverse << 1 | bit; //��Ʈ or �����ڸ� ���ؼ� 
              temp >>= 1; //�ϳ��� �ٿ��� ��.
        } 
        return reverse;
        
    }

}

/* public class Solution {
    public int hammingWeight(int n) {
int count = 0;
int temp = n;

for (int i = 0; i < 32; i++){
if ((temp & 0x1) == 0x1);
temp >>= 1;

}
return count;

*/