//Zadanie1
object Zad1 {
  def main(args: Array[String]) = {
    
  val z = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela")
 
  //a
  println("Zadanie a")
  println
  for(s <- z) 
  yield println(s)
  println
  
  //b
  println("Zadanie b")
  println
  for(s <- z if s.charAt(0)=='P') 
  yield println(s)
  println
  
  //c
  println("Zadanie c")
  println
  z.foreach(println)
  println
  
  //d
  
  println("Zadanie d")
  println
  var i = 0
  val s = z.size
  while(i<s){
    println(z(i))
    i += 1
  }
  println
  
  //e
  println("Zadanie e")
  println
  def printList(myList: List[Any]) { if(! myList.isEmpty) {
    println(myList.head)
printList(myList.tail)}}

  printList(z)
  println
  //f
  println("Zadanie f")
  println
  def printList2(myList: List[Any]) { if(! myList.isEmpty) {
    println(myList.head)
printList2(myList.tail)}}

  printList2(z.reverse)
  println
  //g
  println("Zadanie g")
  println
  //FoldLeft
  println("foldLeft")
  val e = z.foldLeft(new StringBuilder){ (sb, s) => sb append s + " " }.toString
  println(e)
  println
  //FoldRight
  println("foldRight")
  val f = z.foldRight(new StringBuilder){ (t, u) => u append t + " " }.toString
  println(f)
  println
  //h
  println("Zadanie h")
  //Metody foldl wypisując tylko dni z nazwami zaczynającymi się na „P”
  //val g = z.foldLeft(new StringBuilder){ 
 //   if(s.charAt(0)=='P')
    //(sb, s ) => sb  append  s + " "  }.toString
    
    val h = z.foldLeft("") 
    { (acc, i) => if(i.charAt(0)=='P') acc+" "+i else acc }
    println(h)
}
  
  
  
   
}