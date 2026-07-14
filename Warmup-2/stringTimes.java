public String stringTimes(String str, int n) {
  //Given a string and a non-negative int n, return a larger string that 
  //is n copies of the original string. 
  StringBuilder result = new StringBuilder();
  
  for(int i = 0; i < n; i++){
    result.append(str);
  }
  return result.toString();
}
