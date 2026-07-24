public String withoutX(String str) {
  //Given a string, if the first or last chars are 'x', return the string without
  //those 'x' chars, and otherwise return the string uncharged. 
  
  if(str.length() == 1){
    return str.equals("x") ? "" : str;
  }
  
  if(str.length() > 1){
  
  boolean firstX = str.charAt(0) == 'x';
  boolean lastX = str.charAt(str.length()-1) == 'x';
  
  if(firstX && lastX) {
    return str.substring(1, str.length()-1);
  }
  if(firstX) {
    return str.substring(1);
  }
  if(lastX) {
    return str.substring(0, str.length()-1);
  }
  }
  
  return str;
}
