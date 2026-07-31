public String[] allSwap(String[] strings) {
  //We'll say that 2 strings "match" if they are non-empty and their first chars 
  //are the same. Loop over and then return the given array of non-empty strings 
  //as follows: if a string matches an earlier string in the array, swap the
  //2 strings in the array. When a position in the array has been swapped, it 
  //no longer matches anything. Using a map, this can be solved making just 
  //one pass over the array. More dificult than it looks. 
  
  //match : non-empty && same first char.
  //return string array. string : earlier string. 
  //how to make.. when it has been swapped, it no longer matches anything.
  //maybe if I use map.. I can do it? 
  
  //Integer for index.
  HashMap<String, Integer> map = new HashMap<>();
  
  for(int i = 0; i < strings.length; i++){
    String key = String.valueOf(strings[i].charAt(0));
    
  if(!map.containsKey(key)){
    map.put(key, i);
    //allSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"])
    //a : 0
  } else { 
    int j = map.get(key);
    //this way, j has previous index which has same char. 
    //I can rearrange strings array because I will only touch previous index.
    String temp = strings[j];
    strings[j] = strings[i];
    strings[i] = temp;
    //now we need to remove matched one from the map.
    map.remove(key);
    
    }
  }
  return strings;
}
