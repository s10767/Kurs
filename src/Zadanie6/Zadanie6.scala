package Zadanie6

object Zadanie6 {
  def main(args: Array[String]): Unit = {
  class KontoBankowe(stanKonta: Double){
    var stanKonta2: Double = stanKonta
    def this() = this(0)
    
    def wplata(kwotaWplaty: Double){
      stanKonta2 = kwotaWplaty + stanKonta2
    }
    def wyplata(kwotaWyplaty: Double){
      if(kwotaWyplaty > stanKonta2){println("NIE DA SIĘ")}
      else{
      stanKonta2 = stanKonta2 - kwotaWyplaty
      }
    }
    
   
  }
   val konto1 = new KontoBankowe()
    val konto2 = new KontoBankowe(100.00)
    println(konto1.stanKonta2)
    println(konto2.stanKonta2)
    konto1.wplata(300)
    konto2.wyplata(400)
    konto2.wyplata(66)
    println()
    println("Obecny stan konta")
    println(konto1.stanKonta2)
    println(konto2.stanKonta2)
    println()
    println("Początkowy stan konta")
  }
  
}