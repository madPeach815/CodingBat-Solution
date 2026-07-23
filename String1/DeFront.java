public String deFront(String str) {    
  //Given a string, return a version without the first 2 chars. Except keep the
  //first char if it is 'a' and kee p the second char if it is 'b'. 
  //The string may be any length. Harder than it looks.

StringBuilder result = new StringBuilder();

  if(str.length() > 0 && str.charAt(0) == 'a'){
    result.append("a");
  }
  if(str.length() > 1 && str.charAt(1) == 'b'){
    result.append("b");
  }
  if(str.length() > 2){
    result.append(str.substring(2));
  }
  
  return result.toString();
}
