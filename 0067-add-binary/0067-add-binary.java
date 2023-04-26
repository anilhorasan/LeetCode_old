class Solution {

    public String addBinary(String a, String b) {
        
        // use mutable strings in reverse
        StringBuilder sb = new StringBuilder(); 
        
        //two pointers starting from the back
        int i = a.length() - 1, j = b.length() -1, carry = 0; 
        
        while (i >= 0 || j >= 0) {
            
            int sum = carry; // sum equals 0 or 1 (if there is a carry) 
            
            //we subtract '0' to get the int value of the char from the ascii
            if (j >= 0) sum += b.charAt(j--) - '0'; 
            if (i >= 0) sum += a.charAt(i--) - '0';
            
            sb.append(sum % 2); //if sum==2 or sum==0 append 0 cause 1+1=0
            carry = sum / 2;    //if sum==2 we have a carry, else no carry cuz 1/2=0
        }
        if (carry != 0) sb.append(carry); //leftover carry, add it
        return sb.reverse().toString();
    }


    public String addBinary2(String a, String b) {
        int lena = a.length();
        int lenb = b.length();

        String s = "";
        int carry = 0;
        char a1 = ' ';
        char b1 = ' ';
        for(int i = Math.max(lena, lenb)-1; i >= 0; i--){

            if(lena > 0 || lenb > 0){
                if (lena > 0 && lenb > 0){
                    a1 = a.charAt(lena-1);
                    b1 = b.charAt(lenb-1);
                    if(carry == 0){
                        if(a1 == b1 && a1 =='0') s = '0' + s;
                        else if(a1 == b1 && a1 =='1') {
                            s = '0' + s;
                            carry = 1;
                        }
                        else s = '1' + s;
                    }
                    else{
                        if(a1 == b1 && a1 =='0') {
                            s = '1' + s;
                            carry = 0;
                        }
                        else if(a1 == b1 && a1 =='1') s = '1' + s;
                        else s = '0' + s;
                    }
                    lena--;
                    lenb--;
                }
                else if (lena > 0){
                    a1 = a.charAt(lena-1);
                    if(a1 == '1' && carry == 0){
                        s = '1' + s;
                    }
                    else if(a1 == '1' && carry == 1){
                        s = '0' + s;
                        carry = 1;
                    }
                    else if(a1 == '0' && carry == 0){
                        s = '0' + s;
                    }
                    else if(a1 == '0' && carry == 1){
                        s = '1' + s;
                        carry = 0;
                    }
                    lena--;
                }
                else {
                    b1 = b.charAt(lenb-1);
                    if(b1 == '1' && carry == 0){
                        s = '1' + s;
                    }
                    else if(b1 == '1' && carry == 1){
                        s = '0' + s;
                        carry = 1;
                    }
                    else if(b1 == '0' && carry == 0){
                        s = '0' + s;
                    }
                    else if(b1 == '0' && carry == 1){
                        s = '1' + s;
                        carry = 0;
                    }
                    lenb--;
                }
            }
        }
        if (carry == 1) s = '1' + s;
        return s;
    }
}