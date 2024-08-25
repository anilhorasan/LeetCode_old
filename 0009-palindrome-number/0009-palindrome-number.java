class Solution {
      
    // FIRST SOLUTION
    public boolean isPalindrome(int x){
        if(x<0) 
            return false;
        else 
            return reverse(x) == x;
    }
    
    private int reverse(int x){
        int reverse = 0;
        while (x>0){
            reverse = reverse*10 + x%10;
            x = x/10;
        }
        return reverse;
    }
    
    // SECOND SOLUTION w/String and charAt loop
    public boolean isPalindrome2(int x) {
        String str = String.valueOf(x);
        int start = 0;
        int end = str.length() - 1;
        while(start < end){
            if(str.charAt(start++) != str.charAt(end--)) return false;
        }
        return true;
    }
    
    // THIRD SOLUTION w/StringBuilder
    public boolean isPalindrome3(int x){
        String str = String.valueOf(x);
        StringBuilder s = new StringBuilder(String.valueOf(x));
        return s == s.reverse();
    }
    
    
}