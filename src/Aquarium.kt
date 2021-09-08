import java.util.*

open class Aquarium{

    // open methods can be given only in open classes
open fun main(args: Array<String>) {
    printGello()
    dayOfWeek()
    printArgument(5)
    println(if(canAddFish(10.0, fishesInTank = arrayOf(1.0, 1.0, 1.0), sizeOfNewFish = 2, hasDecoration = true))
        ("Yes, can be added") else ("No cannot be added"))

}

//declare this annotation when you want to access the field directly from a java class
@JvmField
var abc: String = "gheee"

//all methods in kt are final
 fun canAddFish(
    tankSize: Double, fishesInTank: Array<Double>, sizeOfNewFish: Int,
    hasDecoration: Boolean
): Boolean {
    var availableCapacity: Double = if (hasDecoration) (tankSize - (0.2 * tankSize)) else tankSize
    var usedSpace : Double = fishesInTank.sum()
    return (availableCapacity - usedSpace) >= sizeOfNewFish
}

fun printGello() {
    println("Gello")
    feedTheFish()
}

fun feedTheFish() {
    val day = randomDay()
    println("Fish fooood: ${fishFoodOnDay(day)}")
    val feed = "pellets"
    println("Feed $feed to the fish on $day")
}

fun fishFoodOnDay(day: String): String {
    var foodToday = "Fasting day!"
    when (day){
        "Tue" -> "Pellets"
        "Mon" -> "Fishyy"
        "Wed" -> "Sorted"
    }
    return foodToday
}

fun randomDay(): String {
    val randomStrings = listOf("Mon", "Tue", "Wed")
    return randomStrings[Random().nextInt(3)]
}

fun dayOfWeek() {
    println("What day is it today?")
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println(
        when (day) {
            1 -> "Sunday"
            2 -> "Monday"
            3 -> "Tuesday"
            4 -> "Wednesday"
            5 -> "Thursday"
            6 -> "Friday"
            7 -> "Saturday"
            else -> "Time has stopped"
        }
    )
}

fun printArgument(arg: Int) {
    println("$arg")
    println(if (50 == 20) "yay" else "nay")
}}