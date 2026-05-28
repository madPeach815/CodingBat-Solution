/*
Given three ints, a b c, return true if b is greater than a, and c is greater than b. However, with the exception that if "bOk" is true, b does not need to be greater than a.
*/

public boolean inOrder(int a, int b, int c, boolean bOk) {
  return (a < b && b < c) || (bOk && a >= b && b < c); 
}


//c is alwasy bigger than b.
//when it is bOk, a and b doesn't matter.
//if it is not bOk, a must be smaller than b

public boolean inOrder(int a, int b, int c, boolean bOk){
  return b < c && (bOk || a < b);
}
