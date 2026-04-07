/* Return true if the group of N numbers at the start and end of the array are the same. 
For example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2, 
and false for n=1 and n=3. You may assume that n is in the range 0..nums.length inclusive.*/

public boolean sameEnds(int[] nums, int len) {
  
  //from nums array.. len is the how many you should compare. 
  //if len is 0, you compare, nothing.
  //if len is 1, you compare, nums[0] : nums[nums.length]
  //if len is 2, you compare, nums[0 to 1] : nums[nums.length-1 to nums.length]
  //if len is 3, you compare, nums[0 to 2] : nums[nums.length-2 to nums.length]
  //for comparing index (e.g index 0:4, 1:5, 2:6) we need new int for count down. 
  //(len - newLen(2)) : (nums.length - newLen(2))
  //newLen--;
  //(len - newLen(1)) : (nums.length - newlen(1)

boolean isSame = false;
int newLen = len;
while(newLen > 0){
  if(nums[len - newLen] == nums[nums.length - newLen]){ 
    isSame = true;
  } else {
    return false;
  }
  newLen--;
}
return true;
}

