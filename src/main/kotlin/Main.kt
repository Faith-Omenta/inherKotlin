fun main() {
    var car=Car("Porsche","carrera","black",3)
    car.carry(3)
    car.carry(5)


    var bus=Bus("matrix","toyota","white",62)
    var maximum=bus.maxTripFare(arrayOf
        (350.0,200.0,340.0))
    println(maximum)
    println(bus.calculateParkingFees(6))
}

open class Machine(var make:String,var model:String,var color:String,var capacity:Int){
open fun carry(people:Int){
        var x= people - capacity
        if (people <= capacity){
            println("carrying $people passengers")
        }else{
            println("Over capacity by $x people")
        }
    }
}

//Create a class Car with the following attributes: make, model, color, capacity.
//It has these functions:
//carry(people: Int) : Prints out “Carrying $people passengers” if the
//number of people is within its capacity else it prints out “Over capacity
//by $x people” where x is the number of people exceeding its capacity
class Car(make:String, model:String, color:String,capacity:Int):Machine(make,model,color,capacity){
    override  fun carry(people:Int){
        var x= capacity
        if (people<=(capacity)){
            println("carrying $people passengers")
        }else{
            val x=people-capacity
            println("Over capacity by $x people")
        }
    }
}
//Create a class Bus with the same attributes and functions as the Car class.
//In addition, it has another method called maxTripFare(fare: Double) that
//calculates and returns the maximum amount of fare that can be collected per
//trip.
class Bus(make:String,model:String,color:String,capacity:Int):Machine(make,model,color,capacity){
    fun maxTripFare(fare:Array<Double>):Double{
        var trip=fare.max()
        return trip
    }
//The bus’ calculateParkingFees method returns the product of hours and
//the capacity of the bus
fun calculateParkingFees(hours: Int):Int{
        var parkingFees=hours*capacity
        return parkingFees
    }
}