error id: file:///C:/Users/PR/OneDrive/Documents/Scala/LabSheet03.scala:[150..153) in Input.VirtualFile("file:///C:/Users/PR/OneDrive/Documents/Scala/LabSheet03.scala", "object LabSheet03{

    def reverse(s :String): String ={
        if (s.isEmpty) ""
        else reverse(s.tail) + s.head
    }

    def 
    def main(args: Array[String]): Unit={
        println("Enter a string: ")
        val input = scala.io.StdIn.readLine()
        println(s"Original: $input")
        println(s"Reversed: ${reverse(input)}")
    }
}")
file:///C:/Users/PR/OneDrive/Documents/Scala/LabSheet03.scala
file:///C:/Users/PR/OneDrive/Documents/Scala/LabSheet03.scala:9: error: expected identifier; obtained def
    def main(args: Array[String]): Unit={
    ^
#### Short summary: 

expected identifier; obtained def