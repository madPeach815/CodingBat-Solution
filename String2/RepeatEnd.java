public String repeatEnd(String str, int n) {
  //Given a string and an int n, return a string made of n repetitions of the last
  //n characters of the string. You may assume that n is between 0 and the length
  //of the string, inclusive. 
  
  if(n == 0){
    return "";
  }
  //Hello Hello's length is 5. and n = 3. index (5-3)
  //ABCEDFG length is 7 and if n = 3 7-3 = 4 charAt(4) = D 
  //if n = 2 7-2=5 charAt(5) = F
  //str.substring(str.length() - n)  n times
  
  StringBuilder result = new StringBuilder();
  for(int i = 0; i < n; i++){
    result.append(str.substring(str.length() - n));
  }
  
  return result.toString();
}
