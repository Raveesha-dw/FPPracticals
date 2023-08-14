package demo
import scala.io.StdIn.readDouble

object test {
  def interest:Double => Double = {
      case amount if amount <= 20000 => amount * 0.02
      case amount if amount <= 200000 => amount * 0.04
      case amount if amount <= 2000000 => amount * 0.035
      case amount => amount * 0.065
  }


  def main(args: Array[String]): Unit = {
    print("Enter deposit amount : ");
    var amount = readDouble();
    var in =  interest(amount);
    println(s"Annual Interest : $in");
  }

}
