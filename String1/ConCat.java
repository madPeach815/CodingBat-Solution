public String conCat(String a, String b) {
  //Given two strings, append them together (known as "concatenation") and 
  //return the result. However, if the concatenation creates a double-char, 
  //then omit one of the chars, so "abc" and "cat" yields "abcat".

if(a.isEmpty() || b.isEmpty()){
  return a + b;
}
 
if(a.endsWith(b.substring(0, 1))) {
  return a.substring(0, a.length()-1) + b;
}

return a + b;
}
