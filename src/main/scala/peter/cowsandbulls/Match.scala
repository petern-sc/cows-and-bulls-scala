package peter.cowsandbulls

case class Match(cows:Int, bulls: Int) {
  val isFullMatch = (bulls == 4)
}
