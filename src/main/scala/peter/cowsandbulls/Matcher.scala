package peter.cowsandbulls

object Matcher {

  def apply(secret: Secret, guess: Guess): Match =
    Match(
      bulls = getBulls(secret = secret.value, guess = guess.value),
      cows = getCows(secret = secret.value, guess = guess.value)
    )

  private def getBulls(secret: String, guess: String): Int = {
    val zipped: Seq[(Char, Char)] = secret.zip(guess)
    val matches: Seq[Boolean] = zipped.map {
      case (secretChar, guessChar) => secretChar == guessChar
    }
    matches.count(x => x)
  }

  private def getCows(secret: String, guess: String): Int = {
    val matches = for {
      (s, sIndex) <- secret.zipWithIndex
      (g, gIndex) <- guess.zipWithIndex
    } yield (s == g && sIndex != gIndex)

    matches.count(identity)
  }

}

