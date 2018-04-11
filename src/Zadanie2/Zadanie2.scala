

package Zadanie2

object Zadanie2 {
  def main(args: Array[String]) = {
  val mapa = Map(("Skarpetki", 12.3), ("Bluzka", 36.0), ("Sukienka", 26.5))
  val newMapa = mapa map {case (key, value) => (key, value - 0.1*value)}
  println(newMapa("Bluzka"))
  }
}