fun main(){
    val array=intArrayOf(1,2,34,450,5,6,6,7)
    var max=array[0]
    var min =array[0]
    for(i in 0..array.size){
        if(i>max){
            max=i
        }
        if(i<max){
            min=i
        }
    }
    println("largest Number: $max")
    println("minimum Number: $min")

}