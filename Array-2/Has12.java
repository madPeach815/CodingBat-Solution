//Given an array of ints, return true if there is a 1 in the array 
//with a 2 somewhere later in the array.

public boolean has12(int[] nums) {
  for(int i = 0; i < nums.length; i++){
    
    if(nums[i] == 1){
      for(int x = i + 1; x < nums.length; x++){
        if(nums[x] == 2){
          return true;
        }
      }
    }
  }
  return false;
}
