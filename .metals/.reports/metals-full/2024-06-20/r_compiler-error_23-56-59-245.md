file:///C:/Users/PR/OneDrive/Documents/Scala/scala_pattern_matching/program_1.scala
### java.nio.file.InvalidPathException: Illegal char <:> at index 3: jar:file:///C:/Users/PR/AppData/Local/Coursier/cache/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.12.19/scala-library-2.12.19-sources.jar!/scala/collection/immutable/List.scala

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 2.13.12
Classpath:
<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.12\scala-library-2.13.12.jar [exists ]
Options:



action parameters:
offset: 743
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
        case _ => aNumber + "th"
    }

    //case class deconstruction
    case class Person(name: String, age: Int)
    val bob = Person("Bob",34)

    val bobGreeting = bob match {
        case Person(n, a) => s"Hi, my name is $n and I am $a years old"
    }

    //list extraction
    val numList = List(1,2,3,42)

    val musthavethree = numList match {
        case List(_, _, 3, somethingelse) => s"List has 3rd element 3, so the 4th element is $somethingelse"
    }

    //Haskell-like prepending
    val startwithone = numList m@@
    def main(args: Array[String]): Unit = {

    }
}
```



#### Error stacktrace:

```
java.base/sun.nio.fs.WindowsPathParser.normalize(WindowsPathParser.java:182)
	java.base/sun.nio.fs.WindowsPathParser.parse(WindowsPathParser.java:153)
	java.base/sun.nio.fs.WindowsPathParser.parse(WindowsPathParser.java:77)
	java.base/sun.nio.fs.WindowsPath.parse(WindowsPath.java:92)
	java.base/sun.nio.fs.WindowsFileSystem.getPath(WindowsFileSystem.java:232)
	java.base/java.nio.file.Path.of(Path.java:147)
	java.base/java.nio.file.Paths.get(Paths.java:69)
	scala.meta.io.AbsolutePath$.apply(AbsolutePath.scala:58)
	scala.meta.internal.metals.MetalsSymbolSearch.$anonfun$definitionSourceToplevels$2(MetalsSymbolSearch.scala:70)
	scala.Option.map(Option.scala:242)
	scala.meta.internal.metals.MetalsSymbolSearch.definitionSourceToplevels(MetalsSymbolSearch.scala:69)
	scala.meta.internal.pc.completions.MatchCaseCompletions.scala$meta$internal$pc$completions$MatchCaseCompletions$$sortSubclasses(MatchCaseCompletions.scala:368)
	scala.meta.internal.pc.completions.MatchCaseCompletions$MatchKeywordCompletion.contribute(MatchCaseCompletions.scala:305)
	scala.meta.internal.pc.CompletionProvider.filterInteresting(CompletionProvider.scala:380)
	scala.meta.internal.pc.CompletionProvider.safeCompletionsAt(CompletionProvider.scala:544)
	scala.meta.internal.pc.CompletionProvider.completions(CompletionProvider.scala:58)
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$complete$1(ScalaPresentationCompiler.scala:207)
```
#### Short summary: 

java.nio.file.InvalidPathException: Illegal char <:> at index 3: jar:file:///C:/Users/PR/AppData/Local/Coursier/cache/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.12.19/scala-library-2.12.19-sources.jar!/scala/collection/immutable/List.scala