package Zadanie10

object Zadanie10 {
  def main(args: Array[String]) = {
    
  val firstList = List(-10,-3.0, -2.0, 5,7,9,122)
printList(firstList) 

  def printList(myList: List[Double]) {
    if(! myList.isEmpty) { 
      myList.foreach(println)
      println
      println("RESULT")
      println
   val myListNew = myList map (n=> if(n>= -5 && n <= 12) (Math.abs(n)))
   myListNew.filter(_ != ()).foreach(println)
    
      
     
      }
    }
  
  }
  
}