file:///C:/Users/PR/OneDrive/Documents/Scala/scala_pattern_matching/program_1.scala
### file%3A%2F%2F%2FC%3A%2FUsers%2FPR%2FOneDrive%2FDocuments%2FScala%2Fscala_pattern_matching%2Fprogram_1.scala:25: error: Not one of: `$$', `$'ident, `$'this, `$'BlockExpr, `$'_
            s"List has 3rd element 3, so the 4th element is $"
              ^

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 2.13.12
Classpath:
<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.12\scala-library-2.13.12.jar [exists ]
Options:



action parameters:
uri: file:///C:/Users/PR/OneDrive/Documents/Scala/scala_pattern_matching/program_1.scala
text:
```scala
object program_1{

    //switch on steroids
    val aNumber = 44
    val ordinal = aNumber match{
        case 1 => "first"
        case 2 => "second"
        case 3 => "third"
        case_ => aNumber + "th"
    }

    //case class deconstruction
    case class Person(name: String, age: Int)
    val bob = Person("Bob",34)

    val bobGreeting = bob match {
        case Person(n, a) => s"Hi, my name is $n and I am $a years old"
    }

    //list extraction
    val numList = List(1,2,3,42)

    val musthavethree = numList match{
        case List(_,_,3,somethingelse) => 
            s"List has 3rd element 3, so the 4th element is $"
    }
    def main(args: Array[String]): Unit+{

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

file%3A%2F%2F%2FC%3A%2FUsers%2FPR%2FOneDrive%2FDocuments%2FScala%2Fscala_pattern_matching%2Fprogram_1.scala:25: error: Not one of: `$$', `$'ident, `$'this, `$'BlockExpr, `$'_
            s"List has 3rd element 3, so the 4th element is $"
              ^