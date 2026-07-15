public boolean has271(int[] nums) {
  //Given an array of ints, return true if it contains a 2,7,1 pattern: a value, 
  //followed by the value plus 5, followed by the value minus 1. Additionally 
  //the 271 counts even if the "1" differs by 2 or less from the correct value. 
  
  for(int i = 0; i < nums.length-2; i++){
    int value = nums[i];
    if(nums[i+1] == value + 5){
      int target = value - 1; 
      if(nums[i+2] == target || Math.abs(nums[i+2] - target) <= 2){
        return true;
      }
      }
    }
  return false;
}
