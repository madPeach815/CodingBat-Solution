public Map<String, Integer> wordLen(String[] strings) {
  //Given an array of strings, return a Map<String, Integer> containing a key
  //for every different string in the array, and the value is that string's length.
  
  //The value is that string's length.
  
  //forst make a map.
  HashMap<String, Integer> map = new HashMap<>();
  
  for(int i = 0; i < strings.length; i++){
    map.put(strings[i], strings[i].length());
  }
  
  return map;
}
