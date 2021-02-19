package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.text_view)

//        Cars
        val car1 : Cars  = Cars( "Toyota Corola", "Yaris", "2007", "1200");
        var car2 : Cars = Cars( "Mercedes", "Bens", "2000", "1700");
        var car3 : Cars = Cars( "Nissan", "Patrol", "1999", "3500");

//        Planes
        val plane1 : Planes  = Planes( "Boying", "A360", "2015", "9000");
        var plane2 : Planes = Planes( "Airbus", "Blair 40", "2000", "6400");
        var plane3 : Planes = Planes( "Air Force 1", "562", "1994", "5000");

//        Drive cars

//        Drive car 1
        car1.driveCar(car1, 140)
        val car1Make = car1.make
        val car1Model = car1.model
        val car1Year = car1.year
        val car1Weight = car1.weight
        val car1NeedsMaintenance = car1.needsMaintenance
        val car1TripsSinceMaintenance = car1.tripsSinceMaintenance
        Log.d("MainActivity", "Car 1 Make name is: "+car1Make+" Model is: "+car1Model
            +" Year is: "+car1Year+" Weight is: "+car1Weight+" NeedsMaintenance: "+car1NeedsMaintenance
            +" TripsSinceMaintenance: "+car1TripsSinceMaintenance
        )
//        Drive car 2
        car2.driveCar(car2, 89)
        val car2Make = car2.make
        val car2Model = car2.model
        val car2Year = car2.year
        val car2Weight = car2.weight
        val car2NeedsMaintenance = car2.needsMaintenance
        val car2TripsSinceMaintenance = car2.tripsSinceMaintenance
        Log.d("MainActivity", "Car 2 Make name is: "+car2Make+" Model is: "+car2Model
            +" Year is: "+car2Year+" Weight is: "+car2Weight+" NeedsMaintenance: "+car2NeedsMaintenance
            +" TripsSinceMaintenance: "+car2TripsSinceMaintenance
        )
//        Drive car 3
        car3.driveCar(car3, 15)
        val car3Make = car3.make
        val car3Model = car3.model
        val car3Year = car3.year
        val car3Weight = car3.weight
        val car3NeedsMaintenance = car3.needsMaintenance
        val car3TripsSinceMaintenance = car3.tripsSinceMaintenance
        Log.d("MainActivity", "Car 3 Make name is: "+car3Make+" Model is: "+car3Model
                +" Year is: "+car3Year+" Weight is: "+car3Weight+" NeedsMaintenance: "+car3NeedsMaintenance
                +" TripsSinceMaintenance: "+car3TripsSinceMaintenance
        )

//        Planes
        plane1.flyPlane(plane1, 56)
        val plane1Make = plane1.make
        val plane1Model = plane1.model
        val plane1Year = plane1.year
        val plane1Weight = plane1.weight
        val plane1NeedsMaintenance = plane1.needsMaintenance
        val plane1TripsSinceMaintenance = plane1.tripsSinceMaintenance
        Log.d("MainActivity", "Plane 1 Make name is: "+plane1Make+" Model is: "+plane1.model
                +" Year is: "+plane1Year+" Weight is: "+plane1Weight+" NeedsMaintenance: "+plane1NeedsMaintenance
                +" TripsSinceMaintenance: "+plane1TripsSinceMaintenance
        )
        if(plane1.needsMaintenance == true){

            Log.d("MainActivity", "Plane 1 can't fly until it's repaired")
        }
//        Drive car 2
        plane2.flyPlane(plane2, 450)
        val plane2Make = plane2.make
        val plane2Model = plane2.model
        val plane2Year = plane2.year
        val plane2Weight = plane2.weight
        val plane2NeedsMaintenance = plane2.needsMaintenance
        val plane2TripsSinceMaintenance = plane2.tripsSinceMaintenance
        Log.d("MainActivity", "Plane 2 Make name is: "+plane2Make+" Model is: "+plane2Model
                +" Year is: "+plane2Year+" Weight is: "+plane2Weight+" NeedsMaintenance: "+plane2NeedsMaintenance
                +" TripsSinceMaintenance: "+plane2TripsSinceMaintenance
        )
        if(plane2.needsMaintenance == true){

            Log.d("MainActivity", "Plane 2 can't fly until it's repaired")
        }
//        Drive car 3
        plane3.flyPlane(plane3, 15)
        val plane3Make = plane3.make
        val plane3Model = plane3.model
        val plane3Year = plane3.year
        val plane3Weight = plane3.weight
        val plane3NeedsMaintenance = plane3.needsMaintenance
        val plane3TripsSinceMaintenance = plane3.tripsSinceMaintenance
        Log.d("MainActivity", "Plane 3 Make name is: "+plane3Make+" Model is: "+plane3Model
                +" Year is: "+plane3Year+" Weight is: "+plane3Weight+" NeedsMaintenance: "+plane3NeedsMaintenance
                +" TripsSinceMaintenance: "+plane3TripsSinceMaintenance
        )
        if(plane3.needsMaintenance === true){

            Log.d("MainActivity", "Plane 3 can't fly until it's repaired")
        }
    }

    fun clickPress(view: View){

        textView.visibility =View.VISIBLE
//        val textViewText = textView.text.toString()
//        val button = view as Button
//        val buttonText = button.text.toString()
//        textView.text = buttonText
//        Log.d("MainActivity", textViewText)
//        Log.d("MainActivity", textView.toString())
    }
}