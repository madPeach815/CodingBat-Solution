/*
Given an array of scores sorted in increasing order, return true if the array contains 3 adjacent scores that differ from each other by at most 2, such as with {3, 4, 5} or {3, 5, 5}.
*/

public boolean scoresClump(int[] scores) {
  //3 connected score.. if these 3 scores are at most 2 point apart... each other
  //so they should be same score, 1 or 2 apart.
  
  for(int i = 0; i < scores.length - 2; i++){
    if(scores[i+2]-scores[i] <= 2){
      return true;
    }
  }
  return false;
}
