class Solution {
    // Runtime: 0 ms
    // Memory: 40.7 MB
    public int strStr2(String haystack, String needle) {
        int m = needle.length();
        int n = haystack.length();

        for (int windowStart = 0; windowStart <= n - m; windowStart++) {
            for (int i = 0; i < m; i++) {
                if (needle.charAt(i) != haystack.charAt(windowStart + i)) {
                    break;
                }
                if (i == m - 1) {
                    return windowStart;
                }
            }
        }

        return -1;
    }
    
    // Runtime: 16 ms
    // Memory: 42.4 MB
    public int strStr(String haystack, String needle) {
        int len = needle.length();
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < haystack.length() - len + 1; i++){
            map.put(haystack.substring(i,len+i), i);
            if(map.containsKey(needle))
                return map.get(needle);
            
        }
        return -1;
    }
    
    
}