package aquaa

import spice.SimpleSpice

val myaqua = Aquaa()
val myaqua2 = Aquaa(10, 30, 80)
val myAqCons2 = Aquaa(40)
var simpleSpice = SimpleSpice()

fun main() {
    buildAquarium()
    simpleSpice.spiciness1 = "tooo hott!"
    println("testing the order of sec cons ${myAqCons2.height}")
    println("${simpleSpice.spiceName} &&&&& ${simpleSpice.spiciness1} &&& ${simpleSpice.heat}")
}
fun buildAquarium() {

    val volume = myaqua.length * myaqua.width * myaqua.height

    println("My aq ${myaqua.width}")
    println("My aq ${myaqua.height}")
    println("My aq ${myaqua.length}")
    println("My aq $volume")
}

var volume: Int //declare the int and add getters setters right below
    get() = myaqua.length * myaqua.width * myaqua.height
    set(value) { value*1000/(myaqua.width * myaqua.height) }