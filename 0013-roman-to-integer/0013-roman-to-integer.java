
class Solution {
    public int romanToInt(String s){
        
        Map<Character, Integer> map = new HashMap<>();
        
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        Integer first = 0;
        Integer second = 0;
        
        int result = 0;
        if(s.length() == 1) result = map.get(s.charAt(0));
        for(int i = 1; i < s.length(); i++){
            first = map.get(s.charAt(i-1));
            second = map.get(s.charAt(i));
            if(first < second)     result -= first;  
            else                    result += first;
        }
        return result + second;
        
    }
    
}