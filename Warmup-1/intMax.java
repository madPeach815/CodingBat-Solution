public int intMax(int a, int b, int c) {
  //Given three int values, a b c, return the largest. 
  
  int largest = a;
  if(a <= b){
    largest = b; 
  }
  if(largest <= c){
    largest = c;
  }
  
  return largest;
}
