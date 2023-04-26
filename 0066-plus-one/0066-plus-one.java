class Solution {
    public int[] plusOne(int[] digits){
        int len = digits.length;
        int plus = 1;
        while(len > 0 && plus == 1){
            if(digits[len-1] + 1 < 10) {
                digits[len-1]++;
                plus = 0;
            }
            else {
                digits[len-1] = 0;
                plus = 1;
            }
            len--;
        }
        if(plus == 1){
            int[] digits2 = new int[digits.length + 1];
            digits2[0] = 1;
            for(int i = 1; i <= digits.length; i++){
                digits2[i] = 0;
            }
            digits = digits2;
        }
        return digits;
    }
}