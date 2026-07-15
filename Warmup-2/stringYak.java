public String stringYak(String str) {
  //Suppose the string "yak" is unlucky. Given a string, return a version where
  //all the "yak" are removed, but the "a" can be any char. The "yak" strings 
  //will not overlap.
  StringBuilder result = new StringBuilder();
 
  for(int i = 0; i < str.length(); i++){
    if(str.startsWith("yak", i)){
      i += 2;
    }else {
      result.append(str.charAt(i));
    }  
  }
 return result.toString();
}
