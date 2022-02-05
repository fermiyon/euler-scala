object Main extends App {
    println(compute.bir())
}

object compute {
  def bir():Int = {
    val ans = (1 to 999).filter(x => x % 3 == 0 || x % 5 == 0 ).sum
    return ans
  }
}