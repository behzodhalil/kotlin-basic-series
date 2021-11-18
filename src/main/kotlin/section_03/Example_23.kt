package section_03

class Phone(val colorPhone: String, val brandPhone: String) {
    override fun toString(): String {
        return "Phone: color = $colorPhone, brand = $brandPhone"
    }
}

fun main() {
    val phone1 = Phone("black","Samsung")
    val phone2 = Phone("black","Samsung")

    println(phone1 == phone2)
    println(phone1 === phone2)

}