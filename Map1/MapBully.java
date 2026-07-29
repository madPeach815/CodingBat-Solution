public Map<String, String> mapBully(Map<String, String> map) {
  //Modify and return the given map as follows: if the key "a" has a value,
  //set the key "b" to have that value, and se the key "a" to have the value "".
  //Basically "b" is a bully, taking the value and replacing it with the empty string.
  
  //what if there is no "a"?
  
  if(map.get("a") != null && !map.get("a").isEmpty()){
    map.put("b", map.get("a"));
    map.put("a", "");
  }
  
  return map;
}
