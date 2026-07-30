public String wordAppend(String[] strings) {
  //Loop over the given array of strings to build a result string like this:
  //when a string appears the 2nd, 4th, 6th, etc. Time in the array append
  //the string to the result. Return the empty string if no string appears a 
  //2nd time. 
  
  HashMap<String, Integer> map = new HashMap<>();
  StringBuilder result = new StringBuilder();
  
  
  for(int i = 0; i < strings.length; i++){
    map.put(strings[i], map.getOrDefault(strings[i], 0) + 1);
    if(map.get(strings[i]) % 2 == 0){
      result.append(strings[i]);
    }
  }
  return result.toString();
}
