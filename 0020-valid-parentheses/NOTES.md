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
else  return false;
}
}
if(stack.isEmpty()) return true;
return false;