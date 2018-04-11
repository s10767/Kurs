package Zadanie3

object Zadanie3 {
  def main(args: Array[String]): Unit = {
    
  val k = ("Krotka",4,5.88)
  
  def krotka(Tuple:(String,Int,Double))  {
   
    Tuple.productIterator.foreach(println)
  }
  krotka(k)
  }
}