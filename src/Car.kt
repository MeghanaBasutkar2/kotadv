import kotlin.random.Random

fun main() {
    gamePlay(rollDice2(5))
}

fun gamePlay(diceRoll: Int) {
    println(diceRoll)
}

var rollDice2: (Int) -> Int = { input ->
    arrayListOf(1, 3, 4, 5, 6)[Random.nextInt(input)]
}
