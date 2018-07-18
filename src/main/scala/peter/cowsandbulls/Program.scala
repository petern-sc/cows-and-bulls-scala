package peter.cowsandbulls

object Program {
  def apply (guessFunction: () => String, secret: Secret): Stream[GuessOutcome] = {
    def readGuessStrings(): Stream[String] = guessFunction() #:: readGuessStrings()

    val guesses: Stream[String] = readGuessStrings()

    val actions: Stream[GuessOutcome] = guesses.map(Guess.fromValue).map {
      case Some(guess) => {
        val output = Matcher(secret = secret, guess = guess)
        if (output.isFullMatch) FullMatch else PartialMatch(output)
      }
      case None => InvalidGuess
    }

    actions.takeWhile(outcome => outcome != FullMatch)
  }
}

sealed trait GuessOutcome
case object FullMatch extends GuessOutcome
case class PartialMatch(matchResult: Match) extends GuessOutcome
case object InvalidGuess extends GuessOutcome