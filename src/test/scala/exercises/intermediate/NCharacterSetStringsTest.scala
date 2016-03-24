package exercises.intermediate


import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner


@RunWith(classOf[JUnitRunner])
class SleepCycleEstimatorTest extends FunSuite  {
  val challenge = new NCharacterSetStrings
  val path = "C:\\programming\\Scala\\DailyProgrammer\\src\\main\\scala\\files\\enable1.txt"

  test("3 < 4")(assert(challenge.ncset("aacaabbabccc", 4)))
  test("3 > 2")(assert(!challenge.ncset("aacaabbabccc", 2)))
  test("10442 matches in English language where n = 4")(assert(challenge.ncsetWords(path, 4) == 10442))
}
