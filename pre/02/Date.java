public class Date {
    public static void main(String[] args){
      //VARIABLES
      String day = "Wednesday";
      System.out.println(day);
      int date = 1;
      System.out.println(date);
      String month = "September ";
      System.out.println(month);
      int year = 2021;
      System.out.println(year);

      //American Format
      System.out.println("American format:");
      System.out.println(day + ", " + month + date + ", " + year);

      //European format
      System.out.println("European format:");
      System.out.println(day + " " + date + " " + month + year);
    }
}
