public Map<String, String> firstChar(String[] strings) {
  //Given an array of non-empty strings, return a Map<String, String> with a key
  //for every different first character seen, with the value of all the strings
  //starting with that character appended together in the order they appear in 
  //the array. 
  
  HashMap<String, String> map = new HashMap<>();
  //key is the first char. and value is appending them. 
  
  for(int i = 0; i < strings.length; i++){
    String key = String.valueOf(strings[i].charAt(0));
    if(!map.containsKey(key)){
    map.put(key, strings[i]); 
    }else {
      map.put(key, map.get(key) + strings[i]);
    }
  }
  return map;
}


//Or we can do this way. 
public Map<String, String> firstChar(String[] strings) {
  //Given an array of non-empty strings, return a Map<String, String> with a key
  //for every different first character seen, with the value of all the strings
  //starting with that character appended together in the order they appear in 
  //the array. 
  
  HashMap<String, String> map = new HashMap<>();
  //key is the first char. and value is appending them. 
  
  for(int i = 0; i < strings.length; i++){
    String key = String.valueOf(strings[i].charAt(0));
      map.put(key, map.getOrDefault(key, "") + strings[i]);
  }
  return map;
}
