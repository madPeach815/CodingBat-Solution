public boolean catDog(String str) {
  /*Return true if the string "cat" and "dog" appear the same number of times 
  in the given string.*/
  int cat = 0;
  int dog = 0;
  int catIdx = 0;
  int dogIdx = 0;
  
  while((catIdx = str.indexOf("cat", catIdx)) != -1){
    cat++;
    catIdx += 3;
  }
  while((dogIdx = str.indexOf("dog", dogIdx)) != -1){
    dog++;
    dogIdx += 3;
  }
  if(cat == dog){
    return true;
  }
  return false;
}
