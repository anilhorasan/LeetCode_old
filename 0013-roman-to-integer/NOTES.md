int result = romans.get(s.charAt(s.length()-1));
Character prev = s.charAt(0);
Integer first = 0;
Integer second = 0;
for(int i = 1; i < s.length(); i++){
first = romans.get(s.charAt(i-1));
second = romans.get(s.charAt(i));
if (first < second)     result -= first;
else                    result += first;
}
return result;
}
}
​
​
​
​
public int romanToInt(String s) {
Map<Character, Integer> romans = new HashMap<>();
romans.put('I',1);
romans.put('V', 5);
romans.put('X', 10);
romans.put('L', 50);
romans.put('C', 100);
romans.put('D', 500);
romans.put('M', 1000);
int result = romans.get(s.charAt(s.length()-1));
Character prev = s.charAt(0);
Integer first = 0;
Integer second = 0;
for(int i = 1; i < s.length(); i++){
first = romans.get(s.charAt(i-1));
second = romans.get(s.charAt(i));
if (first < second)     result -= first;
else                    result += first;
}
return result;
}