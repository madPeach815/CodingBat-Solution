public String seeColor(String str) {
  //Given a string, if the string begins with "red" or "blue" return that color 
  //string, otherwise return the empty string.
  
  if(str.startsWith("red")){
    return "red";
  }else if (str.startsWith("blue")){
    return "blue";
  }
  return "";
}
