package demo

import scala.io.StdIn.{readFloat}

object test {
  def interest(amount:Double): Double= amount match {
    case amount if amount <= 20000 => amount * 0.02
    case amount if amount <= 200000 => amount * 0.04
    case amount if amount <= 2000000 => amount * 0.035
    case _ => amount * 0.065
  }

  def main(args: Array[String]): Unit = {
    println("Enter the deposit amount : ")
    var input=readFloat()
    var inter = interest(input)
    println("Annual interest for "+input+" = "+inter)
  }

}
