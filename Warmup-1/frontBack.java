public String frontBack(String str) {
  //Given a string, 
  //return a new string where the first and last chars have been exchanged.
  
  if(str.length() <= 1){
    return str;
  }
  return str.charAt(str.length()-1) + str.substring(1, str.length()-1) + str.charAt(0);
//In java, substring(start, end) stops before the end index. If the start index
//and end index are the same, it returns an empty string("");
}
