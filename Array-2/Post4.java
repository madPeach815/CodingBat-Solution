//Given a non-empty array of ints, return a new array containing the elements from the original array that come after the last 4 in the original //array. The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.

public int[] post4(int[] nums) {
  
  //make a new array.
  //we need to know size first.
  //when there is 4, we can start count after. 
  //but if we found another 4.. count should reset 0. 
  //so we can start with resetting anytime we found 4. 
 
 int foundIdx = 0;
 for(int i = 0; i < nums.length; i++){
   if(nums[i] == 4){
     foundIdx = i;
   }
 }

 int count = 0;
 for(int i = foundIdx + 1; i < nums.length; i++){
   count++;
 }

  int[] newNums = new int[count];
  int newIdx = 0;
  for(int i = foundIdx + 1; i < nums.length; i++){
    newNums[newIdx] = nums[i];
    newIdx++;
  }
  
  
 return newNums;
}
