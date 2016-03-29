package exercies.easy

import exercises.easy.PowerplantSimulation
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner


@RunWith(classOf[JUnitRunner])
class PowerplantSimulationTest extends FunSuite  {
  val d = new PowerplantSimulation
  test("Type")(assert(d.daysInActive(100).isInstanceOf[Int]))
  test("Only 3 day Maintenance")(assert(d.daysInActive(10) == 3))
  test("All tests")(assert(d.daysInActive(100) == 39))
}
