/*Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.*/

public int diff21(int n) {
  //|21 - n|, if n is begger than 21 double.
  
  if(n > 21){
    return 2 * Math.abs(21 - n);
  }
  
  return Math.abs(21 - n);
}
