object Twofer {
  def twofer(name: String=""): String = 
    s"One for ${if(name.nonEmpty) name else "you"}, one for me."
}
