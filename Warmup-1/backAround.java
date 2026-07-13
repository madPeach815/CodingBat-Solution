public String backAround(String str) {
//Given a string, take the last char and return a new string with the last char
//at the front and back, so "cat" yields "tcatt".
//The original string will be length 1 or more.

char frontBack = str.charAt(str.length()-1);

return frontBack + str + frontBack;
}
