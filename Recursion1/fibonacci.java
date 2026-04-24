/*
The fibonacci sequence is a famous bit of mathematics, and it happens to have a recursive definition. The first two values in the sequence are 0 and 1 (essentially 2 base cases). Each subsequent value is the sum of the previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on. Define a recursive fibonacci(n) method that returns the nth fibonacci number, with n=0 representing the start of the sequence.
*/

public int fibonacci(int n) {
  //0 1 1 2 3 5 8 13 21....
  //when n = 0 it returns 0 
  //when n = 1 it returns 1 
  //when n = 2 it returns 1 because 0+1 = 1 
  
  if(n == 0){
    return 0;
  }
  if(n == 1){
    return 1;
  }
  return fibonacci(n-1) + fibonacci(n-2);
}
//fibonacci(3) -> 2 
//fibonacci(3) = fibonacci(2) + fibonacci(1)
//fibonacci(2) = fibonacci(1) + fibonacci(0)
//fibonacci(1) == 1 fibonacci(0) == 0
//so fibanacci(2) = 1+0
//so fibanacci(2) = 1
//and fibonacci(3) = 1 + 1 = 2
