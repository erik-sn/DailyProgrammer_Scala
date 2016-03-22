package exercises.easy

import scala.collection.mutable.ListBuffer

/**
  This challenge comes to us from user skeeto
  Write a program to count the number years in an inclusive range of years that have no repeated digits.
  For example, 2012 has a repeated digit (2) while 2013 does not. Given the range [1980, 1987], your program would return 7
  (1980, 1982, 1983, 1984, 1985, 1986, 1987).
  Bonus: Compute the longest run of years of repeated digits and the longest run of years of non-repeated digits for [1000, 2013].
*/
class NonRepeatingYears {

  /**
    * Given a start and end year, return a list of all years where no digits repeat
    * @param start beginning year
    * @param end ending year
    * @return list of years matching criteria
    */
  def getNonRepeatingYears(start: Int, end: Int): List[Int] = {
    List.range(start, end + 1).filter(year => year.toString.toList.distinct.size == year.toString.toList.size)
  }

}
