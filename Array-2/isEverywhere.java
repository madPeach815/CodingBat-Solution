
//We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array, 
//at least one of the pair is that value. Return true if the given value is everywhere in the array.

public boolean isEverywhere(int[] nums, int val) {
int countTrue = 0;
//nums[i] or nums [i+1] have to be val 

  for(int i = 0; i < nums.length-1; i++){
    if(nums[i] == val || nums[i+1] == val){
      countTrue++;
    }
  }
  if(countTrue >= nums.length-1){
    return true;
  }
  return false;
}

//num[i]  num[i+1]
//if one of them is val, true. 
//if both are val, true
//if both are not val. it is false. 
//This one looks much simpler. 


/*public boolean isEverywhere(int[] nums, int val) {
  for (int i = 0; i < nums.length - 1; i++) {
    if (nums[i] != val && nums[i+1] != val) {
      return false;
    }
  }
  return true;
} */
