/*
Consider the leftmost and righmost appearances of some value in an array. We'll say that the "span" is the number of elements between the two inclusive. A single value has a span of 1. Returns the largest span found in the given array. (Efficiency is not a priority.)
*/

public int maxSpan(int[] nums) {
 
//span is how long you spread.. 
//span = last index - first index + 1
//2D loop. outter int i (0 - lenth)
// inner int x (newIdx - length) newIdx start 1. and ++
//when i == x span = x - i + 1
//maxSpan = 0
//if span > maxSpan
//maxSpan = span; 

int maxSpan = 1;
//if there is 1 number the span is 1. 
if(nums.length == 0){
  return 0;
}
// if there is not number, return 0.

for(int i = 0; i < nums.length; i++){
  for(int x = nums.length-1; x >= i; x--){
    if(nums[i] == nums[x]){
      int span = x - i + 1;
      if(span > maxSpan){
         maxSpan = span;
         break;
        }
    }
  }
}

return maxSpan;
}
