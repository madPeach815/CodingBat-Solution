public String lastTwo(String str) {
  //Given a string of any length, return a new string where the last 2 chars, 
  //if present, are swapped, so "coding" yields "codign".
  
  if(str.length() >= 2) {
    int len = str.length();
    return str.substring(0, len-2) + str.charAt(len-1) + str.charAt(len-2);
  }
  
  return str;
}
