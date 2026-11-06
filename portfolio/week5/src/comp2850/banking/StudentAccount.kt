// COMP2850 Portfolio: Week 5
// BankAccount class

package comp2850.banking

/*class StudentAccount(holder: String, var overdraft: Int=0) : BankAccount(holder) {
    init {
        if (overdraft < 0 || overdraft > 100) {
            throw IllegalArgumentException()
        }
    }
    override fun toString(): String {
        return "Account for '$holder', balance = '$balance' (overdraft = '$overdraft')"
    }
    fun withdrawalsAllowed(): Boolean {
        if (balance - overdraft < 0) {
            return false
        }
        else {
            return true
        }

    }
    override fun withdraw(amount: Int) {
        if (amount <= 0) {
            throw IllegalArgumentException("Withdrawal amount must be greater than 0")
        }
        if (amount > balance + overdraft) {
            throw IllegalArgumentException("Insufficient funds for withdrawal")
        }
        balance -= amount
    }
}*/
