package advent_of_code

import scala.math.BigDecimal.RoundingMode

object DivideChars {
  def countLettersNumbers(s: String) = {

       if(s.exists(_.isDigit)) {
         BigDecimal(s.count(_.isLetter).toDouble / s.count(_.isDigit)).setScale(0, RoundingMode.HALF_UP).toInt
       }


  }

  def main(args: Array[String]) {
    val s = "xyzy0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ"
    println(countLettersNumbers(s))
  }
}