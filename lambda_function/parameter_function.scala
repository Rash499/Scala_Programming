object parameter_function{
    def transform(x:Int, f:Int => Double)=f(x)

    def main(args:Array[String])={
        val res = transform(2, r=> 3.14*r*r)
        print(res)
    }
}