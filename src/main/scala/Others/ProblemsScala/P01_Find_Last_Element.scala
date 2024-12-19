package Others.ProblemsScala
import scala.io._

//find the last element of a list.
//     Example:
//     scala> last(List(1, 1, 2, 3, 5, 8))
object P01_Find_Last_Element extends App{
def lastRecursively[A](ls:List[A]) : A = ls match {
  case h :: Nil => h
  case _ :: tail => lastRecursively(tail)
  case _ => throw new NoSuchElementException
}
  def lastButOneElementRecursive[A](ls : List[A]) : A = ls match {
    case h :: _ :: Nil => h
    case _ :: tail => lastButOneElementRecursive(tail)
    case _ => throw new NoSuchElementException
  }

//  def compressRecursive[A](ls: List[A]): List[A] = ls match {
//    case Nil       => Nil
//    case h :: tail => h :: compressRecursive(tail.dropWhile(_ == h))
//  }
//
//  println(compressRecursive(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))

  def pack[A](ls: List[A]): List[List[A]] = {
    if (ls.isEmpty) List(List())
    else {
      val (packed, next) = ls span { _ == ls.head }
      if (next == Nil) List(packed)
      else packed :: pack(next)
    }
  }
  println(pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  //println(lastRecursively(List(1, 1, 2, 3, 5, 8)))
  //println(lastButOneElementRecursive(List(1, 1, 2, 3, 5, 8)))
}
