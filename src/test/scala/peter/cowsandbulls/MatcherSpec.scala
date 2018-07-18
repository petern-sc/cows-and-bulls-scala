package peter.cowsandbulls

import org.specs2.mutable.Specification

class MatcherSpec extends Specification {
  "Matcher" should {
    "Bulls" should {
      "Return expected number of bulls (1)" in {
        Matcher(secret = Secret("1134"), guess = Guess("9914")).bulls must equalTo(1)
      }
      "Return expected number of bulls (2)" in {
        Matcher(secret = Secret("1534"), guess = Guess("9514")).bulls must equalTo(2)
      }
    }
    "Cows" should {
      "Return expected number of cows (1)" in {
        Matcher(secret = Secret("1222"), guess = Guess("9914")).cows must equalTo(1)
      }
    }
  }
}
