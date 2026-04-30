//Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".

public String allStar(String str) {
  String newStr = "";
 if(str.length() <= 1){
   return str;
 } 

  newStr = str.charAt(0) + "*";
 
  return newStr + allStar(str.substring(1));
}
