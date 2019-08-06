package mixin

/**
  * Created by yml on 2019/8/6.
  */
object MixImSeq {
  def main(args: Array[String]) {
println("==================")
  //val ff2: KK with CC with DD = new KK with CC with DD
    //println(ff2)
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
