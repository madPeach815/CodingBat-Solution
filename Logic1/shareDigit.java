/*
Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, such as the 2 in 12 and 23. (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)
*/

public boolean shareDigit(int a, int b) {
  int firstN = a / 10;
  int secondN = a % 10;
  int firstN2 = b / 10;
  int secondN2 = b % 10;
  
  return firstN == firstN2 || firstN == secondN2 || secondN == firstN2 || secondN == secondN2;
}
