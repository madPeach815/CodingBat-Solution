public int countHi(String str) {
  //Given a string, compute recursively (no loops) the number of times lowercase 
  //"hi" appears in the string.
  int count = 0;
  if(str.length() < 2){
    //we need to find 2 letters, if the length is less than 2. it should return 0. 
    return 0;
  }
  
  if(str.charAt(0)=='h' && str.charAt(1)=='i'){
    count += 1;
  }
  return count + countHi(str.substring(1));
}
