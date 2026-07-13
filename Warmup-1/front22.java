public String front22(String str) {
  //Given a string, take the first 2 chars and return the string with the 2 chars
  //added at both the front and back, so "kitten" yields "kikittenki".
  //If the string length is less than 2, use whatever chars are there. 
  
String front = str.substring(0, Math.min(str.length(), 2));

return front + str + front; 
}
