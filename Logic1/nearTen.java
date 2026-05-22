/*
Given a non-negative number "num", return true if num is within 2 of a multiple of 10.
*/

public boolean nearTen(int num) {
  return (num + 2) % 10 == 0 || (num + 1) % 10 == 0 || (num - 2) % 10 == 0 || (num - 1) % 10 == 0 || num % 10 ==0;
  }

// the remainder has to be 0, 1, 2, 8, 9 
//so

public boolean nearTen(int num){
  int remainder = num % 10;
  return remainder <= 2 || remainder >= 8;
}
