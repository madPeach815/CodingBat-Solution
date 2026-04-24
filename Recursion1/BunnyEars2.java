/* We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot. Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
*/

public int bunnyEars2(int bunnies) {
  //odd bunnies has 2 ears
  //even bunnies has 3 ears
  if(bunnies == 0){
    return 0;
  }
  //bunny 1 = 2
  //bunny 2 = 3
  //bunny 3 = 2
  //bunny 4 = 3
  //if there are 5 bunnies.. it will be 0+2+3+2+3+2
  //if there are 6 bunnies it will be 0 2 3 2 3 2 3
  if(bunnies % 2 == 0){
    return 3 + bunnyEars2(bunnies-1);
  }else{
    return 2 + bunnyEars2(bunnies-1);
  }
}
