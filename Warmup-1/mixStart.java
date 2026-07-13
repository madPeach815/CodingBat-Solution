public boolean mixStart(String str) {
  //Return true if the given string begins with "mix", except the 'm' can be anything,
  //so "pix", "9ix"// all count. 
  return str.length() >= 3 && str.startsWith("ix", 1);
}
