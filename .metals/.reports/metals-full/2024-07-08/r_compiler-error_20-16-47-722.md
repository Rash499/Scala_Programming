file:///C:/Users/PR/OneDrive/Documents/Scala/Labsheet_04/Question03.scala
### file%3A%2F%2F%2FC%3A%2FUsers%2FPR%2FOneDrive%2FDocuments%2FScala%2FLabsheet_04%2FQuestion03.scala:19: error: illegal character '\u00a0'
  }
^

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 2.13.12
Classpath:
<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.12\scala-library-2.13.12.jar [exists ]
Options:



action parameters:
uri: file:///C:/Users/PR/OneDrive/Documents/Scala/Labsheet_04/Question03.scala
text:
```scala
def toUpper(s: String): String = s.toUpperCase

  def toLower(s: String): String = s.toLowerCase

  def formatNames(name: String)(formatFunction: String => String): String = {
    formatFunction(name)
  }

  def main(args: Array[String]): Unit = {
    val benny = formatNames("Benny")(toUpper)
    val niroshan = formatNames("Niroshan")(name => name.take(2).toUpperCase + name.drop(2))
    val saman = formatNames("Saman")(toLower)
    val kumara = formatNames("Kumara")(name => name.take(name.length - 1) + name.last.toUpper)

    println(benny)      // Output: BENNY
    println(niroshan)   // Output: NIroshan
    println(saman)      // Output: saman
    println(kumara)     // Output: KumarA
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
	scala.meta.internal.tokenizers.LegacyScanner.fetchOther$1(LegacyScanner.scala:439)
	scala.meta.internal.tokenizers.LegacyScanner.fetchToken(LegacyScanner.scala:443)
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

file%3A%2F%2F%2FC%3A%2FUsers%2FPR%2FOneDrive%2FDocuments%2FScala%2FLabsheet_04%2FQuestion03.scala:19: error: illegal character '\u00a0'
  }
^