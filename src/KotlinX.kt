fun main(args: Array<String>) {
    //method1
    printNameWithIfElse(50)
    print("\n")

    //method2
    printNameWithWhen(44)
    print("\n")

    checkNotNullString("", null, "lowerCase")
    print("\n")

    print("The result of this func is: " + generateFunction(30))
    print("\n")

    val stringLength: Int = lengthOfthis("someTestStringg")
    print("length of string is: " + stringLength)
}

fun printNameWithIfElse(i: Int) {
    var num = i
    val finalName: String = if (num > 20)
        "above 20"
    else if (num < 20)
        "less than 20"
    else
        ""
    print(finalName)
}

fun printNameWithWhen(someInt: Int) {
    var outputString: String = when {
        someInt > 100 -> "WOW, biggg"
        someInt < 100 -> "too small"
        someInt == 100 -> "equal"
        else -> "meh"
    }
    print(outputString)
}

//String? type is a string type that can be assigned to null
//A plane String can never be assigned to null in kotlin!
//to check if the nullable string that is, String? holds a null value, we can use "?" before the "." operator
fun checkNotNullString(s1: String, s2: String?, lower: String?) {
    print("empty val: " + s1 + " " + s2 + " " + lower?.toUpperCase())
}

//Example1: Assigning a value to return variable directly
/*fun generateFunction(input: Int): String =
    when {
        (input > 10) -> "someString"
        (input < 10) -> ""
        else -> "randomString"
    }*/

//both above and below are same
fun generateFunction(input: Int): String {
    return when {
        input > 10 -> "above 10"
        input < 10 -> "below 10"
        else -> "mehhh"
    }
}

//This is actually anonymous fun of type (String) -> Int which means,
//it takes a String as an input and gives integer as output
//the output is assigned to the int as usual in any fun
// - refer Example1 to recall
var lengthOfthis: (String) -> Int = { input ->
    input.length
}


fun someFunction(str: String): String =
    when {
        str.length < 5 -> "toooo - less"
        str.length > 5 -> "too much"
        else -> "equal maybe"
    }

//same as above
/*
fun someFunction(str: String): String {
    return when {
        str.length < 5 -> "toooo - less"
        str.length > 5 -> "too much"
        else -> "equal maybe"
    }
}*/
