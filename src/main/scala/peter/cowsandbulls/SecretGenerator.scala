package peter.cowsandbulls

import scala.util.Random

object SecretGenerator {
  def apply(): Secret = {
    val secretValue = (0 until 4).map(_ => randomDigit()).mkString
    Secret(secretValue)
  }

  private def randomDigit(): String = Random.nextInt(10).toString
}
