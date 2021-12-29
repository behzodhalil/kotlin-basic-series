package section_05

var a = 10
val list: MutableList<Int> = mutableListOf()

class BankAccount {
    var balance = 0.0
        private set

    fun deposit(depositAmount: Double) {
        balance += depositAmount
    }
    @Throws(InsufficientFunds::class)
    fun withdraw(withDrawAmount: Double) {
        if(balance < withDrawAmount) {
            throw InsufficientFunds()
        }
        balance -= withDrawAmount
    }
}
class InsufficientFunds() : Exception()

fun main() {
    val account = BankAccount()
    println(account.balance)
    account.deposit(100.0)
    println(account.balance)
    account.withdraw(50.0)
    println(account.balance)

    // It throws to exception which is called InsufficientFunds
    // account.withdraw(55.0)

}