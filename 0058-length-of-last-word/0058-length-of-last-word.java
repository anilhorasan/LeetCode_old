class Solution {
    
    public int lengthOfLastWord(String s) {
        int len = s.length();
        int count = 0;
        for(int i = len-1; i >= 0; i--){
            if(s.charAt(i) != ' ')      count++;
            else{                       if(count > 0) return count;}
        }
        return count;
    }
    
    
    public int lengthOfLastWord2(String s){
        
        int len = s.length();
        char c = s.charAt(len-1);
        
        while(c == ' '){
            len -= 1;
            c = s.charAt(len-1);
        }
        int result = 0;
        while(c != ' ' && len > 0){
            len -= 1;
            c = s.charAt(len);
            result++;
        }
        if(c == ' ') result--;
        
        return result;
    
    }
}