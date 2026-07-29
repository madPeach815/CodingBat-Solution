public Map<String, String> mapAB3(Map<String, String> map) {
  //Modify and return the given map as follows: if exactly one of the keys "a"
  //or "b" has the value in the map(but not both), set the other to have that 
  //same value in the map. 
  if(map.containsKey("a") ^ map.containsKey("b")){
    if(map.containsKey("a")){
      map.put("b", map.get("a"));
    }else {
      map.put("a", map.get("b"));
    }
  }
  return map;
}
