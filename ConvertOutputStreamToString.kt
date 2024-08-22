

import java.io.ByteArrayOutputStream
fun main(){
    println("Kotlin Program to Convert OutputStream to String")

    val stream=ByteArrayOutputStream()
    val line="hello There"
    stream.write(line.toByteArray())
    val finalString=String(stream.toByteArray())
    println("finalString :: $finalString")
}