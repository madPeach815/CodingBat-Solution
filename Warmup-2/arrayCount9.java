public int arrayCount9(int[] nums) {
  //Given an array of ints, return the number of 9's in the array.
  int count9 = 0;
  
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == 9){
      count9++;
    }
  }
  return count9;
}


//or I can used For-Each Loop
public int arrayCount9(int[] nums) {
  //Given an array of ints, return the number of 9's in the array.
  int count9 = 0;
  
  for(int num : nums){
    if(num == 9){
      count9++;
    }
  }
    return count9;
  }
