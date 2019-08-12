/**
  * Created by yml on 2019/8/12.
  */
object ParDemo01 {
  def main(args: Array[String]) {
    (1 to 5).foreach(println(_))
    println()
    //parallel 并行
    //这里输出的结果是无序的，说明是将println任务分配给不同cpu
    (1 to 5).par.foreach(println(_))
  }
}
