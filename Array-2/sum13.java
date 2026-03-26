public int sum13(int[] nums) {
  
  int sum = 0;
  
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == 13){
      i++;
      //when nums[i] is 13, i increase to next number. so we prevent printing out.
      // out of if statement we need to do i++ one more time. and it prevent 
      //printing out nums[i+1] when nums[i] is 13. 
      //if nums[i] is the last element, i++ make it stopping the loop.
    }else{
      sum += nums[i];
    }
  }
    return sum;
  }
