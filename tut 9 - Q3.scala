package demo


object test3 {
  class Account(amount: Double) {
    var balance = amount;

    def getBalance: Double = balance;

    def deposit(amount: Double): Unit = {
      if (amount > 0) {
        balance += amount
        println(s"Deposited $amount. New balance: $balance")
      }
    }

    def withdraw(amount: Double): Unit = {
      if (amount > 0 && amount <= balance) {
        balance -= amount
        println(s"Withdrew $amount. New balance: $balance")
      } else {
        println("Invalid withdrawal amount")
      }
    }

    def transfer(amount: Double, targetAccount: Account): Unit = {
      if (amount > 0 && amount <= balance) {
        balance -= amount
        targetAccount.deposit(amount)
        println(s"Transferred $amount to target account. New balance: $balance")
      } else {
        println("Invalid transfer amount")
      }
    }
  }

  def main(args: Array[String]): Unit = {

    var account1 = new Account(10000.00);
    var account2 = new Account(23000.00);

    account1.deposit(4000.00);
    account2.withdraw(3500.00);
    account1.transfer(1500, account2);
  }

}