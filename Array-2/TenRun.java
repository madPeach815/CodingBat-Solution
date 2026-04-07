//For each multiple of 10 in the given array, change all the values following it to be that multiple of 10, 
//until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.

public int[] tenRun(int[] nums) {

  //how can I do... with all multiple of 10's... 
  //divide? mod? yes mod..
  for(int i = 0; i < nums.length-1; i++) {

    if(nums[i] % 10 != 0){
    } 
    if(nums[i] % 10 == 0) {
      if(nums[i+1] % 10 != 0){
        nums[i+1] = nums[i];
      }
    }
    }
  return nums;
}
