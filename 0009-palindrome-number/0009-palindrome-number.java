class Solution {
    public boolean isPalindrome(int x){
        if(x<0) return false;
        else return reverse(x) == x;
    }
    
    private int reverse(int x){
        int reverse = 0;
        while (x>0){
            reverse = reverse*10 + x%10;
            x = x/10;
        }
        return reverse;
    }
    
    public boolean isPalindrome2(int x) {
        String str = String.valueOf(x);
        int start = 0;
        int end = str.length() - 1;
        while(start < end){
            if(str.charAt(start++) != str.charAt(end--)) return false;
        }
        return true;
    }
    
    
}