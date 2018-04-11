package Zadanie9

object Zadanie9 {
  def main(args: Array[String]) = {
    
  val firstList = List(3.0,20.0, 5.0,7.0,9.0,122.0)
printList(firstList) 

  def printList(myList: List[Double]) {
    if(! myList.isEmpty) { 
   val myListNew = myList map (n=>n+1)
   myListNew.foreach(println)
    }
      
     
      }
  
  }
  
}