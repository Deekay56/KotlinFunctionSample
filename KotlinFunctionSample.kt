fun randomDay(): String {
    
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday")
    
  return week.random()
  
}

fun fishFood(day: String): String {
    if (day == "Monday") {
        return "flakes"
    } else if (day == "Wednesday") {
        return "redworms"
    } else if (day == "Thursday") {
        return "granules"
    } else if (day == "Friday") {
        return "mosquitoes"
    } else if (day == "Sunday") {
        return "plankton"
    } else {
        return "nothing"
    }
}

fun main(){
    
    val currentRandomDay = randomDay()
    val food = fishFood(currentRandomDay)
    
    println ("Today is $currentRandomDay and the fish eat $food.")
}
