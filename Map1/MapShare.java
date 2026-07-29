public Map<String, String> mapShare(Map<String, String> map) {
  //Modify and return the given map as follows: if the key "a" has a value,
  //set the key "b" to have that same value. In all cases remove the key "c",
  //leaving the rest of the map. 
  
  if(map.get("a") != null && !map.get("a").isEmpty()){
    map.put("b", map.get("a"));
  }
  map.remove("c");
  
  return map;
}
