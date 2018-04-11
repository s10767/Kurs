package Zadanie5

object Zadanie5 {
  def main(args: Array[String]): Unit = {
    
  def przywitanie(p: String) = p match {
    case "Poniedziałek" | "Wtorek" | "Środa" | "Czwartek" | "Piątek" => println("Praca :(")
    case "Niedziela" | "Sobota" => println("Weekend! :)")
    case _ => println("Nie ma takiego dnia")}
  
  przywitanie("Tak")
  przywitanie("Poniedziałek")
  przywitanie("Wtorek")
  przywitanie("Środa")
  przywitanie("Czwartek")
  przywitanie("Piątek")
  przywitanie("Sobota")
  przywitanie("Niedziela")
  przywitanie("Nie")
  }
}
