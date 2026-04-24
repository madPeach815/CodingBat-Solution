/*
We have a number of bunnies and each bunny has two big floppy ears. 
We want to compute the total number of ears across all the bunnies recursively 
(without loops or multiplication).*/

public int bunnyEars(int bunnies) {
  
  //if there are 5 bunnies.. 1 bunny have 2 ears. +2 
    if(bunnies == 0){
    return 0; 
  }
  return 2 + bunnyEars(bunnies - 1);
  
  //that means if bunnyEars(5)
  //it will return 2 + go back to bunnyEars(5-1)
  //it will return 2 again and go back to bunnyEars(4-1)
  //it will return 2 and go back to bunnyEars(3-1)
  //bunnyEars(2) will return 2 and go back to bunnyEars(2-1)
  //bunnyEars(1) will return 2 and go back to bunnyEars(1-1)
  //bunnyEars(0) return 0. so 2+2+2+2+2 10 ears.
  //if I return bunnyEars(n-1) + 2 it will be different? No.
}
