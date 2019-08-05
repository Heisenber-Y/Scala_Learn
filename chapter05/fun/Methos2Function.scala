package fun

object Methos2Function {

  def main(args: Array[String]): Unit = {

  val dod = new Dod
  val f1 = dod.sum _
  println("f1="+f1(1,2))


  }
}
class Dod{
  def sum(n1:Int,n2:Int): Int ={
    n1+n2
  }
}
