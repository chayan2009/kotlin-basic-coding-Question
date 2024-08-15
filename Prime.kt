fun main(){
    var flag=false
    var number=12
    if(number==0 || number==1){
        println("Not a prime number")
    }
    for(i in 2..number/2){
      if(number%i==0){
          flag=true
          break
      }
    }
    if(!flag){
        println(" $number prime number")
    }else{
        println(" $number Not a prime number")
    }
}