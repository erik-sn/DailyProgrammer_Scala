package exercies.easy

import exercises.easy.NonRepeatingYears
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner


@RunWith(classOf[JUnitRunner])
class NonRepeatingYearsTest extends FunSuite  {
  val test = new NonRepeatingYears

  test("None")(assert(test.getNonRepeatingYears(1999, 2007) == List()))
  test("Exclude 1981")(assert(test.getNonRepeatingYears(1980, 1987) == List(1980, 1982, 1983, 1984, 1985, 1986, 1987)))
}
