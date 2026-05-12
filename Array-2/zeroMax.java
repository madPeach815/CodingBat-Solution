/*
Return a version of the given array where each zero value in the array is replaced by the largest odd value to the right of the zero in the array. If there is no odd value to the right of the zero, leave the zero as a zero.
*/

public int[] zeroMax(int[] nums) {
  
//nums value == 0 we find largest odd from right side and replace. 
//nums value != 0 and even. we keep that.

for(int i = 0; i < nums.length; i++){
  int largest = 0;
  if(nums[i] == 0) {
    for(int x = i; x < nums.length; x++){
      if(nums[x] % 2 == 1 && nums[x] > largest){
        largest = nums[x];
      }
      }
      nums[i] = largest;
    }
  }
  return nums;
}
  
