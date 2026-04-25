public String doubleChar(String str) {
  //Given a string, return a string where for every char in the original, there are two chars.

/*  String print = "";
  
  for(int i = 0; i < str.length(); i++){
    print += str.charAt(i);
    print += str.charAt(i);
  }
  return print;
}*/

//Tried with StringBuilder. for saving memory.

  StringBuilder strB = new StringBuilder();

    for(int i = 0; i < str.length(); i++){
      strB.append(str.charAt(i)).append(str.charAt(i));
    }
    return strB.toString();
}
