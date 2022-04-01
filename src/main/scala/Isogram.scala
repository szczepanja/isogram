object Isogram extends App {

  def isIsogram(str: String): Boolean = {
    val replaceSymbols = str.replaceAll("[ -]", "")
    replaceSymbols.toSet.size == replaceSymbols.length
  }

}
