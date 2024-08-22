fun main(){
    println("Lookup enum by String value")
    val style="bold"
    val textStyle=TextStyle.valueOf(style.uppercase())
    println("textstyle:: $textStyle")
}

enum class TextStyle{
    BOLD,ITALIC,UNDERLINE,STRIKETHRUGH
}