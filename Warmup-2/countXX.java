int countXX(String str) {
  //Count the number of "xx" in the given string. We'll say that overlapping is 
  //allowed, so "xxx" contains 2 "xx".
  int count = 0;
  for(int i = 0; i < str.length() -1 ; i++){
    if(str.charAt(i) == 'x' && str.charAt(i+1) == 'x'){
      count++;
    }
  }
  return count;
}
