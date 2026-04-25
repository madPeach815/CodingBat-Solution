/*
Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.
*/

public int sortaSum(int a, int b) {
  //sums in (10-19) inclusive no!no!
  //return 20
  
  int sum = 0;
  if(a + b >= 10 && a + b <= 19){
    return 20;
  }
  
  return a + b;
}
