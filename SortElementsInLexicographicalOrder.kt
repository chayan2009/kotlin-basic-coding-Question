fun main(){

    val words=arrayOf("ruby","c","java","python","go","sql")

    for(i in 0..words.size){
        for(j in i+1..words.size.minus(1)){
            if (words[i].compareTo(words[j]) > 0) {
                val temp=words[i]
                words[i]=words[j]
                words[j]=temp
            }
        }
    }
    println("In lexicographical order:")
    for (i in 0..words.size) {
        println(words[i])
    }
}