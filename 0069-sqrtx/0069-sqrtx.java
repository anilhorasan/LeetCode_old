class Solution {
    public int mySqrt3(int x) {
        if (x == 0 || x == 1) return x;
        int left = 0;
        int right = x;
        int mid = 0;
        while (left <= right){
            mid = left + (right - left) / 2;
            if(mid  < x / mid)      left  = mid + 1;
            else if(mid > x / mid)  right = mid - 1;
            else                    return  mid;
        }
        return right;
    }

    // Newton's formula
    public int mySqrt2(int x) {
        long r = x;
        while (r*r > x)
            r = (r + x/r) / 2;
        return (int) r;
    }
    
    // teest case: 2147395599
    
    
    // simplest solution
    public int mySqrt(int x){
        
        int result = 1;
        while (result <= x / result)   result++;
        return result-1;
    }
    
}