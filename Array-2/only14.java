//Given an array of ints, return true if every element is a 1 or a 4.

public boolean only14(int[] nums) {
 boolean flag = true;
  //Given an array of ints, return true if every element is a 1 or a 4.
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == 1 || nums[i] == 4) {
      flag = true;
      //if nums[i] is not 1 or 4, get out of the loop
    } else {
      flag = false;
      i = nums.length; 
    }
  }
  return flag;
}
