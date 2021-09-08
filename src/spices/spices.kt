package spices

fun main() {
    open abstract class SimpleSpice() {

        constructor(spiciness : String, nameOfSpice: String): this(){

        }

        var spiciness = "mild"

        var spiceName = "curry"

        var heat: Int
            get() = when {
                // this acts as if-else
                spiciness == "mild" -> 5
                else -> 2
            }
            //if you don't use a setter, you will HAVE TO initialise the heat var
            set(value) {
                value * 5
            }

        abstract fun prepareSpice()
    }

    open class Curry(spiciness: Int) : SimpleSpice(), Grinder{

        override fun prepareSpice() {
        }

        override fun grind() {
        }
    }
}
interface Grinder{
    fun grind()
}

interface SpiceColor{
    var color: String
}

object YellowSpiceColor : SpiceColor{
override var color = "Red"

}

data class Decorations(val rocks: String){

}