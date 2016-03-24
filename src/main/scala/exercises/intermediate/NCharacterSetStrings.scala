package exercises.intermediate

import scala.io.Source


/**
  Write a function that takes a string s and an integer n, and returns whether or not the string s contains at most n different characters.
  For example, ncset("aacaabbabccc", 4) would return true, because it contains only 3 different characters, 'a', 'b', and 'c', and 3 ≤ 4.
  For how many English words (yes, it's time for this dictionary again!) does ncset(word, 4) hold?
  */
class NCharacterSetStrings {

  /**
    * Check to see if the input string contains n or less unique characters
    * @param input - input string
    * @param n - number of unique characters
    * @return - Boolean true or false
    */
  def ncset(input: String, n: Int) = input.toList.distinct.size <= n

  /**
    * Given a file, parse it line by line and test to see if each line meets the ncset criteria
    * as specified by the n input. Return the count of lines/words that do.
    * @param path - path to a .txt file containing one word per line
    * @param n - number of unique characters
    * @return - Int count of words that match criteria
    */
  def ncsetWords(path: String, n: Int): Int = {
    var sum = 0
    Source.fromFile(path).getLines().foreach(str => if(ncset(str, 4)) sum += 1); sum
  }

}
