import scala.collection.immutable.IndexedSeq
import scala.collection.parallel.immutable.ParSeq

/**
  * Created by yml on 2019/8/12.
  */
object ParDemo02 {
  def main(args: Array[String]) {
    val rsult1= (0 to 100).map{case _=>Thread.currentThread.getName}.distinct
    val result2= (0 to 100).par.map{case _ =>Thread.currentThread.getName}.distinct
println(rsult1)
    println("===")
println(result2)
  }
}
