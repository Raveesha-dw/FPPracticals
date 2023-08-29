package demo

object test {
    def calculateAverage(temperatures: List[Double]): Double = {
      val fahrenheitTemperatures = temperatures.map(celsius => (celsius * 9/5) + 32)
      val totalFahrenheit = fahrenheitTemperatures.reduce((temp1, temp2) => temp1 + temp2)
      val averageFahrenheit = totalFahrenheit / fahrenheitTemperatures.length
      averageFahrenheit
    }

    def main(args: Array[String]): Unit = {
      val temperatures = List(0, 10, 20, 30)
      val averageFahrenheit = calculateAverage(temperatures)
      println(s"Average Fahrenheit temperature: $averageFahrenheit")
    }
  }