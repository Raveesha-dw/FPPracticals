package demo

object test{
class rational(x: Int, y: Int) {
  def numer = x;
  def denom = y;

  def neg : rational = new rational(-numer,denom);
}

  def main(args: Array[String]): Unit = {
    var r = new rational(1,3);
    println("Rational number: "+r.numer+"/"+r.denom);
    println("Converted to negative");
    var negR = r.neg;
    println("Rational number: "+negR.numer+"/"+negR.denom);
  }

}
