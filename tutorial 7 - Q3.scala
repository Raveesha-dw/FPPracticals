package demo

import scala.io.StdIn.readInt

object test3 {
  def checkDivisible(a: Int): Boolean = {
    if (a <= 1) false
    else if (a <= 3) true
    else {
      !(2 to Math.sqrt(a).toInt).exists(a % _ == 0)
    }
  }

  def filterPrime(numList: List[Int]): List[Int] = {
    numList.filter(checkDivisible);
  }

  def main(args: Array[String]): Unit = {
    print("Input number of integers: ");
    var size = readInt();
    var numbers = new Array[Int](size);

    println("Input numbers : ");
    var index = 0;
    for (index <- 0 to size - 1) {
      numbers(index) = readInt();
    }

    val intList: List[Int] = numbers.toList;
    var primeList = filterPrime(intList);
    println(primeList);
  }

}