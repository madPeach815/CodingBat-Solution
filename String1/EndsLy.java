public boolean endsLy(String str) {
  //Given a string, return true if it ends in "ly"
  
  if(str.length() < 2){
    return false; 
  }
  //if there is a string "ab" length is 2. length-2 index 0, substring(0, 2)
  //so it works. 
  
  if(str.substring(str.length()-2, str.length()).equals("ly")){
    return true;
  }
  return false;
}

//or we can do

public boolean endsLy(String str) {
  //Given a string, return true if it ends in "ly"
  
  return str.endsWith("ly");
}

