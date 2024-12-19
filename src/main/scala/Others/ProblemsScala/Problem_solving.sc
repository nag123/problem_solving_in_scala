//def checkPalindrome[A](ls : List[A]) : Boolean = ls == ls.reverse
//var listofvaluesforpalindrome = List(1,4,7,4,1)
//var listofvaluesfornonpalindrome = List(1,4,7,4,1,6)
//println(checkPalindrome(listofvaluesforpalindrome))
//println(checkPalindrome(listofvaluesfornonpalindrome))

//flatten a nestedList
//def flattenNestedList(ls : List[Any]) : List[Any] = ls flatMap
//  {
//    case ms : List[_] => flattenNestedList(ms)
//    case e => List(e)
//  }
//
//println(flattenNestedList(List(List(1, 1), 2, List(3, List(5, 8)))))

// Standard recursive.
def compressRecursive[A](ls: List[A]): List[A] = ls match {
  case Nil       => Nil
  case h :: tail => h :: compressRecursive(tail.dropWhile(_ == h))
}

println(compressRecursive(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))

// Functional.
def dropFunctional[A](n: Int, ls: List[A]): List[A] =
  ls.zipWithIndex filter { v => (v._2 + 1) % n != 0 } map { _._1 }
