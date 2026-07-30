public Map<String, Integer> wordCount(String[] strings) {
  //The classic word-count algorithm: given an array of strings, return a 
  //Map<String, Integer> with a key for each different string, with the value
  //the number of times that string appears in the array. 
  
  //value is the number of times that string appears in the array. 
  
  HashMap<String, Integer> map = new HashMap<>();
  
 
  //eg) array c c c c 
  //int i = 0 0 < 4 count = 0. x=0 0<4. stirng[i] = c and c is equals string[0]
  // c. count = 1. x = 1. 1 < 4 c.equals(c) count = 2....
  //The problem is map keep replacing the value. 


for(int i = 0; i < strings.length; i++){
  int count = 0;
  for(int x = 0; x < strings.length; x++){
    if(strings[x].equals(strings[i])){
    count++;
    }
    }
    map.putIfAbsent(strings[i], count);
    
}
return map;
}
//first attempt. O2.. not really efficient. 


public Map<String, Integer> wordCount(String[] strings) { 
  HashMap<String, Integer> map = new HashMap<>();

for(int i = 0; i < strings.length; i++){
  if(!map.containsKey(strings[i])){
    map.put(strings[i], 1);
  }else{
    map.put(strings[i], map.get(strings[i])+1);
  }
}

return map;
}


public Map<String, Integer> wordCount(String[] strings) {
  HashMap<String, Integer> map = new HashMap<>();
  
 //Use getOrDefault(key, defaultValue)

for(int i = 0; i < strings.length; i++){
    map.put(strings[i], map.getOrDefault(strings[i], 0) + 1);
}

return map;
}

