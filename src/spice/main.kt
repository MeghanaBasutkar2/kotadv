package spice
fun main(){ SpiceAccessor()}
class SpiceAccessor{
    var spice = SimpleSpice("hott", "clove")
    var spice1 = SimpleSpice("mild", "salt")
    var spice2= SimpleSpice("too hott", "chilli")
    var spice3 = SimpleSpice("hott", "garlic")

    var spices: ArrayList<SimpleSpice> = arrayListOf(spice, spice1, spice2, spice3)

    init {
//        println(spices.filter {  it.heat>3})

            for(el in spices){
                println("testing things nowww ${el.spiciness1} ${el.spiceName}")
            }
        }
    }
