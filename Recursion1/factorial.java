public int factorial(int n) {
  //Return the factorial of n, which is n * (n-1) * (n-2) ... 1.
  //Compute the result recursively (without loops).
  //factorial of 0 is 1. 
  if(n == 0 || n == 1){
    return 1;
  }
  return n * factorial(n-1);
  //if n = 4 the answer have to be 4*3*2*1 when it get 1 it will return 1.. 
  //and n = 4. and * factorial(4-1); 
  //and n = 3 and * factorial(3-1);
  //and n = 2 and * factorial (2-1);
  //and n = 1 return 1. 
}
