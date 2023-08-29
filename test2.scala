package demo

object test2 {
    def countLetterOccurrences(words: List[String]): Int = {
      val letterCounts = words.map(word => word.length)
      val totalLetterCount = letterCounts.reduce((count1, count2) => count1 + count2)
      totalLetterCount
    }

    def main(args: Array[String]): Unit = {
      val words = List("apple", "banana", "cherry", "date")
      val totalLetterCount = countLetterOccurrences(words)
      println(s"Total count of letter occurrences: $totalLetterCount")
    }
  }
