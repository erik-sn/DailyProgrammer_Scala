package exercies.easy

import exercises.easy.DiceRoller
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner


@RunWith(classOf[JUnitRunner])
class RollDiceTest extends FunSuite  {
  val test = new DiceRoller

//  test("None")(assert(test.rollDice(10d6+1) == List()))
//  test("Exclude 1981")(assert(test.getNonRepeatingYears(1980, 1987) == List(1980, 1982, 1983, 1984, 1985, 1986, 1987)))
}
