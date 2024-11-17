package advent_of_code
import math._
import scala.util._
import scala.io.StdIn._

object Horse_Racing_Duals extends App{
  val n = readLine.toInt
  var inputs : List[Int] = List.empty
  for(i <- 0 until n) {
    val pi = readLine.toInt
    inputs = inputs.:+(pi).sorted
  }
  /*val smallestDiff = inputs.zip(inputs.tail).map {
    case (a, b) => b - a
  }.filter(_ > 0).min
*/

  var smallestDiff = Int.MaxValue

  for (i <- 0 until inputs.length - 1) {
    val diff = inputs(i + 1) - inputs(i)
    if (diff < smallestDiff && diff > 0) {
      smallestDiff = diff
    }
  }
  println(smallestDiff)
}
