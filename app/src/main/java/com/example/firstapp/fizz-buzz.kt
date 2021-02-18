package com.example.firstapp

fun main(args: Array<String>) {
    var maxNumber: Int = 100
    var current: Int = 1
    var count: Int = 0
    var num: Int = 0
    while (current<=maxNumber){
        count += 1
        if (current % 3 ==0){

            println("Fizz Yeah the number is "+current)

        }else if (current % 4 ==0){

            println("Buzz Yeah the number is "+current)
        }
        if (current % 3 ==0 && current % 5 ==0){

            println("FizzBuzz Yeah the number is "+current)

        }
        num = maxNumber/2
        if (num % current == 1) {
            println("Prime The number "+current+" is Prime")
        }
//        println("Number: "+ count)
        current+=1
    }

//    println("Five continents  are "+ continents)
}

infix fun Int.fmod(other: Int) = ((this % other) + other) % other
