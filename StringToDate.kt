

import java.time.LocalDate
import java.time.format.DateTimeFormatter
fun main(){
    val input="2017-04-19"
    val date=LocalDate.parse(input,DateTimeFormatter.ISO_DATE)
    println("Date:$date")
}