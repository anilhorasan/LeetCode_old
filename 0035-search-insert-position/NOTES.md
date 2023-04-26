class Solution {
public int searchInsert(int[] nums, int target) {
int low = 0;
int high = nums.length - 1;
while(low <= high) {
int mid = low + (high-low) / 2;
if(target < nums[mid]) high = mid - 1;
if(target == nums[mid]) return mid;
if(target > nums[mid]) low = mid + 1;
}
return low;
}
}
​
​
ANOTHERRR
class Solution {
public int searchInsert(int[] nums, int target) {
for(int i = 0; i < nums.length; i++){
if(nums[i] >= target)        return i;
else if(i == nums.length -1) return i+1;
}
return 0;
}
}
​
public int searchInsert(int[] nums, int target) {
int left = 0;
int right = nums.length - 1;
​
while(left <= right){
int mid = left + (right -left) / 2;
if(target < nums[mid]) right = mid - 1;
else if(target > nums[mid]) left = mid + 1;
else return mid;
}
return left;
}