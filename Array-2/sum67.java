public int sum67(int[] nums) {
  //return sum of the numbers in the array.
  //except: num[i] == 6 to num[i]==7
  //return 0 if there is not number in the array
  int sum = 0;
  boolean shouldIgnore = false;
  
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == 6){
      shouldIgnore = true;
      // if nums[i] is 6, shouldIgnore updated to be true. and i++
    } else if (shouldIgnore == true && nums[i] == 7){
      shouldIgnore = false;
      //if it is next element of nums[i]==6, shouldIgnore is ture and until nums[i] is 7,
      //shouldIgnore will be continuesly ture. and when nums[i] is 7, it becomes false.
    } else if (!shouldIgnore) { 
      sum += nums[i];
    }
  }
  return sum;
  }
  
 
