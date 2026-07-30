public Map<String, String> pairs(String[] strings) {
  //Given an array of non-empty strings, create and return a Map<String, String>
  //as follows: for each string add its first character as a key with its 
  //last character as the value;
  
  //each string in string array, first char is the key last char is the value.
  
  HashMap<String, String> map = new HashMap<>();
  
  for(String s : strings){
    map.put("" + s.charAt(0), "" + s.charAt(s.length()-1));
  }
  
  return map;
}


//or you can also do like this. 

public Map<String, String> pairs(String[] strings) {
  //Given an array of non-empty strings, create and return a Map<String, String>
  //as follows: for each string add its first character as a key with its 
  //last character as the value;
  
  //each string in string array, first char is the key last char is the value.
  
  HashMap<String, String> map = new HashMap<>();
  
  for(String s : strings){
    String key = String.valueOf(s.charAt(0));
    String value = String.valueOf(s.charAt(s.length()-1));
    map.put(key, value);
  }
  
  return map;
}
