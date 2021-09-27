public class CodingBat{

  /** force */
  public double force(double g, double m1, double m2, double r){
    double result = ((g*(m1*m2))/(r*r));
    return result;
  }
  /** average3 */
  public double average3(int a, int b, int c){
    double avg = (a+b+c)/3.0;
    return avg;
  }
  /** sumOfSines */
  public double sumOfSines(double t){
    double tRadians = Math.toRadians(t);
    double sum = ((Math.sin(2*tRadians)) + (Math.sin(3*tRadians)));
    double result = Math.round(sum*1000) / 1000.0;
    return result;
  }
  /** oddsAreNegated */
  public int oddsAreNegated(int x){
    if (x%2 == 0){
      return x;
    } else {
      return x*(-1);
    }
  }
  /** noTeenSum */
  public int noTeenSum(int a, int b, int c) {
    return fixTeen(a)+fixTeen(b)+fixTeen(c);
  }
  public int fixTeen(int n) {
    int value = n;
    boolean range = (n >= 13 && n <= 19);
    boolean none = (n!=15 && n!=16);
    if (range && none){
      value = 0;
    } else {
      value = n;
    }
    return value;
  }
  /** stringTimes */
  public String stringTimes(String str, int n) {
    String newStr = "";
    for (int i=1; i <= n; i++){
      newStr = newStr+str;
    }
    return newStr;
  }
  /** countEvens */
  public int countEvens(int[] nums) {
    int count = 0;
    for (int element = 0; element < nums.length; element++){
      if (nums[element]%2 == 0){
        count = count+1;
      } else {
        count = count;
      }
    } return count;
  }
  /** sum28 */
  public boolean sum28(int[] nums) {
    int sum = 0;
    int element = 0;
    boolean finalSum = true;
    if (nums.length == 0) {
      finalSum = false;
    }
    while (element <= nums.length-1){
      for (element = 0; element < nums.length; element++){
        if (nums[element] == 2){
          sum = sum+2;
        } else {
          sum = sum;
        }
    } if (sum == 8) {
        finalSum = true;
    } else {
        finalSum = false;
      }
    } return finalSum;
  }
  /** scoresIncreasing */
  public boolean scoresIncreasing(int[] scores) {
    boolean isInc = true;
    boolean finalValue = true;
    int element = 1;
    while (element < scores.length){
      if (scores[element-1] <= scores[element]){
        isInc = true;
        element = element + 1;
      } else {
        isInc = false;
        break;
      }
    } if (isInc){
      finalValue = true;
    } else {
      finalValue = false;
    } return finalValue;
  }
}
