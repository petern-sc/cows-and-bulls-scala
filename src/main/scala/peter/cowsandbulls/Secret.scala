package peter.cowsandbulls

case class Secret(value: String) extends AnyVal

// Companion object
//object Secret {
//  def fromValue(value: String): Option[Secret] = if (value.length == 4) Some(Secret(value)) else None
//}