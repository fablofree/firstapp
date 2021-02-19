package com.example.firstapp

open class Cars( make: String, model: String, year: String, weight: String): Vehicle( make, model, year, weight) {

    var isDriving : Boolean = false

    fun drive(){
        this.isDriving = true
        this.tripsSinceMaintenance += 1

        if(this.tripsSinceMaintenance >= 100){
            this.needsMaintenance = true
        }
    }

    fun stop(){
        this.isDriving = false
    }

    fun repair(){
        this.needsMaintenance = false
        this.tripsSinceMaintenance = 0
    }


    fun driveCar(car: Cars, frequence: Int){
        var current: Int = 1
        while (current<=frequence){
            car.drive()
            current+=1
        }
    }
}