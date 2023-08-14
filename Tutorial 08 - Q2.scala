package demo

import scala.io.StdIn.readInt

object test2 {
  def patternMatching : Int => Unit = {
    case num if num < 0 => println("Negative")
    case num if num==0 => println("Zero")
    case num if num%2 == 0 => println("Even")
    case num if num%2 != 0 => println("Odd")
  }

  def main(args: Array[String]): Unit = {
    print("Input the integer : ");
    var int = readInt();

    patternMatching(int);
  }

}
