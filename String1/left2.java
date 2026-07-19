public String left2(String str) {
  //Given a string, return a "rotated left 2" version where the first 2 chars are
  //moved to the end. 

  return str.substring(2, str.length()) + str.substring(0, 2);
}
