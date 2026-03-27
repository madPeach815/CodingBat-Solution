public boolean no14(int[] nums) {
  
 // if there are 1's and 4's both.. : false
 // if there are only 1's : true;
 // if there are only 4's : true;
 // if there are no 1's and no 4's : true;
int count1 = 0;
int count4 = 0;

  for(int i = 0; i < nums.length; i++){
    if(nums[i] == 1) {
      count1++;
    }
    if(nums[i] == 4) {
      count4++;
    }
    }
    if(count1 > 0 && count4 > 0){
      return false;
    }
    return true;
  }
 
