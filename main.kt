fun main() {

    for (numbers in 1..100){
        if(numbers % 3 == 0){
            println("Fizz")
        }else{
            println(numbers)
        }
    }

    for (fiverr in 1..100){
        if(fiverr % 5 == 0){
            println("Buzz")
        }else{
            println(fiverr)
    }
}

    for (fifth in 1..100){
        if(fifth % (3*5) == 0){
            println("FizzBuzz")
        }else{
            println(fifth)
        }
    }



fun inverse(letter: String): String {
    var rev = ""

    for (i in letter.length - 1 downTo 0) {
        rev += letter[i]
    }
    return rev
}
    fun inverse(){
        val letter = "Good Food"

        val rev = inverse(letter)
        println(rev)
    }
}