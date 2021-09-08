import kotlin.random.Random

fun main() {
    print(rollDice(6))
    higherOrderTest(4)
    var arrr = arrayListOf(1, 2, 3, 4, 5, 6)
}


fun rollDice(sides: Int) =
    when {
        sides != 0 -> arrayListOf(1, 2, 3, 4, 5, 6)[Random.nextInt(6)]
        else -> 0
    }

//lambdas can be defined as variables with input and output as defined below
//var higherOrderFun: (inputType) -> outputType = {// use the input and do something here}
var higherOrderTest: (Int) -> String = {
    inp -> inp.toString()
}