/**
  * Created by yml on 2019/8/12.
  */
object StreamDemo01 {
  def main(args: Array[String]) {
       def numsForm(n:BigInt):Stream[BigInt]= n #:: numsForm(n+1)
    val stream1: Stream[BigInt] = numsForm(1)
    println(stream1)
    println("head="+ stream1.head)
    println(stream1.tail)
    println(stream1)
    println("====")
    //看一个应用案例
    def multi(x:BigInt) : BigInt = {
      x * x
    }
    println(numsForm(5).map(multi)) //(25, ?)

  }


}
