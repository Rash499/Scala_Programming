import scala.math._

object test {

  // Function to calculate the area of a disk
  def areaOfDisk(r: Double): Double = Pi * r * r

  // Function to convert Celsius to Fahrenheit
  def celsiusToFahrenheit(celsius: Double): Double = celsius * 1.8 + 32

  // Function to calculate the volume of a sphere
  def volumeOfSphere(r: Double): Double = (4.0 / 3.0) * Pi * pow(r, 3)

  // Function to calculate the total wholesale cost of books
  def totalWholesaleCost(copies: Int): Double = {
    val coverPrice = 24.95
    val discount = 0.40
    val discountedPrice = coverPrice * (1 - discount)
    val shippingFirst50 = 3.0
    val shippingAdditional = 0.75

    if (copies <= 50) {
      discountedPrice * copies + shippingFirst50
    } else {
      discountedPrice * copies + shippingFirst50 + (copies - 50) * shippingAdditional
    }
  }

  // Function to calculate the total running time
  def totalRunningTime(): Int = {
    val easyPaceTimePerKm = 8
    val tempoPaceTimePerKm = 7
    val easyDistance = 2
    val tempoDistance = 3

    (easyPaceTimePerKm * easyDistance * 2) + (tempoPaceTimePerKm * tempoDistance)
  }

  def main(args: Array[String]): Unit = {
    // Area of a disk with radius 5
    println(s"Area of a disk with radius 5 is ${areaOfDisk(5)}")

    // Convert 35°C to Fahrenheit
    println(s"35°C is equivalent to ${celsiusToFahrenheit(35)}°F")

    // Volume of a sphere with radius 5
    println(s"Volume of a sphere with radius 5 is ${volumeOfSphere(5)}")

    // Total wholesale cost for 60 copies of a book
    println(s"Total wholesale cost for 60 copies is Rs. ${totalWholesaleCost(60)}")

    // Total running time
    println(s"Total running time is ${totalRunningTime()} minutes")
  }
}
