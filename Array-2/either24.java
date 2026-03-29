// Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.

public boolean either24(int[] nums) {
  //return true if
  //A 2 next to a 2
  //A 4 next to a 4
  
  //if 22 or 44 only 1 time appear it is true
  //else false;
  int count = 0;
  
  for(int i = 0; i < nums.length-1; i++){
    if ((nums[i] == 2 && nums[i+1] == 2) || nums[i] == 4 && nums[i+1] == 4){
      count++;
    }
  }
  if(count == 1) {
    return true;
  }
  
  return false;
}
