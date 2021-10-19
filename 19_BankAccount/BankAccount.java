/*
UnicornHead: Melody Lew, Ariella Katz, Lior Polischouk, Ollie, Tom, Toothless
APCS pd6
HW19 -- Mo Money Mo Problems ...MORE AWESOME
2021-10-18
*/

/*
DISCO
 0. You do not need a return statement inside both the if and else statement, as long as you have a return statement at the end of the conditional.
 
QCC
 0. Why does Java print the error messages (e.g. "Invalid pin" and "Invalid
 account number") before the full name and password even though these statements
 were called after?
 1. Why is the balance "100.52000000000001" when the input was only "100.52"?
*/

public class BankAccount{
  private String name;
  private String passwd;
  private short pin;
  private int acctNum;
  private double balance;

  //------------------------------------------------
 
  public String setName(String newName){
    name = newName;
    return name;
  }
  public String setPasswd(String newPasswd){
    passwd = newPasswd;
    return passwd;
  }
  public short setPin(short newPin){
    if (newPin >= 1000 && newPin <= 9998){
      pin = newPin;
    }
    else {
      pin = 9999;
      System.out.println("Error: Invalid pin");
   }
    return pin;
  }
  public int setAcctNum(int newAcctNum){
    if (newAcctNum >= 100000000 && newAcctNum <= 999999998){
      acctNum = newAcctNum;
    }
    else {
      acctNum = 999999999;
      System.out.println("Error: Invalid account number");
   }
    return acctNum;
  }

  public double setBalance(double newBalance){
    balance = newBalance;
    return balance;
  }

  //------------------------------------------------
 
  public void deposit(double depositAmount){
    balance = balance + depositAmount;
  }

  public void withdraw(double withdrawAmount){
    boolean canWithDraw = true;
    if (withdrawAmount > balance){
      balance = balance;
      System.out.println("Error: Insufficient funds. Cannot withdraw this amount.");
      canWithDraw = false;
    }
    else {
      balance = balance - withdrawAmount;
      canWithDraw = true;
    }
  }

  public String toString(){
    return ("" + name + "\n" + passwd + "\n" + pin + "\n" + acctNum + "\n" + balance);
  }

  public boolean authenticate(int accountNum, String pass){
    if (accountNum == acctNum && pass == passwd){
      return true;
    }
    else {
      return false;
    }
  }

  public static void main(String[] args){
    BankAccount account = new BankAccount();
    account.setName("Bob Smith");
    account.setPasswd("1234Unicorn");
    account.setPin((short) 5678);
    account.setPin((short) 0000); //should output 9999 and print error message
    account.setAcctNum(123456789);
    account.setAcctNum(000000000); //should output 999999999 and print error message
    account.setBalance(100.51);
    account.deposit(0.01);
    System.out.println(account.toString()); // creds to Geese
    account.withdraw(102); //should print error message
    System.out.println(account.toString()); // creds to Geese
    account.authenticate(111111111, "123uni"); //should return false
    System.out.println(account.toString());
  }
}
