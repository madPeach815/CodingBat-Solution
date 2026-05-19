/*
Given an array of positive ints, return a new array of length "count" containing the first even numbers from the original array. The original array will contain at least "count" even numbers.
*/

public int[] copyEvens(int[] nums, int count) {
  //positive int array.
  //make a new array. and it has count length. put even numbers.
  
  int[] evenCopy = new int[count];
  int idx = 0;

  for(int i = 0; i < nums.length; i++){
    if(idx == count){
      return evenCopy;
    }
    if(nums[i] % 2 == 0){
      evenCopy[idx++] = nums[i];
    }
  }
  return evenCopy;
}
