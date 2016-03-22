package exercies.easy

import exercises.easy.SleepCycleEstimator
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner


@RunWith(classOf[JUnitRunner])
class SleepCycleEstimatorTest extends FunSuite  {
  val Sleep = new SleepCycleEstimator

  test("Returns 7 strings, REM times")(assert(Sleep.getSleepTimes("6:15 AM").size == 7))
  test("Returns 7 strings, Sleep times")(assert(Sleep.getSleepTimes("6:15 AM").size == 7))

  test("Returns Correct Values, REM Start")(assert(Sleep.getSleepTimes("6:15 AM")(0) == "7:45 PM"))
  test("Returns Correct Values, REM End")(assert(Sleep.getSleepTimes("6:15 AM")(6) == "4:45 AM"))
  test("Returns Correct Values, REM Delay Start")(assert(Sleep.getSleepTimes("6:15 AM", 10)(0) == "7:55 PM"))
  test("Returns Correct Values, REM Delay End")(assert(Sleep.getSleepTimes("6:15 AM", 10)(6) == "4:55 AM"))

  test("Returns Correct Values, Sleep Start")(assert(Sleep.getWakeTimes("9:15 PM")(0) == "7:45 AM"))
  test("Returns Correct Values, Sleep End")(assert(Sleep.getWakeTimes("9:15 PM")(6) == "10:45 PM"))
}
