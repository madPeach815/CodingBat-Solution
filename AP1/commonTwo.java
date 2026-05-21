/*
Start with two arrays of strings, a and b, each in alphabetical order, possibly with duplicates. Return the count of the number of strings which appear in both arrays. The best "linear" solution makes a single pass over both arrays, taking advantage of the fact that they are in alphabetical order.
*/

public int commonTwo(String[] a, String[] b) {
  
  int count = 0;
  int aIndex = 0;
  int bIndex = 0;
  String lastCount = null;
  
  while (aIndex < a.length && bIndex < b.length){
    if(a[aIndex].compareTo(b[bIndex]) < 0){
      aIndex++;
    }else if (a[aIndex].compareTo(b[bIndex]) > 0){
      bIndex++;
    }else {
      if(lastCount == null || !a[aIndex].equals(lastCount)){
        count++;
        lastCount = a[aIndex];
      }
      aIndex++;
      bIndex++;
    }
  }
  return count;
}
