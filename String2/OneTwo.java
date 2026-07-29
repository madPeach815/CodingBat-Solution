public String oneTwo(String str) {
  //Given a string, compute a new string by moving the first char to come after 
  //the next two chars, so "abc" yields "bca". Repeat this process for each 
  //subsequent group of 3 chars, so "abcdef" yields "bcaefd". 
  //Ignore any group of fewer than 3 chars at the end. 
  
  //Question:
  //If str.length() < 3 .. ignore? that means just return str or return ""?
  //if there are 8 or 7 length string. 3, 3, 2 / 3, 3, 1/ the lest of 2 and 1 
  //will be just as it is? no delete. 
  
  if(str.length() < 3){
    return "";
  }
  
  StringBuilder result = new StringBuilder();
  
  //abcedf i+1 which is b append first. then i+2 append second then i append last
  //avoiding append b again. i+3. we range str.length()-2 so i+2 works okay. 
  for(int i = 0; i < str.length()-2; i += 3){
    result.append(str.charAt(i+1));
    result.append(str.charAt(i+2));
    result.append(str.charAt(i));
  }
  
  return result.toString();
}
