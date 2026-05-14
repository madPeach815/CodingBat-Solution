public String[] wordsFront(String[] words, int n) {
  /*Given an array of strings, return a new array containing the first N strings. 
  N will be in the range 1..length.
  */
  
 String[] newArr = new String[n];
  
  for(int i = 0; i < n; i++){
    newArr[i] = words[i];
  }
  return newArr;
}

//can we do this with deep copy

String[] newArr = new String[n];
for(int i = 0; i < n; i++){
  newArr[i] = new String(words[i]);
}

return newArr;
}
