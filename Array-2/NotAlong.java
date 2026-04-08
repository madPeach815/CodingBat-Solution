//We'll say that an element in an array is "alone" if there are values before and after it, 
//and those values are different from it. Return a version of the given array 
//where every instance of the given value which is alone is replaced by whichever value to its left or right is larger.

public int[] notAlone(int[] nums, int val) {
  //if there are values before and after, the val get larger one. 
  
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == val && i != 0 && i != nums.length-1 && nums[i] != nums[i-1] && nums[i] != nums[i+1]){
  
      /* first time I tried like that.
      if(nums[i+1] < nums[i-1]){
        nums[i] = nums[i-1];
      }else {
        nums[i] = nums[i+1];
      }
    }
  }*/
      
    nums[i] = Math.max(nums[i-1], nums[i+1]);
      //this way is way simpler.
    }
  }
  return nums;
}
