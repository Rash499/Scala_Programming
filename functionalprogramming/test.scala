object test{
    def attendes(price : Int) : Int = 120 + (15-price)/5*20
    def income(price: Double, attendes: Int) : Double = price*attendes
    def cost(attendes: Int) : Double = 500 + attendes*3
    def profit(income:Double, cost:Double) : Double = income-cost

    def main(args: Array[String]): Unit={
        println(s"profit: ${profit(income(15.00,attendes(15)),cost(attendes(15)))}")
    }

}