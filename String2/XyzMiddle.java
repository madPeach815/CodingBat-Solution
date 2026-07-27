public boolean xyzMiddle(String str) {
  //Given a string, does "xyz" appear in the middle of the string? To define middle,
  //we'll say that the number of chars to the left and right of the "xyz" must
  //differ by at most one. This problem is harder than it looks. 
  
  if(str.length() < 3){
    return false;
  }
  //abcedf even number y has to be c or e 6/2 3. c is index 2 or index 3. 
  //which mean length / 2 or length / 2 - 1
  //abced y has to be c. which mean length / 2 
  
  int mid = str.length() / 2;
  
  if(str.length() % 2 == 1){
    return str.substring(mid-1, mid+2).equals("xyz");
  }
else {
    return str.substring(mid-1, mid+2).equals("xyz") ||
    str.substring(mid-2, mid+1).equals("xyz");
}
}
