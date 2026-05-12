/*
Count recursively the total number of "abc" and "aba" substrings that appear in the given string.
*/

public int countAbc(String str) {
  //count abc, aba
  
  if(str.length() < 3){
    return 0;
  }
  if(str.startsWith("abc") || str.startsWith("aba")){
    return 1 + countAbc(str.substring(1));
  }
  return countAbc(str.substring(1));
}
