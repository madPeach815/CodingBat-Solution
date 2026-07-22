public String minCat(String a, String b) {
//Given two strings, append them together (known as "concatenation") and return
//the result. However, if the strings are different lengths, omit chars from the
//longer string so it is the same length as the shorter string. 
//So "Hello" and "Hi" yield "loHi". The strings may be any length. 


if(a != null && b != null){
if(a.length() >= b.length()){
  //Hello length is 5, Hi length is 2. 5-2 = 3. index 3 is second l. and 
  //hello length is 5. so it will end index 4. which is o. 
  return a.substring(a.length()-b.length(), a.length()) + b;
} else {
  return a + b.substring(b.length()-a.length(), b.length());
}
}
return a + b;
}

