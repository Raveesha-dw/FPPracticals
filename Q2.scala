package demo
import scala.io.StdIn
import scala.io.StdIn.readInt

object test2 {
  def patternMatching(num:Int): Unit= num match {
    case num if num<0 => println("Negative is input")
    case num if num==0 => println("Zero is input")
    case num if (num%2)==0 => println("Even number is given")
    case num if (num%2)!=0 => println("Odd number is given")
  }

  def main(args: Array[String]): Unit = {
    println("Enter an integer: ")
    val input = StdIn.readInt()
    patternMatching((input))
  }

}
