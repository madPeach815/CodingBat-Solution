public Map<String, Boolean> wordMultiple(String[] strings) {
  //Given an array of strings, return a Map<String, Boolean> where each 
  //different string is a key and its value is true if that string appears 2
  //or more times in the array. 
  
  HashMap<String, Boolean> map = new HashMap<>();
  
  for(int i = 0; i < strings.length; i++){
   if(!map.containsKey(strings[i])){
     map.put(strings[i], false);
  }else {
    map.put(strings[i], true);
  }
  }
  return map;
}


//Or you can make it simpler. 

public Map<String, Boolean> wordMultiple(String[] strings) {

  HashMap<String, Boolean> map = new HashMap<>();
  
  for(int i = 0; i < strings.length; i++){

     map.put(strings[i], map.containsKey(strings[i]));
  }
  return map;
}
