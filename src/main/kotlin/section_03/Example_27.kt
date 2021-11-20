package section_03

data class UserWithDataClass(val name: String, val age: Int)
class UserWithoutDataClass(val name: String, val age: Int){
    override fun toString(): String {
        return "Name is $name, age is $age"
    }
}
fun main(){
    val userWithDataClass = UserWithDataClass("Behzod",25)
    val userWithClass = UserWithoutDataClass("John",25)
    println(userWithDataClass)
    println(userWithClass)

}