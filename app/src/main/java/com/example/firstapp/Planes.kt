package com.example.firstapp

open class Planes( make: String, model: String, year: String, weight: String): Vehicle( make, model, year, weight) {

    var isDriving : Boolean = false

    fun flying(){
        this.isDriving = true
        this.tripsSinceMaintenance += 1

        if(this.tripsSinceMaintenance >= 100){
            this.needsMaintenance = true
        }

    }

    fun landing(){
        this.isDriving = false
    }

    fun flyPlane(plane: Planes, frequence: Int){
        var current: Int = 1
        while (current<=frequence){
            plane.flying()
            current+=1
        }
    }
}