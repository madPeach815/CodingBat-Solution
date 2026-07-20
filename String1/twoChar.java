public String twoChar(String str, int index) {
  //Given a string and an index, return a string length 2 starting at the given
  //index. If the index is too big or too small to define a string length 2, 
  //use the first 2 chars. The string length will be at least 2. 
  
//java has length 4 and index 3 is "a". and it cannot hold length 2. 
  //at least 4 length with index 2. works. 
  if(str.length() < index + 2 || index < 0){
    return str.substring(0, 2);
  }
  
  return str.substring(index, index + 2);
}
