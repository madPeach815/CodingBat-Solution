public int countHi(String str) {
  
  /*Return the number of times that the string "hi" appears anywhere 
  in the given string. */
  
  /*int count = 0;
  
  for(int i = 0; i < str.length() - 1; i++ ){
    if(str.charAt(i) == 'h' && str.charAt(i+1) == 'i'){
      count++;
      i++;
    }*/
    
    //Let's try to use indexOf(String str, int fromIndex)
    
    int count = 0;
    int index = 0;
    
    while((index = str.indexOf("hi", index)) != -1){
      //find index of 'hi', start the index which mean 0. 
      //if the index is -1. it will be stop.
      count++;
      index += 2;
    }
    return count;
  }
