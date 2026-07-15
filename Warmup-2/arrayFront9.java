public boolean arrayFront9(int[] nums) {
  //Given an array of ints, return true if one of the first 4 elements in the 
  //array is a 9. The array length may be less than 4. 
  
  int end = Math.min(nums.length, 4);
 
    for(int i = 0; i < end; i++){
      if(nums[i] == 9){
        return true;
      }
    }
  
  return false;
}
