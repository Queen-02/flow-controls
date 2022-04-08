fun main(){
    //question one
    oddNumbers()

    //question two
    var length = arrayOfNames(arrayOf("Jane", "Amanda", "Peter", "Zuriel", "Nathan", "Alexander"))
    println(length)

    //Question three
    servesDrinks()

    //Question four
    fizzbuzz()
}
//a function that prints out all the odd numbers between 1 and 200
fun oddNumbers(){
    for (number in 1..20){
        if (number%2!=0){
            println(number)
        }
    }
}
//function that takes in an array of names and returns
// the number of names longer than 5 characters
fun arrayOfNames(names: Array<String>): Int{
    var number = 0
    names.forEach { name ->
        if (name.length >= 5){
            number++
        }
    }
    return number
}

//You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca cola. Create a function that will make these decisions,
//printing out the name of the drink each person gets according to their age.

fun servesDrinks(){
    var age = 20
    if (age<6){
        println("Glass of milk")
    }
    else if (age<15 && age >6){
        println("Bottle of Fanta Orange")
    }
    else{
        println("Bottle of Coca-Cola")
    }
}

//Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number
fun fizzbuzz(){
    for (num in 1..100){
        if (num%3==0 || num%5==0){
            println("Fizz")
        }
        else if (num%3==0 &&num%5==0){
            println("FizzBuzz")
        }
        else {
            println(num)
        }

    }
}





















