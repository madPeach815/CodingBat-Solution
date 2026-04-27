/*
Given an array of scores, return true if each score is equal or greater than the one before. The array will be length 2 or more.*/

//I did first time like that. It works but the code is a little bit noise and wasting. 
//In this case, it is better set default true and find false case. 
//since for finding true has more condition than finding false. 

/*
public boolean scoresIncreasing(int[] scores) {
  //return true : preScore <= nowScore
  boolean isKeepInc = false;
  for(int i = 0; i < scores.length - 1; i++){
    if(scores[i] <= scores[i+1]){
      isKeepInc = true;
    }else {
      return false;
    }
  }
if(isKeepInc){
  return true;
}
return false;
}
*/

public boolean scoresIncreasing(int[] scores){

    for(int i = 0; i < scores.length - 1; i++){
      if(scores[i] > scores[i+1]){
        return false;
      }
    }

return true;
}
