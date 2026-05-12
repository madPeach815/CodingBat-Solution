/*
Given a string that contains a single pair of parenthesis, compute recursively a new string made of only of the parenthesis and their contents, so "xyz(abc)123" yields "(abc)".
*/

public String parenBit(String str) {
 return parenBitAux(str, false);
}

public String parenBitAux(String str, boolean isParen){
  
  if(str.length() <= 0){
    return "";
  }
  
  if(str.charAt(0) == '('){
    return str.charAt(0) + parenBitAux(str.substring(1), true);
  }
  
  if(isParen && str.charAt(0) != ')'){
    return str.charAt(0) + parenBitAux(str.substring(1), true);
  }
  
  if(isParen && str.charAt(0) == ')'){
    return str.charAt(0) + parenBitAux(str.substring(1), false);
  }
  
  return parenBitAux(str.substring(1), false);
}


//or better way

public String parenBit(String str) {

  if(str.length() < 2) {
    return str;
  }
  
  if(str.charAt(0) != '('){
    return parenBit(str.substring(1));
  }
  
  if(str.charAt(str.length()-1) != ')'){
    return parenBit(str.substring(0, str.length()-1));
  }
  
  return str;
}
