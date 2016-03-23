package exercises.easy

import scala.util.Random


/**
  In tabletop role-playing games like Dungeons & Dragons, people use a system called dice notation to represent a
  combination of dice to be rolled to generate a random number. Dice rolls are of the form AdB (+/-) C, and are calculated like this:
    1. Generate A random numbers from 1 to B and add them together.
    2. Add or subtract the modifier, C.
  If A is omitted, its value is 1; if (+/-)C is omitted, step 2 is skipped. That is, "d8" is equivalent to "1d8+0".
  Write a function that takes a string like "10d6-2" or "d20+7" and generates a random number using this syntax.
  */
class DiceRoller {

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


}
