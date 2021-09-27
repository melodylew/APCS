public class Time {
    public static void main(String[] args){
      //VARIABLES
      double hour = 14.0;
      System.out.println(hour);
      double minute = 10.0;
      System.out.println(minute);
      double second = 45.0;
      System.out.println(second);
      int SEC_PER_HR = 3600;
      int SEC_PER_MIN = 60;
      int SEC_PER_DAY = 86400;

      //Seconds since midnight
      System.out.println(hour * SEC_PER_HR + minute * SEC_PER_MIN + second);

      //Seconds remaining
      System.out.println(SEC_PER_DAY - (hour * SEC_PER_HR + minute * SEC_PER_MIN + second));

      //Percentage of day that passed
      System.out.println(((hour * SEC_PER_HR + minute * SEC_PER_MIN + second) / 86400) * 100);

      //Elapsed time
      hour = 14.0;
      minute = 23.0;
      second = 56.0;
      System.out.println((hour - 14.0) + ":" + (minute - 10.0) + ":" + (second - 45.0));
    }
}
