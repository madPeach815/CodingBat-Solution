public String middleThree(String str) {
  //Given a string of odd length, return the string length 3 from its middle, 
  //so "Candy" yields "and".
  //The string length will be at least 3. 
  
  //"Candy" length 5. 5/2 = 2 index(2) = n so we need (length/2 - 1 to length/2 + 1)

  return str.substring((str.length()/2) - 1, (str.length()/2) + 2);  
}
