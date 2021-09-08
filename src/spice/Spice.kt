package spice

import aquaa.myaqua

open class SimpleSpice() {
    var spiciness1 = "mild"

    var spiceName = "curry"

    constructor(spiciness : String, nameOfSpice: String): this(){
        spiciness1 = spiciness
        spiceName = nameOfSpice
    }


//        get() = spiceName

    var heat: Int
        get() = when {
            // this acts as if-else
            spiciness1 == "mild" -> 5
            else -> 2
            //this is the alternate way (which acts like the switch stmt):
//            when(spiciness){
//                "mild" -> 5
//                else -> 2
//            }
        }
        //if you don't use a setter, you will HAVE TO initialise the heat var
        set(value) {
            value * 5
        }
}