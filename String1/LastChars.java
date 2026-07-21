public String lastChars(String a, String b) {
  //Given 2 strings, a and b, return a new string made of the first char of a
  //and the last char aof b, so "yo" and "java" yields "ya". If either string is
  //length 0, use '@' for its missing char. 
  String front = (a.length() == 0) ? "@" : a.substring(0, 1); 
  String end = (b.length() == 0) ? "@" : b.substring(b.length()-1);
  
  return front + end;
}
