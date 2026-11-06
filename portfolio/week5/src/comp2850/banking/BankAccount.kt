// COMP2850 Portfolio: Week 5
// BankAccount class

package comp2850.banking

abstract class BankAccount(val holder: String) {
    init {
        require(holder.isNotBlank()) { "Account holder must not be blank" }
    }

    var balance = 0
        protected set(value) {
            field = value
        }

    fun deposit(amount: Int) {
        require(amount > 0) { "Deposit amount must be greater than 0" }
        balance += amount
    }

    abstract fun withdraw(amount: Int)
}

class StudentAccount(holder: String, overdraft: Int=0) : BankAccount(holder) {
    var overdraft: Int = overdraft
        set(value) {
            if (value < 0 || value > 100) {
                throw IllegalArgumentException("Overdraft must be between 0 and 100")
            }
            field = value
        }
    init {
        require(overdraft in 0..100) {
            "Overdraft must be between 0 and 100"
        }
    }
    override fun toString(): String {
        return "Account for $holder, balance = $balance (overdraft = $overdraft)"
    }
    fun withdrawalsAllowed(): Boolean {
        if (balance + overdraft <= 0) {
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
}


