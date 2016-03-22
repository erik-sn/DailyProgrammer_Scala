package exercises.easy

/**
  Challenge #100

  This challenge comes to us from nagasgura
  The human body goes through 90 minute sleep cycles during the night, and you feel more refreshed if you wake up at the end of a sleep cycle than if you wake up during a sleep cycle. The challenge is to make a program that takes a wake-up time and outputs the possible times to fall asleep so that you will wake up at the end of a sleep cycle.
  Example:
  Input (Wake-up time): 6:15 AM
  Output (when to go to sleep): 9:15 PM, 10:45 PM, 12:15 AM, or 1:45 AM
  Bonus 1: Be able to input a sleep time and output potential wake-up times
  Bonus 2: Account for how long it takes to fall asleep
*/

import java.time._
import java.time.format.DateTimeFormatter

class SleepCycleEstimator {

  /**
    * Return previous 7 times to hit a REM cycle given time to wake up
    * @param time time to fall asleep
    * @return List[String] with sleep times
    */
  def getSleepTimes(time: String): List[String] = {
    val formatter = DateTimeFormatter.ofPattern("h:mm a")
    val date = LocalTime.parse(time, formatter)
    getPastHours(date, List())
  }

  /**
    * Return previous 7 times to hit a REM cycle given time to wake up
    * @param time time to fall asleep
    * @param fallAsleepTime how long it takes to fall asleep
    * @return list with wake up times
    */
  def getSleepTimes(time: String, fallAsleepTime: Int): List[String] = {
    val formatter = DateTimeFormatter.ofPattern("h:mm a")
    val date = LocalTime.parse(time, formatter).plusMinutes(fallAsleepTime)
    getPastHours(date, List())
  }

  /**
    * Given a time to sleep up, return 7 next times to wake up and hit a REM cycle
    * @param time time to fall asleep
    * @return list of times to fall asleep
    */
  def getWakeTimes(time: String): List[String] = {
    val formatter = DateTimeFormatter.ofPattern("h:mm a")
    val date = LocalTime.parse(time, formatter)

    def getFutureHours(inputTime: LocalTime, times: List[String]): List[String] = {
      if(times.size == 7) times
      else {
        val newTime = inputTime.plusMinutes(90)
        getFutureHours(newTime, formatter.format(newTime) :: times)
      }
    }
    getFutureHours(date, List())
  }

  /**
    * Recursively build a list of 7 past times in 90 minute cycles
    * @param inputTime start time
    * @param times list of times in string format
    * @return list of 7 times in string format
    */
  def getPastHours(inputTime: LocalTime, times: List[String]): List[String] = {
    val formatter = DateTimeFormatter.ofPattern("h:mm a")
    if(times.size == 7) times
    else {
      val newTime = inputTime.minusMinutes(90)
      getPastHours(newTime, formatter.format(newTime) :: times)
    }
  }
}
