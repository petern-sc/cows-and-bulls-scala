package peter.cowsandbulls

import scala.io.StdIn

object Main {
  def main(args: Array[String]): Unit = {
    val secret = SecretGenerator()
    println("Secret: "+ secret)
    println("Enter your digit guess")

    def readGuess(): String = StdIn.readLine("Guess: ")

    val result = Program(secret = secret, guessFunction = readGuess)

    val interpreter = Interpreter()

    result.foreach(interpreter.interpret)

    println("Good job")
  }

}
