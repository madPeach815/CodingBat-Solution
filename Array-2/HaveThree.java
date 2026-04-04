public boolean haveThree(int[] nums) {
  //Given an array of ints, return true if the value 3 appears in the array exactly 3 times, 
  //and no 3's are next to each other.

  //first, count is this array has 3, 3times.
  //if 3 is not 3 times. return false
  //if it has 3, 3times, now check if next nums[i] == 3 has another 3.

  int count = 0;
  
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == 3) {
      count++;
    }
  }
  if(count != 3){
    return false;
  } else {
    for (int x = 0; x < nums.length - 1 ; x++) {
      if (nums[x] == 3 && nums[x+1] == 3) {
        return false;
      }
    }
  }
  return true;
  
}
