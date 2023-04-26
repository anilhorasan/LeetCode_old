class Solution {
    
    public int[] plusOne2(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
    
    public int[] plusOne(int[] digits){
        int len = digits.length;
        int plus = 1;
        while(len > 0 && plus == 1){
            if(digits[len-1] + 1 < 10) {
                digits[len-1]++;
                plus = 0;
                return digits;
            }
            else {
                digits[len-1] = 0;
                plus = 1;
            }
            len--;
        }
        int[] digits2 = new int[digits.length + 1];
        digits2[0] = 1;
        return digits2;
    }

}