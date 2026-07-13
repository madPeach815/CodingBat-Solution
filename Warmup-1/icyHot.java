public boolean icyHot(int temp1, int temp2) {
  //Given two temperatures, return true if one is less than 0 and the other is 
  //grater than 100.
  
  return (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0);
}
