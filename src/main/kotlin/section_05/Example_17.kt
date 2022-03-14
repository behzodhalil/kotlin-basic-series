package section_05

// A Salad interface helps with knowing the ingredients
interface Salad {
    fun getIngredients(): String
}
// Every salad needs a base. This base is Arugula & Lettuce thus, PlainSalad.
class PlainSalad: Salad {
    override fun getIngredients(): String {
        return "Arugula & Lettuce"
    }
}
// A SaladDecorator helps add more toppings to the PlainSalad
open class SaladDecorator(protected var salad: Salad) : Salad {
    override fun getIngredients(): String {
        return salad.getIngredients()
    }
}
// Cucumber inherits from SaladDecorator
class Cucumber(salad: Salad) : SaladDecorator(salad) {
    override fun getIngredients(): String {
        return salad.getIngredients() + ", Cucumber"
    }
}
// Carrot inherits from SaladDecorator
class Carrot(salad: Salad) : SaladDecorator(salad) {
    override fun getIngredients(): String {
        return salad.getIngredients() + ", Carrot"
    }
}