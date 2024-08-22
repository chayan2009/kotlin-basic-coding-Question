fun main(args: Array<String>) {
    
    val capitals=hashMapOf<String,String>()
    capitals.put("Nepal", "Kathmandu")
    capitals.put("India", "New Delhi")
    capitals.put("United States", "Washington")
    capitals.put("England", "London")
    capitals.put("Australia", "Canberra")

    println("@@@capitals:: $capitals")

    val result=capitals.toList().sortedBy { (_,Key)->Key}.toMap()
    println("@@@result:: $result")

    for(entry in result){
        println("key:: $entry.key")
        println("value:: $entry.value")
    }
    
}