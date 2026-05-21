/*
Start with two arrays of strings, A and B, each with its elements in alphabetical order and without duplicates. Return a new array containing the first N elements from the two arrays. The result array should be in alphabetical order and without duplicates. A and B will both have a length which is N or more. The best "linear" solution makes a single pass over A and B, taking advantage of the fact that they are in alphabetical order, copying elements directly to the new array.
*/

public String[] mergeTwo(String[] a, String[] b, int n) {

String[] newWords = new String[n]; 
int index = 0;
int aIdx = 0;
int bIdx = 0;

  for(int i = 0; i < n; i++){
    if(a[aIdx].compareTo(b[bIdx]) < 0){
      newWords[index++] = a[aIdx++];
    } else if(a[aIdx].compareTo(b[bIdx]) > 0) {
      newWords[index++] = b[bIdx++];
    } else {
      newWords[index++] = a[aIdx++];
      bIdx++;
    }
  }
return newWords;
}
