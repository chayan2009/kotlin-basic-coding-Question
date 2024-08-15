fun main(){
 
    var number=1234
    var reversed=0

    while(number!=0){
      var digit=number%10
      reversed=reversed*10+digit
      number=number/10
    }
    println("Revered Number: $reversed")
    
}