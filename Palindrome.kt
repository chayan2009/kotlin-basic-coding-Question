fun main(){
 
    var number=191
    var reversed=0
    var originalNum:Int
    originalNum=number

    while(number!=0){
        var remainder=number%10
        reversed=reversed*10+remainder
        number/=10
    }
    if(originalNum==reversed){
        print("Palindrome")
    }else{
        print("Not Palindrome")
    }
}