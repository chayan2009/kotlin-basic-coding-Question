

fun main(){
    val number=3
    val sum=addNumber(number)
    println("Sum of Number: $sum")
}
fun addNumber(num:Int):Int{
    if(num!=0)
    return num+addNumber(num-1)
    else
    return num
}