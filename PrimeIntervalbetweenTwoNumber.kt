fun main(){

    println("Prime Interval between Two Number  a and b")

    var low =40
    var high=100
    while(low<high){
         var flag=false
        for (i in 2..low/2) {
            // condition for non prime
            if(low%i==0){
                flag=true
                break
            }
        }
        if(!flag)
            println("$low prime")
        ++low
    }
}