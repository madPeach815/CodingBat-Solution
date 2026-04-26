public int countCode(String str) {
  /*Return the number of times that the string "code" appears anywhere 
  in the given string, except we'll accept any letter for the 'd', so "cope" 
  and "cooe" count.*/
  
  //count code but d can be any letter.
  
  int count = 0;
  
  for(int i = 0; i < str.length()-3; i++){
    if(str.charAt(i)== 'c' && str.charAt(i+1) == 'o' && str.charAt(i+3) == 'e'){
      count++;
      i += 3; 
    }
  }
  return count;
}
