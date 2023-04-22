class Solution {
    public int removeDuplicates(int[] nums){
        int left = 0;
        for(int right = 1; right < nums.length; right++){
            if(nums[right] != nums[left])    
                nums[++left] = nums[right];
        }
        return left+1;
    }
    
    public int removeDuplicates2(int[] nums)
    {
        int dupes = 0;
        for (int i = 1; i < nums.length; i++){
            if (nums[i] == nums[i - 1])   dupes++;
            nums[i - dupes] = nums[i];
        }
        return nums.length - dupes;
    }


    public int removeDuplicates3(int[] nums){
        int j = 1;
        for(int i = 1; i < nums.length; i++){
            if (nums[i] != nums[i-1]){
               nums[j] = nums[i];
               j++;
            }
        }
        return j;
    }

    public int removeDuplicates4(int[] nums) {
        int k = nums.length;
        if(k == 0) return -1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                System.out.println("k= " + k + " i: " + i);
                if(k > 0){
                    shift(nums, i, k-1);
                    k--;
                    i--;
                }
            }
        }
        return k;
    }

    public void shift(int[] input, int index, int end){
        int temp = input[index];
        for(int i = index; i < end; i++)
            input[index] = input[index+1];
        input[end] = temp;
        printArray(input);
    }
    public void printArray(int[] input){
    for(int i=0;i<input.length;i++)    
        System.out.print(input[i] + " ");
        System.out.println();    
    }

}


