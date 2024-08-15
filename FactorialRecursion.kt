

fun main(){
    val number=5
    val result=factorial(number)
    println("factorial result:$result")
}
fun factorial(num:Int):Int{
    if(num>=1)
    return num*factorial(num-1)
    else
    return 1
}