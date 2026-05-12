/*
Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to the end of the string.
*/

public String endX(String str) {
  //newString all the lowercase 'x' chars moved to the end of the string.

  if(str.length() == 0){
    return "";
  }
  
  if(str.charAt(0) != 'x'){
    return str.charAt(0) + endX(str.substring(1));
  } 
  return endX(str.substring(1)) + "x";
}
