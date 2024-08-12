error id: file:///C:/Users/PR/OneDrive/Documents/Scala/Labsheet_04/Question_02.scala:[8..9) in Input.VirtualFile("file:///C:/Users/PR/OneDrive/Documents/Scala/Labsheet_04/Question_02.scala", "object  {
  
  def checkNumber(input: Int): Unit = {
    input match {
      case x if x <= 0 => println("Negative/Zero is input")
      case x if x % 2 == 0 => println("Even number is given")
      case _ => println("Odd number is given")
    }
  }

  def main(args: Array[String]): Unit = {
    if (args.isEmpty) {
      println("Please provide an integer input.")
    } else {
      val input = args(0).toInt
      checkNumber(input)
    }
  }
}
")
file:///C:/Users/PR/OneDrive/Documents/Scala/Labsheet_04/Question_02.scala
file:///C:/Users/PR/OneDrive/Documents/Scala/Labsheet_04/Question_02.scala:1: error: expected identifier; obtained lbrace
object  {
        ^
#### Short summary: 

expected identifier; obtained lbrace