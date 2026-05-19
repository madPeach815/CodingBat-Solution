/*
Given 2 arrays that are the same length containing strings, compare the 1st string in one array to the 1st string in the other array, the 2nd to the 2nd and so on. Count the number of times that the 2 strings are non-empty and start with the same char. The strings may be any length, including 0.
*/

public int matchUp(String[] a, String[] b) {
  //compare both string and count if same index string has non empty and start with same char

int count = 0;

if(a.length == 0 || b.length == 0){
  return 0;
}

for(int i = 0; i < a.length; i++){
  if((!a[i].isEmpty()) && (!b[i].isEmpty())){
    if(a[i].charAt(0) == b[i].charAt(0)){
      count++;
    }
  }
}

return count;
}
