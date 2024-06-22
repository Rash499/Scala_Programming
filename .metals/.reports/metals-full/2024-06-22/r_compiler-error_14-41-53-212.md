file:///C:/Users/PR/OneDrive/Documents/Scala/Labsheet02.scala
### java.lang.RuntimeException: ambiguous mend file%3A%2F%2F%2FC%3A%2FUsers%2FPR%2FOneDrive%2FDocuments%2FScala%2FLabsheet02.scala@434..434  file%3A%2F%2F%2FC%3A%2FUsers%2FPR%2FOneDrive%2FDocuments%2FScala%2FLabsheet02.scala@432..434 ca

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 2.13.12
Classpath:
<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.12\scala-library-2.13.12.jar [exists ]
Options:



action parameters:
uri: file:///C:/Users/PR/OneDrive/Documents/Scala/Labsheet02.scala
text:
```scala
object Labsheet02{

    //Question 3
    def calculatetotalsalary(normalhours: Int, othours: Int): Int = (normalhours*250 + othours*85)*4
    def taxformonth(totalsalary: Int, tax: Double) : Double = totalsalary*(tax/100)
    def calculatetakehomesalary(totalsalary: Int, taxfees: Double): Double = totalsalary- taxfees 

    //Question 4
    def calculateattendance(ticketprice: Int): Int = 120 + (15-ticketprice)
    def ca;
    def calculatetotalcost(attendees: Int) : Int = 500 + attendees*3
    def profit(totalincome : Int, totalcost: Int): Int = totalincome-totalcost

    def main(args: Array[String]):Unit = {

        //Question 1
        /*
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
        println(++i*n)
        */
        //Question 2
        /*
        var a:Int = 2
        var b:Int = 3
        var c1:Int = 4
        var d:Int = 5
        var k1:Float = 4.3f

        println(--b*a + c*d--);
        println(a++);
        println(-2*(g-k)+c);
        println(c=c++);
        println(c=++c*a++);
        */
        println(s"${calculatetakehomesalary(calculatetotalsalary(40,30),taxformonth(calculatetotalsalary(40,30),12.0))}");
        println(s"${profit()}")
    }
}
```



#### Error stacktrace:

```
scala.sys.package$.error(package.scala:27)
	scala.meta.internal.semanticdb.scalac.TextDocumentOps$XtensionCompilationUnitDocument$traverser$1$.indexName(TextDocumentOps.scala:86)
	scala.meta.internal.semanticdb.scalac.TextDocumentOps$XtensionCompilationUnitDocument$traverser$1$.apply(TextDocumentOps.scala:170)
	scala.meta.transversers.Traverser.applyRest(Traverser.scala:4)
	scala.meta.transversers.Traverser.apply(Traverser.scala:4)
	scala.meta.internal.semanticdb.scalac.TextDocumentOps$XtensionCompilationUnitDocument$traverser$1$.apply(TextDocumentOps.scala:175)
	scala.meta.transversers.Traverser.$anonfun$apply$1(Traverser.scala:4)
	scala.meta.transversers.Traverser.$anonfun$apply$1$adapted(Traverser.scala:4)
	scala.collection.immutable.List.foreach(List.scala:333)
	scala.meta.transversers.Traverser.apply(Traverser.scala:4)
	scala.meta.transversers.Traverser.applyRest(Traverser.scala:4)
	scala.meta.transversers.Traverser.apply(Traverser.scala:4)
	scala.meta.internal.semanticdb.scalac.TextDocumentOps$XtensionCompilationUnitDocument$traverser$1$.apply(TextDocumentOps.scala:175)
	scala.meta.transversers.Traverser.applyDefn(Traverser.scala:4)
	scala.meta.transversers.Traverser.apply(Traverser.scala:4)
	scala.meta.internal.semanticdb.scalac.TextDocumentOps$XtensionCompilationUnitDocument$traverser$1$.apply(TextDocumentOps.scala:175)
	scala.meta.transversers.Traverser.$anonfun$apply$1(Traverser.scala:4)
	scala.meta.transversers.Traverser.$anonfun$apply$1$adapted(Traverser.scala:4)
	scala.collection.immutable.List.foreach(List.scala:333)
	scala.meta.transversers.Traverser.apply(Traverser.scala:4)
	scala.meta.transversers.Traverser.applyRest(Traverser.scala:4)
	scala.meta.transversers.Traverser.apply(Traverser.scala:4)
	scala.meta.internal.semanticdb.scalac.TextDocumentOps$XtensionCompilationUnitDocument$traverser$1$.apply(TextDocumentOps.scala:175)
	scala.meta.internal.semanticdb.scalac.TextDocumentOps$XtensionCompilationUnitDocument.toTextDocument(TextDocumentOps.scala:179)
	scala.meta.internal.pc.SemanticdbTextDocumentProvider.textDocument(SemanticdbTextDocumentProvider.scala:54)
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$semanticdbTextDocument$1(ScalaPresentationCompiler.scala:462)
```
#### Short summary: 

java.lang.RuntimeException: ambiguous mend file%3A%2F%2F%2FC%3A%2FUsers%2FPR%2FOneDrive%2FDocuments%2FScala%2FLabsheet02.scala@434..434  file%3A%2F%2F%2FC%3A%2FUsers%2FPR%2FOneDrive%2FDocuments%2FScala%2FLabsheet02.scala@432..434 ca