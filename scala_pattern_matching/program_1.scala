
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
    val numberList = List(1,2,3,42)

    val musthavethree = numberList match {
        case List(_, _, 3, somethingelse) => s"List has 3rd element 3, so the 4th element is $somethingelse"
    }

    //Haskell-like prepending
    val startwithone = numberList match {
        case 1 :: tail => "list starts with one"
    }
    def main(args: Array[String]): Unit = {

    }
}