package peter.cowsandbulls

import org.specs2.mutable.Specification

class MatcherSpec extends Specification {
  "Matcher" should {
    "Return expected number of bulls" in {
      Matcher(secret = Secret("1134"), guess = Guess("9914")).bulls must equalTo(1)
    }
  }
}
