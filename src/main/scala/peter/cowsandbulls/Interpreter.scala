package peter.cowsandbulls

class Interpreter(outputPartialMatch: Match => Unit, outputErrorMessage: String => Unit) {

  def interpret(guessOutcome: GuessOutcome): Unit = guessOutcome match {
    case PartialMatch(matchResult) => outputPartialMatch(matchResult)
    case InvalidGuess => outputErrorMessage("Nope, try again")
    case FullMatch => ()
  }
}

object Interpreter {
  def apply(): Interpreter = new Interpreter(
    outputPartialMatch = println, //formatting of match result can go here
    outputErrorMessage = println
  )
}
