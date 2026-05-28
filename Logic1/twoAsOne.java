public boolean twoAsOne(int a, int b, int c) {
  //Given three ints, a b c, return true if it is possible to add two of the ints to get the third.

  if(a + b == c) { 
    return true;
  } else if (b + c == a) {
    return true;
  } else if (c + a == b) {
    return true;
  }
  
  return false;
}

//more simple version

public boolean twoAsOne(int a, int b, int c) {
 
 return a + b == c || b + c == a || c + a == b;
}
