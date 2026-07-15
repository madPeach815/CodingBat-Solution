public String stringSplosion(String str) {
  //Given a non-empty string like "Code"return a string like "CCoCodCode"
  
  StringBuilder result = new StringBuilder();
  for(int i = 0; i <= str.length(); i++){
    for(int x = 0; x < i; x++){
      result.append(str.charAt(x));
    }
  }
  
  return result.toString();
}
