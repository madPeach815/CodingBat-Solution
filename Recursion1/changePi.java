/*Given a string, compute recursively (no loops) a new string where all
appearances of "pi" have been replaced by "3.14".*/

//using simple way.
/* public String changePi(String str) {
return str.replace("pi", "3.14"); */

//using StringBuffer 
/* public String changePi(String str){
StringBuffer buffer = new StringBuffer();
  if(str == null || str.length() == 0){
    return str;
  }
  
  int index = 0;
  for(int i = 0; i < str.length(); i++){
    if(i < str.length()-1){
      if(str.charAt(i) == 'p' && str.charAt(i+1) == 'i'){
        buffer.append("3.14");
        i++;
      } else {
        buffer.append(str.charAt(i));
      }
    }else {
      buffer.append(str.charAt(i));
    }
  }
  return buffer.toString();
} */

public String changePi(String str){
  if(str.length() == 0 || str.length() == 1){
    return str;
  }

  if(str.charAt(0) == 'p' && str.charAt(1) == 'i'){
    return "3.14" + changePi(str.substring(2));
  }
  return str.charAt(0) + changePi(str.substring(1));
}
