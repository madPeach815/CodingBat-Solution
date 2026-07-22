public boolean frontAgain(String str) {
  //Given a string, return true if the first 2 chars in the string also appear
  //at the end of the string, such as with "edited"
  
  //You always think about StringIndexOutBoundsException.
  if(str.length() < 2){
    return false;
  }
  
 return str.startsWith(str.substring(str.length()-2, str.length()));
}
