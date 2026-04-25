public int powerN(int base, int n) {
  //Given base and n that are both 1 or more, compute recursively (no loops) 
  //the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

  //(3, 1) = 3^1 = 3*1
  //(3, 2) = 3^2 = 3*3
  //(3, 3) = 3^3 = 3*3*3
  //(3, 4) = 3^4 = 3*3*3*3
  
  if(n == 1){
    return base;
  }
  
  return base * powerN(base, n-1);
  
}
