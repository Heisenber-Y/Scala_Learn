import scala.collection.immutable.IndexedSeq

/**
  * Created by yml on 2019/8/12.
  */
object ViemDemo01 {
  def main(args: Array[String]) {
    //找到1-100中，数字倒序排列，和他本身相同的所有书
    def multiple(num:Int): Int ={
      num
    }
//如果这个书，逆序后和原来的相同，就返回true
    def eq(i:Int): Boolean ={
  println("eq被调用")
  i.toString.equals(i.toString.reverse)
}
  //没有使用view ，常规方式
    val filter: IndexedSeq[Int] = (1 to 100).filter(eq)
    println(filter)
  for(item <-filter){
  println("item="+item)
  }
  }
}
