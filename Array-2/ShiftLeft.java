public int[] shiftLeft(int[] nums) {
  //Return an array that is "left shifted" by one -- 
  //so {6, 2, 5, 3} returns {2, 5, 3, 6}. You may modify and return the given array, 
  //or return a new array.
  
  int[] temp = new int[nums.length];
  
  if(nums.length > 1){
    for(int i = 0; i < nums.length-1; i++){
      temp[i] = nums[i+1];
      temp[nums.length-1] = nums[0];
    } 
  } else {
    return nums;
  }
  nums = temp;
  
  return nums;
}
