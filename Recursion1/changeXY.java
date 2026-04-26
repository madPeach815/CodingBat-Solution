//try to use replace(something, something);

/* public String changeXY(String str) {
  //String. x changed to x.
  
return str.replace('x', 'y');
} */

//try to not use replace(). Using StringBuffer

/* public String changeXY(String str){
  StringBuffer newStr = new StringBuffer();
  if(str == null || str.length() == 0){
    return str;
  }
  for(int i = 0; i < str.length(); i++){
      if(str.charAt(i) == 'x'){
        newStr.append("y");  
      } else {
        newStr.append(str.charAt(i));
      }
    }
return newStr.toString();
} */

/*Given a string, compute recursively (no loops) a new string where all the 
lowercase 'x' chars have been changed to 'y' chars.*/

public String changeXY(String str){
  if(str.length() == 0){
    return str;
  }
  
  if(str.charAt(0) == 'x'){
    return 'y' + changeXY(str.substring(1));
  }
  
  return str.charAt(0) + changeXY(str.substring(1));
}
