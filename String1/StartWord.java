public String startWord(String str, String word) {
  //Given a string and a second "word" string, we'll say that the word matches 
  //the string if it appears at the front of the string, except its first char 
  //does not need match exactly. On a match, return the front of the string,
  //or otherwise return the empty string. So, with the string "hippo" the word 
  // "hi" returns "hi" and "xip"returns "hip". The word will be at least length 1. 
  
  int wordLen = word.length();
  
  if(str.length() < wordLen) {
    return "";
  }
  
  if(str.substring(1, str.length()).startsWith(word.substring(1, wordLen))){
    return str.substring(0, wordLen);
  }
  
  return "";
}
