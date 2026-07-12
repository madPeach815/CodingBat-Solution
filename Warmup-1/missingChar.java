public String missingChar(String str, int n) {
  //Given a non-empty string and an int n, return a new string where the char at
  //index n has been removed. The value of n will be a valid index of a char 
  //in the orginal string. 

  return str.substring(0, n) + str.substring(n + 1);
}
