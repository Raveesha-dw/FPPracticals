package demo

class Account(amount: Double) {
  var balance = amount;

  def getBalance: Double = balance;
}

object test4 {
  def negativeBalances(accounts: List[Account]): List[Account] = {
    accounts.filter(account => account.getBalance < 0)
  }

  def calculateTotalBalance(accounts: List[Account]): Double = {
    accounts.map(_.getBalance).sum
  }

  def applyInterest(accounts: List[Account]): List[Account] = {
    def applySingleAccountInterest(account: Account): Account = {
      val interestRate = if (account.getBalance >= 0) 0.05 else 0.1
      val newBalance = account.getBalance * (1 + interestRate)
      new Account(newBalance)
    }

    accounts.map(applySingleAccountInterest)
  }


    def main(args: Array[String]): Unit = {
      val account1 = new Account(1000.0)
      val account2 = new Account(-50.0)
      val account3 = new Account(2500.0)
      val account4 = new Account(-300.0)

      val accounts = List(account1, account2, account3, account4)

      val accountsWithNegativeBalances = negativeBalances(accounts)
      println(s"Accounts with negative balances: ");
      println(accountsWithNegativeBalances);

      val totalBalance = calculateTotalBalance(accounts)
      println(s"Total balance of all accounts: $totalBalance")

      val accountsWithInterest = applyInterest(accounts)
      println("Final balances after applying interest:")
      accountsWithInterest.foreach(account => println(s"Account balance: ${account.getBalance}"))

    }
  }

