fun main() {
    val array1 = arrayOf(1, 2, 4, 5, 6, 7, 7, 8, 81)
    val array2 = arrayOf(12, 23, 4, 5, 64, 70, 7, 8, 81, 45)
    val result = mutableSetOf<Int>()  

    //Appraoch-1
    for (i in array1.indices) {
        for (j in array2.indices) {
            if (array1[i] == array2[j]) {
                result.add(array1[i])  
            }
        }
    }
    println("Common elements in the arrays: $result")

    ////Appraoch-2
    val resultSet=findCommonElement(array1,array2)
    println("Common elements in the arrays using set: $resultSet")

    //Approach-3
    val resultMap=findCommonElementwithMap(array1,array2)
    println("Common Elements: ${resultMap.joinToString(", ")}")  

}

fun findCommonElement(array1:Array<Int>,array2:Array<Int>):Set<Int>{
    val set1=array1.toSet()
    val set2=array2.toSet()
    return set1.intersect(set2)
}

fun findCommonElementwithMap(array1:Array<Int>,array2:Array<Int>):Array<Int>{

    val map=mutableMapOf<Int,Int>()
    val commonelements=mutableListOf<Int>()
        // Count the frequency of each element in the first array

        for(num in array1){
            map[num]=map.getOrDefault(num, 0)+1
            print(map[num])
        }
            // Check if elements of the second array are present in the map

         for(num in array2){

            if(map.containsKey(num)&& map[num]!!>0){
                commonelements.add(num)
                map[num]=map[num]!!-1
            }
         }

         return commonelements.toTypedArray()
}