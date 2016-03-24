import java.io.File

import scala.io.Source

val path = "C:\\programming\\Scala\\DailyProgrammer\\src\\main\\scala\\files\\enable1.txt"
def ncset(input: String, n: Int) = input.toList.distinct.size <= n

def ncsetWords(path: String, n: Int) = {
  var sum = 0
  Source.fromFile(path).getLines().foreach(str => if(ncset(str, 4)) sum += 1); sum
}

ncsetWords(path, 4)
