error id: file:///C:/Users/PR/OneDrive/Documents/Scala/scala_pattern_matching/Linkedlist.scala:[955..956) in Input.VirtualFile("file:///C:/Users/PR/OneDrive/Documents/Scala/scala_pattern_matching/Linkedlist.scala", "object Linkedlist{
    sealed trait LinkedList[+A] //define the linkedlist
    case object Empty extends LinkedList[Nothing]
    case class Node[+A](value: A, next: LinkedList[A]) extends LinkedList[A]

    //function to calculate the length of the linkedlist
    def length[A](list: LinkedList(A)): Int = list match {
        case Empty => 0
        case Node(_, next) => 1 + length(next)
    }

    //function to calculate the sum of elements in the linkedlist
    def sum(list: LinkedList[Int]): Int = list match{
        case Empty => false
        case Node(value, next) => value + sum(next)
    }

    //function to find an element in the linkedlist
    def find[A](list: LinkedList[A], elem: A): Boolean = list match{
        case Empty => false
        case Node(value, next) =>
            if (value == elem) true
            else find(next, elem)
    }

    //function to print all elements in the linkedlist
    def 
}")
file:///C:/Users/PR/OneDrive/Documents/Scala/scala_pattern_matching/Linkedlist.scala
file:///C:/Users/PR/OneDrive/Documents/Scala/scala_pattern_matching/Linkedlist.scala:28: error: expected identifier; obtained rbrace
}
^
#### Short summary: 

expected identifier; obtained rbrace