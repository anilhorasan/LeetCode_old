public int removeDuplicates4(int[] nums)
{
int dupes = 0;
for (int i = 1; i < nums.length; i++)
{
if (nums[i] == nums[i - 1])
dupes++;
nums[i - dupes] = nums[i];
}
return nums.length - dupes;
}
​
​
public int removeDuplicates(int[] nums){
int j = 1;
for(int i = 1; i < nums.length; i++){
if (nums[i] != nums[i-1]){
nums[j] = nums[i];
j++;
}
}
return j;
}
​
public int removeDuplicates2(int[] nums) {
int k = nums.length;
if(k == 0) return -1;
for(int i = 1; i < nums.length; i++){
if(nums[i] == nums[i-1]){
System.out.println("k= " + k + " i: " + i);