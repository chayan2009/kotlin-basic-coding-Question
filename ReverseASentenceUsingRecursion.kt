fun main(){
    val senstense="GO Work adafadsfadfafasfas"
    val reversed=reverse(senstense)
    println("reversed::: $reversed")
}

fun reverse(input:String):String{

    if(input.isEmpty())
        return input

    return reverse(input.substring(1))+input[0]
}