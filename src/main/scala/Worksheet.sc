import scala.util.Random

def rollDice(input: String): Int = {
  val split1 = input.split("d")
  val split2 = split1(1).split("[\\+-]")
  var a = 1
  if(!split1(0).trim.isEmpty) a = split1(0).toInt
  var c = 0
  if(!split2(1).trim.isEmpty) c = split2(1).toInt
  val b = split2(0).toInt

  val s = List.fill(a)(Random.nextInt(b)).sum
  if(split2.contains("+")) s + c; else s - c
}

rollDice("10d6-2")