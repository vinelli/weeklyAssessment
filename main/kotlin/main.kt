
fun main() {

}

fun loveCalculator(flower1: Int, flower2: Int): Boolean{
    return(flower1 % 2 != flower2 % 2)
}

fun loveCal(flower1: Int, flower2: Int) {
    var result = if (flower1 % 2 != flower2 % 2) {
        println("true")
    } else {
        println("false")
    }
}