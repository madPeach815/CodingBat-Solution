public String stringX(String str) {
  //Given a string, return a version where all the "x" have been removed. 
  //Except an "x" at the very start or end should not be removed.
  
  StringBuilder result = new StringBuilder();
 
  for(int i = 0; i < str.length(); i++){
    char c = str.charAt(i);
    if(c != 'x' || i == 0 || i == str.length()-1){
      result.append(c);
    }
  } 
  return result.toString();
}
