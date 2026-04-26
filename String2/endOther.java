
/*Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.*/

public boolean endOther(String a, String b) {
 
  if(b.length() >= a.length()){
     String endingB = b.substring(b.length()-a.length(), b.length());
    if(endingB.equalsIgnoreCase(a)){
      return true;
    }
  }
  if(a.length() >= b.length()){
      String endingA = a.substring(a.length()-b.length(), a.length());
    if(endingA.equalsIgnoreCase(b)){
      return true;
    }
  }
  return false;
}

/* you can also use 
String lowA = a.toLowerCase();
String lowB = b.toLowerCase();

return lowA.endsWith(lowB) || lowB.endWith(lowA);
*/
