public boolean nearHundred(int n) {
  //Given an int n, return true if it is within 10 of 100 or 200. 
  //That means n has to be 90 to 110 or 190 to 210 
  return Math.abs(n - 100) <= 10 || Math.abs(n - 200) <= 10;
}
