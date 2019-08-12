/**
  * Created by yml on 2019/8/9.
  */
object IteratorDemo01 {
  def main(args: Array[String]) {
  val it= List(1,2,3,4,5).iterator
/*  while (it.hasNext){
    println(it.next())
  }*/
for(item<-it){
  println("item="+item)
}

  }
}
