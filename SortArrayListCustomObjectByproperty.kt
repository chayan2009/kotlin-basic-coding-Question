import java.util.*
fun main(){
    println("Sort ArrayList of Custom Objects By Property")
    val list=ArrayList<CustomClass>()
    list.add(CustomClass("A"))
    list.add(CustomClass("aa"))
    list.add(CustomClass("bb"))
    list.add(CustomClass("ff"))
    list.add(CustomClass("eee"))
    list.add(CustomClass("cc"))
    list.add(CustomClass("qqq"))
    list.add(CustomClass("ww"))

    var sortedList=list.sortedWith(compareBy({it.name}))
    for(obj in sortedList){
        println(obj.name)
    }
}
data class CustomClass(var name:String)
