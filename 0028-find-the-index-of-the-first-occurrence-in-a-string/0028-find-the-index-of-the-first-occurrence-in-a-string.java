class Solution {
    public int strStr(String haystack, String needle) {
        int len = needle.length();
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < haystack.length() - len + 1; i++){
            map.put(haystack.substring(i,len+i), i);
            if(map.containsKey(needle))
                return map.get(needle);
            
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) 
            System.out.println(entry.getKey() + ":" + entry.getValue().toString());

        return -1;
    }
}