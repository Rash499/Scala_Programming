error id: file:///C:/Users/PR/OneDrive/Documents/Scala/LabSheet01.scala:[1444..1447) in Input.VirtualFile("file:///C:/Users/PR/OneDrive/Documents/Scala/LabSheet01.scala", "import scala.math._

object LabSheet01{

    //Question 01 function for calculate the area of a disk
    def AreaOfDisk(r : Int): Double = Pi * r * r

    //Question 02 function for celsius to fahrenheit
    def CelsiusToFahrenheit(c : Double) : Double = c*1.800 +32.00

    //Question 03 function to calculate the total volume of a sphere
    def VolumeOfSphere(r1 : Int) : Double = (4/3) * Pi * r1 * r1* r1

    //Question 04

    //function to claculate price for coverpage without discount
    def CoverPrice(price: Double, Quantity: Int) : Double = price * Quantity
    //function to calculate the discount
    def Discount(totalCoverprice : Double , discount : Double): Double = totalCoverprice * (1-discount);
    //function to calculate the total coverprice with discount
    def totCoverPrice(c1:Double , c2:Double ) : Double = c1 - c2
    //function to calculate the shipping cost
    def shippingcost(Quantity:Int) : Double =
        //first 50 copy cost is RS.3.00 
        //quantity is less than 50
        if(Quantity <= 50){
            3*Quantity
        }
        else{
            3*50 + (Quantity - 50)*0.75
        }
    //function to calculate the total price adding coverprice and shipping cost
    def totlcost(c3:Double,c4:Double):Double = c3 + c4

    //Question 5

    def easypacetime(Distance : Double,speed:Double) : Double = Distance * speed
    def
    //main function
    def main(args: Array[String]){
        println(AreaOfDisk(5))
        println(CelsiusToFahrenheit(35))
        println(VolumeOfSphere(5))
        //println(totlcost(totCoverPrice(CoverPrice(24.95,60),Discount(CoverPrice(24.95,60),0.4)),shippingcost(60)))
    }

}")
file:///C:/Users/PR/OneDrive/Documents/Scala/LabSheet01.scala
file:///C:/Users/PR/OneDrive/Documents/Scala/LabSheet01.scala:40: error: expected identifier; obtained def
    def main(args: Array[String]){
    ^
#### Short summary: 

expected identifier; obtained def