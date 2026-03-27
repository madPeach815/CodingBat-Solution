public boolean has22(int[] nums) {
  //nums : array of int. 
  // true if the array contains a 2 next to a 2.
  for(int i = 0; i < nums.length; i++){
    if(i < nums.length-1){
    if (nums[i]==2 && nums[i+1]==2){
      return true;
    }
    }
  }
return false;
}
