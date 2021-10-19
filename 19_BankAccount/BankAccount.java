/* 
UnicornHead: Melody Lew, Ariella Katz, Lior Polischouk, Ollie, Tom, Toothless
APCS pd6
HW19 -- Mo Money Mo Problems ...MORE AWESOME
2021-10-18
*/

/* 
DISCO
 0. 
QCC
 0. 
*/

public class BankAccount{
  private String name;
  private String passwd;
  private short pin;
  private int acctNum;
  private double balance;

  public String setName(String newName){
    name = newName;
    return name;
  }
  public String setPasswd(String newPasswd){
    passwd = newPasswd;
    return passwd;
  }
  public short setPin(short newPin){
    if (pin >= 1000 && pin <= 9998){
      pin = newPin;
      return pin;
    }
    else {
      pin = 9999;
      System.out.println("Invalid pin");
   }
  }
  public int setAcctNum(int newAcctNum){
    acctNum = newAcctNum;
    return acctNum;
  }
  public double setBalance(double newBalance){
    balance = newBalance;
    return balance;
  }

  public void deposit(double depositAmount){
    balance = balance + depositAmount;
  }

  public void withdraw(double withdrawAmount){
    balance = balance - withdrawAmount;
  }

  public String toString(){
    return ("" + name + "\n" + passwd + "\n" + pin + "\n" + acctNum + "\n" + balance); 
  }

  public static void main(String[] args){
    BankAccount account = new BankAccount();
    account.setName("Bob Smith");
    account.setPasswd("1234Unicorn");
    account.setPin((short) 5678);
    account.setAcctNum(123456789);
    account.setBalance(100.51);
    account.deposit(0.01);
    account.withdraw(99.99);
    System.out.println(account.toString());
  }
}
