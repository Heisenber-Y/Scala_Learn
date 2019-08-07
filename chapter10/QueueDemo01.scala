/**
  * Created by yml on 2019/8/7.
  */
import scala.collection.mutable
object QueueDemo01 {
  def main(args: Array[String]) {
    //创建队列
    val q1= new mutable.Queue[Int]
    println(q1)
  q1 += 9
println("q1="+q1)
    q1++=List(4,5,7)
    println("q1="+q1)
//dequeue  20190807

  }
}
