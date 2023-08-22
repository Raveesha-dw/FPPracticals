package demo

object test2 {
  class rational(x: Int, y: Int) {
    def numer = x;

    def denom = y;

    def sub(other: rational): rational = {
      val newNumerator = numer * other.denom - other.numer * denom
      val newDenominator = denom * other.denom
      new rational(newNumerator, newDenominator)
    }
  }


  def main(args: Array[String]): Unit = {
    var x = new rational(3,4);
    var y = new rational(5,8);
    var z = new rational(2,7);
    var xsuby = x.sub(y);
    var xsubysubz = xsuby.sub(z);
    println("x - y - z: "+xsubysubz.numer+"/"+xsubysubz.denom);

  }

}
