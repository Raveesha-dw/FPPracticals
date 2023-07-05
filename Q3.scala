package demo

object test3 {
  def main(args: Array[String]): Unit = {
    println((formatNames("Benny")(toUpper)))
    println((formatNames("Saman")(toLower)))
    println((formatNames("Kumara")(toUpper)))
  }
  def toUpper(str:String):String={
    str.toUpperCase()
  }

  def toLower(str:String):String={
    str.toLowerCase()
  }

  def formatNames(name:String)(formatFunc: String => String):String = {
    formatFunc(name)
  }
}