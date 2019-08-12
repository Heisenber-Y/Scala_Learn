import scala.collection.immutable.IndexedSeq

/**
  * Created by yml on 2019/8/9.
  */
object ScanDemo01 {
  def main(args: Array[String]) {

    //普通函数

    def minus(n1:Int,n2:Int): Int ={
    n1-n2
    }

//(1,2,3,4,5) =>(5,4,3,-1,-5,-10) //Vector(5,4,3,-1,-5,-10)

   var i8= (1 to 5).scanLeft(5)(minus)
    println("i8="+i8)

    //普通函数
    def add(n1:Int,n2:Int): Int ={
      n1+n2
    }
   // (1,2,3,4,5)5=>(20,19,17,14,10,5)
    val i9: IndexedSeq[Int] = (1 to 5).scanRight(5)(add)
    println("i9="+i9)

  }
}
