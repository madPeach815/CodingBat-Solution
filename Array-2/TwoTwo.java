//Given an array of ints, return true if every 2 that appears in the array is next to another 2.

public boolean twoTwo(int[] nums) {
  //find lonely 2. 
  //check if there is 2. if there is check if 2's left is not 2 and if 2's right is not 2.
  //if it is, it false.
  for (int i = 0; i < nums.length; i++){
    if(nums[i] == 2){
        boolean hasLeft = false;
        boolean hasRight = false;
        if(i > 0 && nums[i-1] == 2){
          hasLeft = true;
        }
        if(i < nums.length-1 && nums[i+1] == 2) {
          hasRight = true;
        }
        if(!hasLeft && !hasRight){
          return false;
        }
    }
  }
  return true;
}
