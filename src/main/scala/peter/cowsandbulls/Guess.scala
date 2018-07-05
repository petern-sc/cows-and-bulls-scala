package peter.cowsandbulls

case class Guess(value: String) extends AnyVal

object Guess{
  def fromValue(value: String): Option[Guess] = {
    val regex = "\\d*".r
    if (value.length == 4 && regex.findFirstIn(value).isDefined) {
      Some(Guess(value))
    } else {
      None
    }
  }
}
