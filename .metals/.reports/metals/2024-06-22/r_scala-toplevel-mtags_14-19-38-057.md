error id: file:///C:/Users/PR/OneDrive/Documents/Scala/Labsheet02.scala:[244..247) in Input.VirtualFile("file:///C:/Users/PR/OneDrive/Documents/Scala/Labsheet02.scala", "object Labsheet02{

    //Question 2
    def calculatetotalsalary(normalhours: Int, othours: Int): Int = (normalhours*250 + othours*85)*4
    def taxformonth(totalsalary: Int, tax: Double) : Double = totalsalary*(tax/100)
    def  

    def main(args: Array[String]):Unit = {
        var i:Int = 2
        var j:Int = 2
        var k:Int = 2
        var m:Int = 5
        var n:Int = 5
        var f:Float = 12.0f
        var g:Float = 4.0f
        var c:Char = 'X'
        
        println(k+12*m)
        println(m/j)
        println(n%j)
        println(m/j*j)
        println(f+10*5+g)
        //println(++i*n)

        var a:Int = 2
        var b:Int = 3
        var c:Int = 4
        var d:Int = 5
        var k:Float = 4.3f

        println(--b*a + c*d--);
        println(a++);
        println(-2*(g-k)+c);
        println(c=c++);
        println(c=++c*a++);
        
    }
}")
file:///C:/Users/PR/OneDrive/Documents/Scala/Labsheet02.scala
file:///C:/Users/PR/OneDrive/Documents/Scala/Labsheet02.scala:8: error: expected identifier; obtained def
    def main(args: Array[String]):Unit = {
    ^
#### Short summary: 

expected identifier; obtained def