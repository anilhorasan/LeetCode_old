class Solution {
   
    // without using String
    public boolean isPalindrome(int x) {

        if(x < 0) return false; // Negative numbers are not palindromes
        if(x == 0) return true; // 0 is a palindrome

        int original = x;
        int reversed = 0;

        while(x > 0){
            reversed = reversed*10 + x%10;
            x = x/10;
        }

        return reversed == original;
    }
    // using String
    public boolean isPalindrome2(int x) {

        if(x <0) return false;
        String str = String.valueOf(x);
        int len = str.length();
        for(int i=0; i<len/2; i++){
            if(str.charAt(i) != str.charAt(len-1-i)) return false;
        }
        return true;
    }

    // The time complexity is O(log(x)) because we divide the number by 10 in each iteration. Or simply O(d) where d is number of digits.
    // The space complexity is O(1) since we are only using a few extra integer variables and not storing the entire number as a string.

    // Using strings:
    // Time complexity: O(d) --> same
    // Space complexity: O(d) --> a bit higher

}