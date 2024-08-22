import java.lang.Double.parseDouble
fun main(){
    var input="233sd2"
    var numeric=true
    //approch-1
    // try{
    //     val num = parseDouble(input)
    // }catch(e:NumberFormatException){
    //     numeric=false
    // }
    //aproach-2
    numeric = input.matches("-?\\d+(\\.\\d+)?".toRegex())
    if(numeric){
        println("$input is a number")
    }else{
        println("$input is a not a Number")

    }
}