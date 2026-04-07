//Return true if the array contains, somewhere, 
//three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.

public boolean tripleUp(int[] nums) {
  //if nums.length < 3 false
  //have to check nums[i], nums[i+1], nums[i+2] 
  //for loops should stop before i < nums.length - 2 
  //if number is nums[i]'s value. nums[i+1] == number + 1 nums[i+2] == number + 2

  if (nums.length < 3){
    return false;
  }
  
  for(int i = 0; i < nums.length -2; i++){
    if(nums[i+1] == nums[i] + 1 && nums[i+2] == nums[i] + 2){
      return true;
    }
  }
  return false;
}

