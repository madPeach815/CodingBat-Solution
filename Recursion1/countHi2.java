/*
Given a string, compute recursively the number of times lowercase "hi" appears in the string, however do not count "hi" that have an 'x' immedately before them.
*/

public int countHi2(String str) {
  //xhi don't count. 
  if(str.length() <= 1){
    return 0;
  }
  
 if(str.startsWith("xhi")){
   return countHi2(str.substring(3));
  } 
 
 if(str.startsWith("hi")) {
   return 1 + countHi2(str.substring(1));
 }
 
 return countHi2(str.substring(1));
}
