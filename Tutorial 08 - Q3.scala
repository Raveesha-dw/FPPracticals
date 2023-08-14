package demo

object test3 {
  def main(args: Array[String]): Unit = {
    println(formatNames("Benny")(toUpper))
    println(formatNames("Saman")(toLower))
    println(formatNames("Niroshan")(str => toUpper(str.substring(0,2))+ toLower(str.substring(2,8))))
    println(formatNames("Kumara")(str => toUpper(str.substring(0,1))+ str.substring(1,5)+ toUpper(str.substring(5))))
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