object Linkedlist{
    sealed trait LinkedList[+A] //define the linkedlist
    case object Empty extends LinkedList[Nothing]
    case class Node[+A](value: A, next: LinkedList[A]) extends LinkedList[A]

    //function to calculate the length of the linkedlist
    def length[A](list: LinkedList[A]): Int = list match {
        case Empty => 0
        case Node(_, next) => 1 + length(next)
    }

    //function to calculate the sum of elements in the linkedlist
    def sum(list: LinkedList[Int]): Int = list match{
        case Empty => 0
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
    def printlist[A](list: LinkedList[A]): Unit = list match{
        case Empty => println("End of the list")
        case Node(value, next) =>
            println(value)
            printlist(next)
    }

    def main(args: Array[String]): Unit = {
        //Create a linked list: 1 -> 2 -> 3 -> 4 -> Empty
        val list: LinkedList[Int] = Node(1, Node(2, Node(3, Node(4, Empty))))

        println("Length of the list: " + length(list)) //4
        println("Sum of elements: " + sum(list)) //10
        println("Find element 3: " + find(list, 3)) //true
        println("Find element 5: " + find(list, 5)) //false

        println("Printing list elements:")
        printlist(list) //1, 2, 3, 4
    }
}