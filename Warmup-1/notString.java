public String notString(String str) {
  //Given a string, return a new string where "not" has been added to the front. 
  //However, if the string already begins with "not", return the stirng unchanged. 
  if(str.startsWith("not")){
    return str;
  }
  
  return "not " + str;
}
