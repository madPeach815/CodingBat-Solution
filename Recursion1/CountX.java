public int countX(String str) {
  //Given a string, compute recursively (no loops) the number of lowercase 'x' 
  //chars in the string.
  
  int count = 0;
  
  if(str.length() < 1){
    return 0;
  }
  
  if(str.charAt(0) == 'x'){
    count += 1;
  } 
  
  return count + countX(str.substring(1)); 
}
