public String altPairs(String str) {
  //Given a string, return a string made of the chars at indexes 0, 1, 4, 5, 8, 9...
  //so "kittens" yields "kien".
  
  StringBuilder result = new StringBuilder();
 
  for(int i = 0; i < str.length(); i += 4){
    result.append(str.charAt(i));
    if(i + 1 < str.length()){
      result.append(str.charAt(i+1));
    }  
  }
  return result.toString();
}
