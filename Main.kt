fun main() {
    val trickFunction = trick
    trick()
    trickFunction()
    treat()
}

val trick = {
    println("No treats!")
}

val treat: () -> Unit = {
    println("Have a treat!")
}