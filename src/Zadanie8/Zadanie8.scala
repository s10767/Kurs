package Zadanie8

object Zadanie8 {
  def main(args: Array[String]) = {
    
  val firstList = List(3,0,20, 5,0,7,9,122)
printList(firstList) 

  def printList(myList: List[Int]) {
    if(! myList.isEmpty) { 
   for(s <- myList if s>0) 
  yield println(s)
    }
      
     
      }
  
  }
  
}