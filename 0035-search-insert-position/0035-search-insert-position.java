class Solution {
    
    // O(logn)
    public int searchInsert(int[] nums, int target){
        
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
           int mid = left + (right-left) / 2;
           if(target < nums[mid]) right = mid - 1;
           else if(target > nums[mid]) left = mid + 1;
           else return mid;
        }
        return left; 
    }
    
    // O(n)
    public int searchInsert2(int[] nums, int target){
        int i;
        for(i = 0; i < nums.length; i++){
            if(nums[i] == target)    return i;
            if(nums[i] > target)    return i;
        }
        return i;
    }
}