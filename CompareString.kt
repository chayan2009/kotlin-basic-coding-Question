fun main(){

    println("Kotlin Program to Compare Strings")
    
    val style="Bold"
    val style1="Bold"

    //apprach -1

    // if(style==style1){
    //     println("Equal")
    // }else{
    //     println("Not Equal")

   //apprach -2
    if (style.equals(style1))
        println("Equal")
    else
        println("Not Equal")


         //apprach -3

         val style2 = buildString { "Bold" }
         val style3 = buildString { "Bold" }
    if (style2 === style3)
    println("Equal")
else
    println("Not Equal")
    
    }

   


