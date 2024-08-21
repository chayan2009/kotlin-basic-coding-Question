fun main(){
    val number=intArrayOf(1,2,3,5,2,7)
    var sum =0
    var average=0
    for(i in number){
        sum=sum+i
    } 
    average=sum/number.size
    println("Sum of total: $sum")
    println("Sum of total: $average")

}