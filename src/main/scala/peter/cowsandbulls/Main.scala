package peter.cowsandbulls

import scala.io.StdIn

object Main {
  def main(args: Array[String]): Unit = {
    val secret = SecretGenerator()
//    val guess = Guess("3456")
    val guess = Guess(StdIn.readLine("Enter your digit guess"))

    println(secret)
    val output = Matcher(secret = secret, guess = guess)
    println(output)

  }

}
