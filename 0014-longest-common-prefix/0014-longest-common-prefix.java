class Solution {
    
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
          return "";

        for (int i = 0; i < strs[0].length(); ++i)
          for (int j = 1; j < strs.length; ++j)
            if (i == strs[j].length() || strs[j].charAt(i) != strs[0].charAt(i))
              return strs[0].substring(0, i);

        return strs[0];
    }
    
    public String longestCommonPrefix2(String[] strs) {
        String result = "";
        
        boolean br = false;
        
        if(strs.length == 1) return strs[0];
        
        int i = 0;
        for(i = 0; i < strs[0].length(); i++){
            char c = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++){
                if(i == strs[j].length() || c != strs[j].charAt(i)){
                    br = true;
                    break;
                }
            }
            if(br) break;
        }
        
        result = strs[0].substring(0,i);
            
        return result;
    }
    
    
    public String longestCommonPrefix3(String[] strs) {
        int len = strs.length;
        if (len == 0){
            return "";
        }
        String prefix = strs[0];
        int longest_prefix = prefix.length();
        
        for(int i = 1; i < len; i++){
            int prefix_len = 0;
            for (int j = 0; j < strs[i].length(); j++){
                if(j >= longest_prefix) break;
                if (prefix.charAt(j) == strs[i].charAt(j)){
                    prefix_len++;
                }
                else break;
                
            }
            longest_prefix = prefix_len;
            prefix = strs[0].substring(0,longest_prefix);
        }
        return prefix;
    }
    
    public String longestCommonPrefix4(String[] strs) {
    int len = strs.length;
        int commons = -3;
        String longest = "";
        for(int i = 0; i < len - 1; i++){
            commons = compareTwoStrings(strs[i], strs[i+1], commons+1);
            if(commons == -1) return "";
        }
        System.out.println("commons: " + commons);
        longest = strs[0].substring(0,commons+1);
        return longest;
        
    }
    
    public int compareTwoStrings(String s1, String s2, int k){
        int l1 = s1.length();
        int l2 = s2.length();
        int l = 0;
        if(k == -2)     l = l1 > l2 ? l2 : l1;
        else            l = k;
        System.out.print(s1);
        System.out.print("   -   ");
        System.out.print(s2);
        System.out.print("   -   ");
        System.out.println(l);
        int i = 0;
        for(i = 0; i < l; i++){
            if(s1.charAt(i) != s2.charAt(i)) break;
        }
        System.out.println("i-1: " + (i-1));
        return i-1;
    }
    
}


