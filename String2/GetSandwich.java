public String getSandwich(String str) {
  //A sandwich is two pieces of bread with something in between. Return the string
  //that is between the first and last appearance of "bread" in the given string,
  //or return the empty string "" if there are not two pieces of bread. 
  
  //find first piece of bread and last piece of bread. 
  
  int firstIdx = str.indexOf("bread");
  int lastIdx = str.lastIndexOf("bread");
  
  if(firstIdx < lastIdx){
  return str.substring(firstIdx + 5, lastIdx);
  }

  return "";
}
