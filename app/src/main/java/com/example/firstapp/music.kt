package com.example.firstapp

fun main(args: Array<String>) {
    val genreMusical: String = genre("Slow")
    println("The Genre is: "+ genreMusical)

    val artist: String = artist("John Legend")
    println("The Artist name is: "+ artist)

    val year: String = year("November 2015")
    println("The Year is: "+ year)
}

fun genre(type: String): String {
    return type
}

fun artist(name: String): String {
    return name
}

fun year(year: String): String {
    return year
}