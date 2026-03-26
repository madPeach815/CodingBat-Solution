//Return the number of even ints in the given array. 
//Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.

public class JavaPractice{
public int countEvens(int[] nums) {
  //int : how many even numbers are there.if num % 2 ==0; it is even.
  int evenNum = 0;
  
  for(int i = 0; i < nums.length; i++){
    if (nums[i] % 2 == 0){
      evenNum++;
    }
  }
  return evenNum;
}
}
