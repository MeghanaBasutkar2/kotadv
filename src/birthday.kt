fun main(args: Array<String>){
 print(getFortune())
}

fun getFortune():String{
 return when(getBirthday(25)){
     28-> "You have a shining future"
     else -> "This is it! Go for it"
 }
}

fun getBirthday(date: Int): Int{
return date
}