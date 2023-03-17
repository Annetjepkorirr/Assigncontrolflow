fun main(){
    numbers()
    println(names(arrayOf("Fortuner","Tesla","Chevrolet","Mazda","Eclipse Cross")))

    drinks(5)
    drinks(14)
    drinks(40)
//    println(names(arrayOf("Fortuner","Tesla","Chevrolet","Mazda","Eclipse Cross")))
    line()



}
//Create a function that prints out all the odd numbers between 1 and 100
fun numbers(){
    for (numbers in 1..100){
        if(numbers%2 !=0){
            println("Odd")
        }
        else{
            println("Even")
        }
    }

}

//Create a function that takes in an array of names and returns the number of
//names longer than 5 characters

fun names(carNames:Array<String>):Int{
    var m = 0
    carNames.forEach { n ->
        if (n.length > 5) {
            m++
        }
    }
    return m
}
//You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but ovr the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bttle of coca Cola. Create a function that will make these
//decisions, prinng out the name of the drink each person gets according to
//their age


fun drinks(age:Int) {
    when (age) {
        in 0..6 -> println("glass of milk")
        in 7..15 -> println("fanta orange")
        else -> println("coca cola")

    }
}

//Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number.
fun line(){
    for(line in 1..100){
        if (line %3==0){
            println("Fizz")
        }else if (line%5==0){
            println("Buzz")
        }else if (line %3==0 && line %5==0){
            println("FizzBuzz")
        }else{
            println(line)
        }
    }
}
