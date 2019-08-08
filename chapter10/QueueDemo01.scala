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
    //Queue 删除和假如队列元素
//dequeue  从队列的头部取出数据 q1 本身会变
  val dequeue: Int = q1.dequeue()
    println("dequeue="+dequeue+"q1="+q1)
    //enqueue 入队列 ，默认是从队列的尾部加入 redis
    val enqueue: Unit = q1.enqueue(100,10,100,888)
    println("q1="+q1)

   println("======= 返回队列的元素")
   //获取队列的第一个元素   对q1 没有影响
    println(q1.head)
    //获取队列的最后一个元素   对q1没有影响
    println(q1.last)

    //取出队尾的数据，即返回除了第一个意外的剩余的元素
    println(q1.tail)
    println(q1.tail)



  }



}
