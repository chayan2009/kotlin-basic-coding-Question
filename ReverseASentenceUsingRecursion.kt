fun main(){

    // Appraoch-1
    // val senstense="GO Work adafadsfadfafasfas"
    // val reversed=reverse(senstense)
    // println("reversed::: $reversed")

    // Approach-2
    val input="hello World"
    var result=""
    for(i in input.length-1 downTo 0){
        result=result+input[i]
    }
    println("Reverse String:: $result")

    // approach -3

    var str ="welcome"
    var strResult=str.reversed()
    println("reversed:: $strResult")
}

fun reverse(input:String):String{

    if(input.isEmpty())
        return input

    return reverse(input.substring(1))+input[0]

}