public boolean less20(int n) {
  
/*
  Return true if the given non-negative number is 1 or 2 less than a multiple of 20. 
  So for example 38 and 39 return true, but 40 returns false.
*/
  
  
 return n % 20 == 18 || n % 20 == 19;
}


//or other way.

public boolean less20(int n) {
  
  return (n + 1) % 20 == 0 || (n + 2) % 20 == 0;
}
