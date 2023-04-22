class Solution {
    // Solution with map & stack
    public boolean isValid2(String s) {
        
        Map<Character, Character> map = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        
        
        for(int i = 0; i < s.length(); i++){
            Character c = s.charAt(i);
            if(map.containsKey(c)) {
                stack.push(c);
                continue;
            }
            if(map.containsValue(c)){
                if(map.get(stack.peek()) != c) return false;
                else stack.pop();
            }
            
        }
        if(stack.empty()) return true;
        return false;
        
    }
    
    // Solution with only stack
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            Character c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }
            else {
                if(!stack.isEmpty() && c == ')' && stack.peek() == '(') stack.pop();
                else if(!stack.isEmpty() && c == ']' && stack.peek() == '[') stack.pop();
                else if(!stack.isEmpty() && c == '}' && stack.peek() == '{') stack.pop();	
                else	return false;	
            }
        }
        if(stack.isEmpty()) return true;
        return false;
    }
}