public String withoutX2(String str) {
  //Given a string, if one or both of the first 2 chars is 'x', return the string 
  //without those 'x' chars, and otherwise return the string unchanged. This is
  //a little harder than it looks.
  
  StringBuilder newStr = new StringBuilder();
  
  
  for(int i = 0; i < str.length(); i++){
    if(i < 2 && str.charAt(i) == 'x'){
      continue;
    }
     newStr.append(str.charAt(i));
  }
  
  return newStr.toString();
}
