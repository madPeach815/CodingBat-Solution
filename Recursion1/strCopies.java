/*
Given a string and a non-empty substring sub, compute recursively if at least n copies of sub appear in the string somewhere, possibly with overlapping. N will be non-negative.
*/

public boolean strCopies(String str, String sub, int n) {
  //possibly with overlapping
  
return strCopiesAux(str, sub, n, 0);
}

public boolean strCopiesAux(String str, String sub, int n, int count){

  if(str.length() == 0){
    if(count >= n){
      return true;
    }else {
      return false;
    }
  }
  
  if(str.startsWith(sub)){
    return strCopiesAux(str.substring(1), sub, n, count+1);
  }
  return strCopiesAux(str.substring(1), sub, n, count);
}


//better way

public boolean strCopies(String str, String sub, int n) {
  //possibly with overlapping
  
  if(n <= 0){
    return true;
  }
  
  if(str.length() < sub.length()){
    return false;
  }
  
  if(str.startsWith(sub)){
    return strCopies(str.substring(1), sub, n-1);
  }
  
  return strCopies(str.substring(1), sub, n);
}
