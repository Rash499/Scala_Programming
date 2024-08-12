error id: file:///C:/Users/PR/OneDrive/Documents/Scala/Labsheet_04/Question03.scala:[7..8) in Input.VirtualFile("file:///C:/Users/PR/OneDrive/Documents/Scala/Labsheet_04/Question03.scala", "object {

  // Method to convert a string to uppercase
  def toUpper(name: String): String = {
    name.toUpperCase
  }

  // Method to convert a string to lowercase
  def toLower(name: String): String = {
    name.toLowerCase
  }

  // Method to apply a formatting function to a string
  def formatNames(name: String)(formatFunc: String => String): String = {
    formatFunc(name)
  }

  def main(args: Array[String]): Unit = {
    // Test inputs
    val benny = formatNames("Benny")(toUpper)
    val niroshan = formatNames("Niroshan")(name => toUpper(name.substring(0, 2)) + name.substring(2))
    val saman = formatNames("Saman")(toLower)
    val kumara = formatNames("Kumara")(name => name.substring(0, 1) + toUpper(name.substring(name.length - 1)))

    // Print the formatted names
    println(benny)
    println(niroshan)
    println(saman)
    println(kumara)
  }
}

")
file:///C:/Users/PR/OneDrive/Documents/Scala/Labsheet_04/Question03.scala
file:///C:/Users/PR/OneDrive/Documents/Scala/Labsheet_04/Question03.scala:1: error: expected identifier; obtained lbrace
object {
       ^
#### Short summary: 

expected identifier; obtained lbrace