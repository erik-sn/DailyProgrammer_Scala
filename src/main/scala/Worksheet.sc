val x = new Rational(1, 3)
val y = new Rational(5, 7)
val z = new Rational(3, 2)

x.less(y)
x.subtract(y).subtract(z)

val strange = new Rational(1, 0)
strange.add(strange)

class Rational(x: Int, y: Int) {
  require(y > 0, "Denominator must be a positive number")

  private def gcd(a: Int, b: Int): Int = if(b == 0) a else gcd(b, a % b)
  private val g = gcd(x, y)

  def numer = x / g
  def denom = y / g

  def less(that: Rational) = numer * that.denom < that.numer * denom

  def max(that: Rational) = if(this.less(that)) that else this

  def add(that: Rational) =
    new Rational(
    numer * that.denom + that.numer * denom,
    denom * that.denom)

  def subtract(that: Rational) =
    new Rational(
      numer * that.denom - that.numer * denom,
      denom * that.denom
    )

  def neg = new Rational( -1 * numer, denom)

  override def toString = s"Rational($numer, $denom)"
}