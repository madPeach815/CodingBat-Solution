//Given start and end numbers, return a new array containing the sequence of integers from start up to but not including end, 
//so start=5 and end=10 yields {5, 6, 7, 8, 9}. The end number will be greater or equal to the start number. 
//Note that a length-0 array is valid.

public int[] fizzArray3(int start, int end) {
  int[] listOfNum = new int[end - start];
  //example if start = 3 and end = 9 it should be {3, 4, 5, 6, 7, 8} 9-3=6 
  //length is end - start. 
  
  //We need new index for putting each numbers in an order. 
 int newIdx = 0;
  for(int i = start; i < end; i++){
    listOfNum[newIdx] += i; 
    newIdx++;
  }
  return listOfNum;
}
