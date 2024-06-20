object activity2{

    def max(x:Int, y:Int): Int = 
        if(x > y){
            return x
        }
        else{
            return y
        }

    def main(args: Array[String]): Unit={
        println(s"${max(12,10)}")
    }
    }
   

