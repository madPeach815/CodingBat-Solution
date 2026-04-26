/*
Return an array that contains exactly the same numbers as the given array, but rearranged so that every 3 is immediately followed by a 4. Do not move the 3's, but every other number may move. The array contains the same number of 3's and 4's, every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.*/

public int[] fix34(int[] nums) {
  //return an array that contains exactly the same numbers as the given array.
  //but rearranged so that every 3 is immediately followed by a 4. 
  //don't move 3's 
  
  int lastSwapIndex = 0;
  
  for(int i = 0; i < nums.length; i++){
   if(nums[i] == 3){
      for(int x = lastSwapIndex; x < nums.length; x++){
            if(nums[x] == 4){
              nums[x] = nums[i + 1];
              nums[i+1] = 4;
              lastSwapIndex = x;
              break;
        }
      }
    }
  }
  return nums;
}
