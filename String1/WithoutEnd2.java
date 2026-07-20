public String withouEnd2(String str) {
  //Given a string, return a version without both the first and last char of the string.
  //The string may be any length, including 0.
  
  if(str == null || str.length() <= 1){
    return "";
  }
  
  return str.substring(1, str.length()-1);
}
