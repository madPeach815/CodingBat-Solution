//Given an array of ints, return true if the array contains two 7's next to each other, 
//or there are two 7's separated by one element, such as with {7, 1, 7}.

public boolean has77(int[] nums) {
  //two 7's each other : true;
  //one 7 one otherNumber one 7 : true;
  //else all false;
  
  for(int i = 0; i < nums.length; i++){
    if (i < nums.length-1 && nums[i] == 7 && nums[i+1] == 7) {
      return true;
    } else if (i < nums.length-2 && nums[i] == 7 && nums[i+2] == 7) {
      return true;
  } 
}
 return false;
}
