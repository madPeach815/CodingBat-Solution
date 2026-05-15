/*Given a positive int n, return true if it contains a 1 digit. Note: use % to get the rightmost digit, and / to discard the rightmost digit.*/

public boolean hasOne(int n) {
  //return if it contains a 1 digit.
  
 while (n > 0){
    if(n % 10 == 1){
      return true;
    } else {
      n = n / 10;
    }
  }
  
  return false;
}

//recursive way
public boolean hasOne(int n){
  if(n <= 0){
    return false;
  }
  
  if(n % 10 == 1){
  return true;
}

return hasOne(n / 10);
}
