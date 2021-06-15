fun main() {
    var fnum : Int = 25
    var snum : Int = 35
    var tnum : Int = 15
    var fonum : Int = 20






    if(fnum < tnum){
        println("fnum is less than snum")
    }else{
        println("fnum is larger than snum")

    }


    if(fonum > tnum){
        println("fonum is greater than tnum")
    }


    if(fnum + tnum < snum){
        println("snum is greater than the sum of tnum and fnum")
    }else{
        println("null")
    }


    if(snum >= fonum){
        println("snum is a large sum")
    }else{
        println("null")
    }

    if(fnum == fonum){
        println("both numbers are equal")
    }else{
        println("both numbers are not equal")
    }

    if(snum - tnum >= 10){
        println("yes")
    }else{
        println("no")


        if(tnum + fonum < snum + tnum){
            println("yay")
        }else{
            println("nay")


            if(snum - fonum - tnum < 0){
                println("yay")
            }else{println("nay")


            }

            if(snum > 50){
                println("snum is greater than 50")
            }else{
                println("snum is less than 50")
            }

            if(tnum + fonum + snum + fnum > 100){
                println("sum of all numbers is above 100")
            }else{
                println("the sum is not greater than 100")
            }


        }

        var myTimeTable : String = "tuesday"
        var myDayofClass : String = when(myTimeTable){
            "Monday" -> "Attend Class"
            "Tuesday" -> "Attend Class"
            "Wednesday" -> "Attend Class"
            else -> "Do not go to class"


        }
        var myCalendar : String = "May"
        var rainyMonths : String = when(myCalendar){
            "January" -> "Dry"
            "June" -> "Rainy"
            "December" -> "Harmattan"
            "July" -> "Rainy"
            else -> "Inconclusive"

        }

        var myComputer : String = "Keyboard"
        var my_components : String = when(myComputer){
            "Keyboard" -> "check"
            "mouse" -> "check"
            else -> "not in store"
        }
        var foodMenu : String = "day6"
        var food_to_eat : String = when(foodMenu){
            "day1" -> "rice"
            "day2" -> "beans"
            "day5" -> "bread"
            "day6" -> "moi moi"
            else -> "go hungry"
        }

        var myFavArtist : String = "Drake"
        var myFavSong : String = when(myFavArtist){
            "maroon5" -> "love somebody"
            "drake" -> "Pound Cake"
            "burna boy" -> "On the Low"
            else -> "play any Young Thug"
        }

    }
}


fun vac() {
    for (num in 1 .. 100){
        print(num)
    }
    for (x in 1 .. 10){
        if(x == 4){
            continue
        }
        if (x == 5){
            continue}
        print(x)
    }
}

fun numb(){
    var numbers : Array<Int> = arrayOf(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30)
    var eNumbers : Int = 0
    var oNumbers : Int = 0

    for(eNumbers in 10..20){
        if(eNumbers % 2 == 0)
            println(eNumbers)
    }
    for(oNumbers in 20..30){
        if(oNumbers % 2 == 1)
            println(oNumbers)
    }
    class House {
        var color: String = ""
        var type: String = ""
        var colorOfGate: String = ""
        var noOfRoooms: Int = 0
        var noOfResidents: Int = 0

        constructor(color: String, type: String, colorOfGate: String, noOfRooms: Int, noOfResidents: Int) {
            this.noOfRoooms = noOfRooms
            this.color = color
            this.colorOfGate = colorOfGate
            this.noOfResidents = noOfResidents
            this.colorOfGate = colorOfGate

        }

        fun getNoOfRooms(): Int {
            return this.noOfRoooms
        }

        fun gettype(): String {
            return this.type
        }

        fun getcolor(): String {
            return this.color
        }

        fun getcolorofgate(): String {
            return this.colorOfGate
        }

        fun getnoOfResidents(): Int {
            return this.noOfResidents
        }
    }

    fun main() {
        var aHouse : House = House(color = "Blue", type = "Bungalow", colorOfGate = "Black", noOfRooms = 3,noOfResidents = 6)
        println(aHouse.getNoOfRooms())
        println(aHouse.getcolor())
        println(aHouse.getcolorofgate())
        println(aHouse.getnoOfResidents())
        println(aHouse.gettype())
    }


    class MobilePhones{
        private var brand : String = ""
        private var price : Int = 0
        private var color : String = ""
        private var isIt4gEnabled : Boolean = false
        private var networkProvider : String = "" }
        constructor(var = brand: String, price: Int, color: String, isIt4gEnabled: Boolean,
                    networkProvider: String){
            this.brand = brand
            this.price = price
            this.color = color
            this.isIt4gEnabled = isIt4gEnabled
            this.networkProvider = networkProvider
        }
        fun phone(){
            var aPhone : MobilePhones = MobilePhones(brand = "Lg", price = 35000, color = "white",
                isIt4gEnabled = true, networkProvider = "MTN")
            println(aphone.getbrand())
            println(aphone.getprice())
            println(aphone.getcolor())
        }




    }




