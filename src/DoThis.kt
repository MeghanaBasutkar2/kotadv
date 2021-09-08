import java.lang.Math.random

fun main() {
    var arrStrings = arrayOf("hdkjhd", "kdkjd", "khkjsh")
    var listt = listOf("cardamome", "clove", "star-anese", "cpeppere", "cgingere");
    val spiceList = arrayListOf("cardamome", "clove", "star-anese", "cpeppere", "cgingere")
    filterMethod(spiceList)
    println(whatShouldIDoToday(mood = "happy", weather = "warm", temperature = 2))
    val random1 = random()
    val random2 = {random()}

    println("$random1 & $random2")
}

fun filterMethod(spices: ArrayList<String>){
    println(spices.sortedBy(lengthOfthis)) //spices
    var spices2 = spices.filter{it[0] == 'c' && it.endsWith('e')}
    println(spices2.take(3).filter {it.startsWith('c') && it.endsWith('e')})
}

fun showHowTouse(x: String){
    when (x){
        "abc" -> "how"
        "def" -> "how3"
        "gf" -> "how2"
        "abc" -> "how4"
    }
}
fun whatShouldIDoToday(mood: String, weather: String, temperature: Int): String {
    return when {
        //when statement acts as an if-else block when used WITHOUT PARAMS
        isSad(mood) && isHot(45) -> "Stay home & read"
        isHappy(mood) || !isSad(mood) -> "Get out"
        else -> "Do what you feel likeee doing"
    }
}

fun isSad(mood: String) = (mood == "sad")

//fun isHot(temperature: Int) = temperature > 30  || (temperature == 2)

var isHot: (Int) -> Boolean  = {input -> input.toString() == "45"}

fun isHappy(happyStr: String) = (happyStr == "happy")