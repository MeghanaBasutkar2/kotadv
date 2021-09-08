open class Vehicle : xyz{
    override fun someMethod(): Int {
        println("xyz: ")
        return 12
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    var wheels: List<Wheels> = listOf<Vehicle.Wheels>() //initialises the wheels val with the Wheels() object
    var wheels2: MutableList<Wheels> = mutableListOf<Vehicle.Wheels>()
    var wheels3: ArrayList<Wheels> = arrayListOf<Vehicle.Wheels>() // mutable
    var wheels4: List<Wheels> = arrayListOf<Vehicle.Wheels>() //immutable
    var wheels5: Set<Wheels> = mutableSetOf<Vehicle.Wheels>() //immutable

    constructor()
    constructor(anyWheels: List<Wheels>) {
        this.wheels = anyWheels
        someMethod()
        wheels3.add(Wheels(6))
//        wheels4.add(Wheels(9)) //immutable
    }

    fun checkCorrectKey(key: CarKey) {
        key.keySizeRight(4)
    }

    class CarKey {
        var radius: Int = 4

        fun keySizeRight(size: Int): Boolean {
            when {
                size == radius -> return true
                else -> return false
            }
        }
    }



//the above can also be written as:
//val wheels = Wheels() // this omits the type unlike in above

class Wheels(customNum: Int) {
    var numberOfWheels: Int = customNum
}

class CustomiseWheels {

    val wheelType: Wheels = Wheels(6)
    val wheelType2: Wheels = Wheels(8)
    val wheelType3: Wheels = Wheels(12)

    val customVehicle: Vehicle = Vehicle(listOf(wheelType, wheelType2, wheelType3))
}

}