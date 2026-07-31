public String[] firstSwap(String[] strings) {
  //We'll say that 2 strings "match" if they are non-empty and their first chars
  //are the same. Loop over and then return the given array of non-empty strings 
  //as follow: if a string matches an earlier string in the array, swap the
  //2 strings in the array. A particular first cahr can only cause 1 swap, so 
  //once a char has caused a swap, its later swaps are disabled.
  //Using a map, this can be solved making just one pass over the array. 
  //More difficult than it looks. 
  
  HashMap<Character, Integer> map = new HashMap<>();
  
  for(int i = 0; i < strings.length; i++){
    char key = strings[i].charAt(0);
    
    if(!map.containsKey(key)){
      map.put(key, i);
    } else {
      int j = map.get(key);
      
      if(j != -1){
      String temp = strings[j];
      strings[j] = strings[i];
      strings[i] = temp;
      
      map.put(key, -1);
      }
      
    }
  }
  return strings;
}
