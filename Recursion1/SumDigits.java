/*
Given a non-negative int n, return the sum of its digits recursively (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
*/

public int sumDigits(int n) {
  //n is 0 and positive integer. 
  //sum of its digits. 
  //if n % 10 they give rightmost digit..
  //if n / 10 they remove rightmost digit.
  //if n = 126. we need 6 + 2 + 1
  //so we need to n % 10 + sumDigits(n/10)
  
  if(n == 0){
    return 0;
  }
  return (n % 10) + sumDigits(n / 10);
}
