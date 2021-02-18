package com.example.firstapp
import android.util.Log

private const val TAG = "song.kt"
fun main(args: Array<String>) {

    var artistName: String = "Adele"
//    Log.d(TAG,"Artist name is "+ artistName)
    println("Artist name is "+ artistName)
    val songTitle: String = "Some One Love You"
    println("Music title is "+songTitle)
    var realeaseYearDate: Int = 2011
    println("Realease Year is "+realeaseYearDate)
    var album: String = "Album Love Comes to Town"
    println("Album is "+album)
    var duration: String = "4.44"
    println("Duration is "+duration+" minutes")
    var isInActuality: Boolean = true
    println("is in actuality "+if(isInActuality) "True" else "False")
    var firstLetter: Char = 'A'
    println("The first letter is "+firstLetter)
    var yearLeft: Int = 2021 - realeaseYearDate
    println("Coming since is "+yearLeft+" Years")
    var likesNombers: Float = 15.65f
    println("Number of Like: "+likesNombers+"K")
    val unlike: Double = 1.7
    println("Number of Unlike: "+unlike+"K")
}