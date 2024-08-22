fun main(){

    val list1=ArrayList<String>()
    list1.add("sachin")
    list1.add("sourav")
    list1.add("sunil")

    val list2=ArrayList<String>()
    list2.add("11")
    list2.add("22")
    list2.add("33")
    
    val joined=ArrayList<String>()
    joined.clear()
    joined.addAll(list1)
    joined.addAll(list1)
    
    println("list1: $list1")
    println("list2: $list2")
    println("joined: $joined")

}
