/*
Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, are extra lucky. So if either value is a teen, just return 19.
*/

public int teenSum(int a, int b) {
  //return their sum.
  //but 13-19 return 19..
  
  if((a >= 13 && a <= 19) || (b >= 13 && b <= 19)){
    return 19;
  }
  return a + b;
}

//or using helper method.

public int teenSum(int a, int b) {
  if(isTeen(a) || isTeen(b)){
    return 19;
  }
  return a+b;
}

private boolean isTeen(int val){
 return val >= 13 && val <= 19;
}
