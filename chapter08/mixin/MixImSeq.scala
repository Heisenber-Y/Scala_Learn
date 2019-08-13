package mixin

/**
  * Created by yml on 2019/8/6.
  */
object MixImSeq {
  def main(args: Array[String]) {
println("==================")
  //val ff2: KK with CC with DD = new KK with CC with DD
    //println(ff2)
/*
* 1. 调用当前类的超类构造器
2. 第一个特质的父特质构造器
3. 第一个特质构造器
4. 第二个特质构造器的父特质构造器, 如果已经执行过，
就不再执行
5. 第二个特质构造器
6. .......重复 4,5 的步骤(如果有第 3 个，第 4 个特质)
* */
  val ff: FF = new FF
    println(ff)

  }
}

trait AA{
  println("AA")
}
trait BB extends AA{
  println("bb")
}
trait CC extends BB{
  println("CC")
}
trait DD extends BB{
  println("dd")
}

class EE{
  println("EEE")
}
class  FF extends EE with CC with DD{
  println("ff")
}
class KK extends EE{
  println("KK")
}
