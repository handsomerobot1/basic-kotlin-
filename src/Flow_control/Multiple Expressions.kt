package Flow_control

fun main(args: Array<String>) {

    val a = -10
    val b =  20

    val max = if (a>b) {
        println("$a is larger then $b")
        println("max variable hold value of a.")
        a
    } else {
        println("$b is larger then $a")
        println("max variable hold on b")
        b
    }

    println("max=$max")
}