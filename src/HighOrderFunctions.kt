fun main(args: Array<String>) {
    print(convertNestedString("Android") { input ->
        input.length })
    print("\n")
}

fun convertNestedString(str: String, mapperConvert: (String) -> Int): Int {
    return mapperConvert(str)
}



