error id: file:///C:/Users/PR/OneDrive/Documents/Scala/LabSheet03.scala:[858..861) in Input.VirtualFile("file:///C:/Users/PR/OneDrive/Documents/Scala/LabSheet03.scala", "object LabSheet03{

    def reverse(s :String): String ={
        if (s.isEmpty) ""
        else reverse(s.tail) + s.head
    }

    def checkStrings(strings: List[String]): List[String] = {
        strings match{
            case Nil => Nil //check the list is empty
            case head :: tail => //pattern match to extract head and tail
                if(head.length > 5) head :: checkStrings(tail) //length > 5 include it in the result list and
                                        //recursively call checkStrings(tail)
                else checkStrings(tail) //exclude it from the result list and recursively call the function
        }
    }

    def mean(num1: Int, num2: Int): Double= {
        val avg = (num1 + num2)/2.0
        BigDecimal(avg).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
    }

    def 
    def main(args: Array[String]): Unit={
        println("Enter a string: ")
        val input = scala.io.StdIn.readLine()
        println(s"Original: $input")
        println(s"Reversed: ${reverse(input)}")
        println()
        println("Enter strings: ")
        val inputstrings = scala.io.StdIn.readLine().split(" ").toList
        val result = checkStrings(inputstrings)
        println(s"Original List: $inputstrings")
        println(s"Result List: $result")
        println()
        println("Enter the first number:")
        val num1 = scala.io.StdIn.readInt()
        println("Enter the second number:")
        val num2 = scala.io.StdIn.readInt()
        val result1 = mean(num1,num2)
        println(f"Arithmatic mean is $result1%.2f")

    }
}")
file:///C:/Users/PR/OneDrive/Documents/Scala/LabSheet03.scala
file:///C:/Users/PR/OneDrive/Documents/Scala/LabSheet03.scala:24: error: expected identifier; obtained def
    def main(args: Array[String]): Unit={
    ^
#### Short summary: 

expected identifier; obtained def