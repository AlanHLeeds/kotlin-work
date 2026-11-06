// Task 15.2.3: demo program

fun main() {
    // Write code to demonstrate the classes here
    val savingsAccount = SavingsAccount("test", 0.018)
    savingsAccount.deposit(1250.0)
    savingsAccount.applyInterest()
    savingsAccount.applyInterest()
    savingsAccount.applyInterest()
    savingsAccount.applyInterest()
    savingsAccount.applyInterest()
    savingsAccount.withdraw(50.0)
    println(savingsAccount.balance)


}
