

import java.util.concurrent.TimeUnit
fun main(){
    
    val milliseconds:Long=200000
    
    val minitues= TimeUnit.MILLISECONDS.toMinutes(milliseconds)
    println("minitues::  $minitues")

    val minutes:Long=8
    val secconds=TimeUnit.MINUTES.toSeconds(minutes)
    println("Seconds:$secconds")

    val milliseconds1: Long = 1000000

    val minutes1 = milliseconds / 1000 / 60
    val seconds = milliseconds / 1000 % 60

    println("$milliseconds1 Milliseconds1 = $minutes1 minutes1 and $seconds seconds.")

}