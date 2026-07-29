public boolean sameStarChar(String str) {
  //Returns true if for every '*' (star) in the string, if there are chars both
  //immediately before and after the star, they are the same. 
  
 //Questions.
 //What if there are one * or only *'s? - true
 //What if * is at first or last index. - skip
 //What if there is no char. - true
 //so it is faster that we found false case?
 
 //let's loop
 //let's start index 1 and finish index length()-1
 for(int i = 1; i < str.length()-1; i++){
   if(str.charAt(i) == '*'){
     if(str.charAt(i-1) != str.charAt(i+1)){
       return false;
     }
   } 
 }
 
 return true;
    }
