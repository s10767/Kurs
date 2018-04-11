package Zadanie7

object Zadanie7{

   def main(args: Array[String]): Unit = {
 case class Osoba(val imie: String, val nazwisko: String)
   
  def przywitanie(p: Osoba) = p match {
    case Osoba("Dave", "Gahan") => println("Hi Dave!")
    case Osoba("Martin", "Gore") => println("Hi Martin!")
    case Osoba("Andrew", "Fletcher") => println("Hi Andy!")
    case Osoba(imie,nazwisko) => println(s"Hi $imie!")}
  
 val dave = new Osoba("Dave","Gahan")
  val martin = new Osoba("Martin","Gore")
  val andy = new Osoba("Andrew","Fletcher")
  val alan = new Osoba("Alan","Wilder")
 
   
  
  przywitanie(dave)
przywitanie(martin)
przywitanie(andy)
przywitanie(dave)
przywitanie(alan)
}
  
}
 
 
 

