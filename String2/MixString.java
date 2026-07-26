public String mixString(String a, String b) {
  //Given two strings, a and b, create a bigger string made of the first char of a,
  //the first char of b, the second char of a, the second char of b, and so on. 
  //And leftover chars go at the end of the result. 
  
  //what if a length is shorter. um.. how about using StringBuilder?
  
  StringBuilder result = new StringBuilder();
  
  int index = 0;
  
  for(int i = 0; i < Math.min(a.length(), b.length()); i++){
    result.append(a.charAt(i)).append(b.charAt(i));
    index++;
  }
  
  String bigger = a;
  if(b.length() > a.length()){
    bigger = b;
  }
  
  result.append(bigger.substring(index));
  
  return result.toString();
}
