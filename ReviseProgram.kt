

fun main(args: Array<String>) {
    
    var number=21
   primeNumber(number)
   // reverseNumber (125)
   // swapNumber(12,10) 
   //val result=addsNumber(5)
   //print("message ::: $result")
 //  PrimeIntervalbetweenTwoNumber()
 intervalArmstronNumber()
}

fun intervalArmstronNumber(){

     var low=100
     var high=1000
     while(low<high){
       var origitNalNum=low
       var reversed=0
       while(origitNalNum!=0){

        val digit=origitNalNum%10
        reversed=reversed*10+digit
        origitNalNum=origitNalNum/10

        if(origitNalNum==reversed){
            print("Armstrong Number: $reversed")
            ++low
           }   
       }
          
     }      
}

fun PrimeIntervalbetweenTwoNumber(){

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

fun addsNumber(num:Int):Int{
    if(num!=0)
    return num+addsNumber(num-1)
    else
    return num
}


fun swapNumber(num:Int,num1:Int){
    var fNumber=num
    var sNnumber=num1
    print("Before Swap:: $fNumber && $sNnumber")
    fNumber=fNumber+sNnumber//12+10
    sNnumber=fNumber-sNnumber//12
    fNumber=fNumber-sNnumber//10
    print("After Swap :: $fNumber && $sNnumber")
}

fun reverseNumber(num:Int){
    var origitNalNum=num
    var reverseNumber=0

    while(origitNalNum!=0){
        val digit=origitNalNum%10
        reverseNumber=reverseNumber*10+digit
        origitNalNum=origitNalNum/10
    }
   print("message:::$reverseNumber") 
}

fun primeNumber(num:Int){

    var flag=false
    
    if(num==0|| num==1){
        println("Not a prime Number")
    }
    for(i in 2..num/2){
        if(num%i==0){
            flag=true
            break
        }
       }
       if(!flag){
        println(" $num prime number")
    }else{
        println(" $num Not a prime number")
    }

}