file:///C:/Users/PR/OneDrive/Documents/Scala/Labsheet02.scala
### file%3A%2F%2F%2FC%3A%2FUsers%2FPR%2FOneDrive%2FDocuments%2FScala%2FLabsheet02.scala:48: error: Not one of: `$$', `$'ident, `$'this, `$'BlockExpr, `$'_
        println(s"$")
                  ^

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
        println(s"$")
    }
}
```



#### Error stacktrace:

```
scala.meta.internal.tokenizers.Reporter.syntaxError(Reporter.scala:23)
	scala.meta.internal.tokenizers.Reporter.syntaxError$(Reporter.scala:23)
	scala.meta.internal.tokenizers.Reporter$$anon$1.syntaxError(Reporter.scala:32)
	scala.meta.internal.tokenizers.Reporter.syntaxError(Reporter.scala:25)
	scala.meta.internal.tokenizers.Reporter.syntaxError$(Reporter.scala:25)
	scala.meta.internal.tokenizers.Reporter$$anon$1.syntaxError(Reporter.scala:32)
	scala.meta.internal.tokenizers.LegacyScanner.getStringPart(LegacyScanner.scala:598)
	scala.meta.internal.tokenizers.LegacyScanner.fetchDoubleQuote$1(LegacyScanner.scala:347)
	scala.meta.internal.tokenizers.LegacyScanner.fetchToken(LegacyScanner.scala:363)
	scala.meta.internal.tokenizers.LegacyScanner.nextToken(LegacyScanner.scala:201)
	scala.meta.internal.tokenizers.LegacyScanner.foreach(LegacyScanner.scala:912)
	scala.meta.internal.tokenizers.ScalametaTokenizer.uncachedTokenize(ScalametaTokenizer.scala:23)
	scala.meta.internal.tokenizers.ScalametaTokenizer.$anonfun$tokenize$1(ScalametaTokenizer.scala:17)
	scala.collection.concurrent.TrieMap.getOrElseUpdate(TrieMap.scala:962)
	scala.meta.internal.tokenizers.ScalametaTokenizer.tokenize(ScalametaTokenizer.scala:17)
	scala.meta.internal.tokenizers.ScalametaTokenizer$$anon$2.apply(ScalametaTokenizer.scala:322)
	scala.meta.tokenizers.Api$XtensionTokenizeDialectInput.tokenize(Api.scala:22)
	scala.meta.tokenizers.Api$XtensionTokenizeInputLike.tokenize(Api.scala:13)
	scala.meta.internal.parsers.ScannerTokens$.apply(ScannerTokens.scala:917)
	scala.meta.internal.parsers.ScalametaParser.<init>(ScalametaParser.scala:34)
	scala.meta.parsers.Parse$$anon$1.apply(Parse.scala:36)
	scala.meta.parsers.Api$XtensionParseDialectInput.parse(Api.scala:22)
	scala.meta.internal.semanticdb.scalac.ParseOps$XtensionCompilationUnitSource.toSource(ParseOps.scala:15)
	scala.meta.internal.semanticdb.scalac.TextDocumentOps$XtensionCompilationUnitDocument.toTextDocument(TextDocumentOps.scala:179)
	scala.meta.internal.pc.SemanticdbTextDocumentProvider.textDocument(SemanticdbTextDocumentProvider.scala:54)
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$semanticdbTextDocument$1(ScalaPresentationCompiler.scala:462)
```
#### Short summary: 

file%3A%2F%2F%2FC%3A%2FUsers%2FPR%2FOneDrive%2FDocuments%2FScala%2FLabsheet02.scala:48: error: Not one of: `$$', `$'ident, `$'this, `$'BlockExpr, `$'_
        println(s"$")
                  ^