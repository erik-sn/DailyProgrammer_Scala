package exercies.easy

import exercises.easy.DiceRoller
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner


@RunWith(classOf[JUnitRunner])
class RollDiceTest extends FunSuite  {
  val d = new DiceRoller
  test("Type")(assert(d.rollDice("10d6+1").isInstanceOf[Int]))
  test("Random")(assert(d.rollDice("10d6+1") != d.rollDice("10d6+1")))
}
