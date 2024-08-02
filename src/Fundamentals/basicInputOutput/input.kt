package Fundamentals.basicInputOutput

import java.util.Scanner

fun main(){
    println("enter text: ")
    val stringInput= readLine()
    println("you entered:$stringInput")
    val reader =Scanner(System.`in`)
    println("enter number")

    var integer:Int=reader.nextInt()
    println("you entered:$integer")
}