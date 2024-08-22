fun main(){

    print("Remove element from Array")
    var array=arrayOf("chayan","aa","chayan","xx","yy","asss","asdasdas","sadasdas","us","us",)
    //approach-1
    val result=array.distinct()
    println("result:: $result")

    // Approach-2
    val result1=array.toSet()
    println("result:: $result1")

    //apprach -3

    val resultList = mutableListOf<String>()
    for (i in array) {
        var isDuplicate = false
        for (j in resultList) {
            if (i == j) {
                isDuplicate = true
                break
            }
        }
        if (!isDuplicate) {
            resultList.add(i)
        }
    }
    var arrayWithoutDuplicates=resultList.toTypedArray()
    println("Array without Duplicates: ${arrayWithoutDuplicates.joinToString(", ")}")
}