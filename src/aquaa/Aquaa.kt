package aquaa

//notice this - creating a class with same name as package, adds the package statement

class Aquaa(length: Int = 10, width: Int = 30, height: Int = 50) {
    var length: Int = 20
    var width: Int = 40
    var height: Int = 100
    val spices = listOf(Aquaa(20, 40, 70), Aquaa(10,10,10),
        Aquaa(20, 30, 40))

    //this runs first then the primary constructor if called first
    constructor(numberOfFish: Int) :this(){
        numberOfFish*100
        println("Running const 2")

    }






}
