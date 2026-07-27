public String repeatSeparator(String word, String sep, int count) {
  //Given two strings, word and a separator sep, return a big string made of count
  //occurrences of the word, separated by the separator string.
  
  StringBuilder result = new StringBuilder();
  
  //Word and X and 3. i=0 0<3 
  //Word and 0 < 2 so WordX i=1
  //1<3 so WordXWord and 1 < 2 so WordXWordX i=2
  //2<3 so WordXWordXWord 2<2 no. done. 
  for(int i = 0; i < count; i++){
    result.append(word);
    if(i < count-1){
      result.append(sep);
    }
  }
  return result.toString();
}
