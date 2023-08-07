package demo
import scala.io.StdIn.readInt

object test {
  def filterEvenNumbers(numList: List[Int]): List[Int] = {
    numList.filter(number => number%2 == 0)
  }

  def main(args: Array[String]): Unit = {
    print("Input number of integers: ");
    var size = readInt();
    var numbers = new Array[Int](size);

    println("Input numbers : ");
    var index = 0;
    for (index <- 0 to size-1){
      numbers(index) = readInt();
    }

    val intList: List[Int] = numbers.toList;
    val evenList = filterEvenNumbers(intList);
    println(evenList);
  }
}
