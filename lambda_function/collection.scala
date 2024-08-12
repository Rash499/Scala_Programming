object collection{
    def transform(l:List[Int], f:Int => Double) = l.map(f)

    def main(args:Array[String])={
        val res = transform(List(34,56,78), r => 3.14*r*r)
        println(res)
    }
}