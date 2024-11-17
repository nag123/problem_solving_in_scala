package Others

import scala.io.StdIn.readLine
import scala.math.abs

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * */
object Consecutive_smallest_pair {
  def main(args: Array[String]): Unit = {
    val n = readLine.toInt
    var minValue = Integer.MAX_VALUE
    var difference = 0
    var prev = 0
    for (i <- 0 until n) {
      val pi = readLine.toInt
      if (i > 0) {
        if (abs(pi - prev) > 0) {
          difference = abs(pi - prev)
          if (difference < minValue) {
            minValue = difference
          }
        }
      }
      prev = pi
    }
    println(minValue)

  }
}
