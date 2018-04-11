package Zadanie4

object Zadanie4 {
  def main(args: Array[String]): Unit = {
    val mapa = Map(("Skarpetki", 12.3),("Apaszka", null), ("Bluzka", 36.0), ("Sukienka", 26.5))
   
    val a1 = mapa.getOrElse("Skarpetki", "Default")
    val a2 = mapa.getOrElse("Nie ma", "Default")
    println(a1)
    println(a2)
  }
  
}