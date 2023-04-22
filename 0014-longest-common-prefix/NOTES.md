public int compareTwoStrings(String s1, String s2, int k){
int l1 = s1.length();
int l2 = s2.length();
int l = 0;
if(k == -2)     l = l1 > l2 ? l2 : l1;
else            l = k;
System.out.print(s1);
System.out.print("   -   ");
System.out.print(s2);
System.out.print("   -   ");
System.out.println(l);
int i = 0;
for(i = 0; i < l; i++){
if(s1.charAt(i) != s2.charAt(i)) break;
}
System.out.println("i-1: " + (i-1));
return i-1;
}
​
​
​
​
​
​
​
​
​